package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Title;

import java.sql.SQLException;

public class TitleDAO extends BaseDAO {

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public Title getCurrentTitle() {

        try {
            return (Title) smc.queryForObject("getRandomTitle");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void setCurrentTitle(Title title) {

    }


    public void addTitle(String title) {

        try {
            smc.insert("addTitle", title);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
