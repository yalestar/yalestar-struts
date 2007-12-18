package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Article;
import com.yalestar.model.Bandname;

import java.sql.SQLException;
import java.util.ArrayList;

public class OtherDAO {

    private int limit;

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public ArrayList getArticles() {

        ArrayList<Article> articles = null;
        try {
            articles = (ArrayList<Article>) smc.queryForList("getArticles");
            return articles;
        } catch (SQLException e) {
            System.err.println("bad -- getArticles");
        }
        return null;
    }


    public ArrayList getBandnames() {
        ArrayList<Bandname> bandnames = null;
        try {
            bandnames = (ArrayList<Bandname>) smc.queryForList("getBandnames");
            return bandnames;
        } catch (SQLException e) {
            System.err.println("bad -- getBandnames");
        }
        return null;
    }

    public ArrayList getBios() {

        ArrayList<Article> articles = null;
        try {
            articles = (ArrayList<Article>) smc.queryForList("getBios");
            return articles;
        } catch (SQLException e) {
            System.err.println("bad -- getBios");
        }
        return null;
    }
}
