package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Entry;
import com.yalestar.util.Configurator;

import java.sql.SQLException;
import java.util.ArrayList;

public class EntriesDAO extends BaseDAO {

    private int limit;

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public void addEntry() {

    }


    public void deleteEntry(Integer id) {
        try {
            smc.delete("deleteEntry", id);
        } catch (SQLException e) {
            System.err.println("bad query-- deleteEntry");
        }
    }


    public void editEntry(Entry entry) {
        try {
            smc.update("updateEntry", entry);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Entry getEntryByID(String entryID) {
        Entry entry = null;

        try {
            entry = (Entry) smc.queryForObject("getEntryByID", entryID);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entry;
    }


    public ArrayList getAllEntries() {

        ArrayList entries = null;
        Integer entryCount = null;
        try {

            // allows to override config value (e.g. for archives)
            if (0 == this.limit) {
                entryCount = Integer.valueOf(Configurator.getProperty("mainPage.entries"));
            } else {
                entryCount = limit;
            }

            entries = (ArrayList) smc
                    .queryForList("selectAllEntries", entryCount);

        } catch (SQLException e) {
            System.err.println("bad query-- EntriesDAOgetAllEntries");
        }

        ArrayList comments = null;

        for (int i = 0; i < entries.size(); i++) {
            Entry entry = (Entry) entries.get(i);
            try {
                comments = (ArrayList) smc
                        .queryForList("getCommentsForEntry", entry.getID());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            entry.setComments(comments);
        }
        return entries;
    }


    public ArrayList getEntries(int count) {
        limit = count;
        return getAllEntries();
    }


    public ArrayList getArchives() {
        ArrayList<Entry> entries = null;

        try {
            entries = (ArrayList) smc.queryForList("getArchives");
        } catch (SQLException e) {
            System.err.println("bad query-- getArchives");
        }

        ArrayList comments = null;

        for (Entry entry : entries) {
            try {
                comments = (ArrayList) smc.queryForList("getCommentsForEntry", entry.getID());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            entry.setComments(comments);
        }
        return entries;

    }


    /**
     * Returns an ArrayList of links
     */
    public ArrayList getArchivesByYear(String year) {
        ArrayList comments = null;
        ArrayList archives = null;

        try {
            archives = (ArrayList) smc.queryForList("getArchivesByYear", year);

        } catch (SQLException e) {
            System.err.println("bad query-- getArchivesByYear");
            // TODO: get a 404 going here
            return null;
        }

        return archives;
    }
}
