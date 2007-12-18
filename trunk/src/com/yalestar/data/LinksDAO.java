package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Link;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;

public class LinksDAO extends BaseDAO {

    private static Logger logger = Logger.getRootLogger();

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public void addLink(Link link) {
        try {
            smc.insert("addLink", link);
        } catch (SQLException e) {
            System.out.println("addLink error");
            e.printStackTrace();
        }
    }


    public void deleteLink(Link link) {

        try {
            smc.insert("deleteLink", link);
        } catch (SQLException e) {
            System.out.println("deleteLink error");
            e.printStackTrace();
        }
    }


    public void editLink(Link link) {

    }


    public Link getLinkByID(String ID) {
        try {
            smc.insert("getLinkByID", ID);
        } catch (SQLException e) {
            System.out.println("getLinkByID error");
            e.printStackTrace();
        }
        return null;
    }


    public ArrayList getAllLinks() {

        try {
            return (ArrayList) smc.queryForList("getAllLinks");

        } catch (SQLException e) {
            System.out.println("Error: getAllLinks query");
        }

        return null;
    }

}
