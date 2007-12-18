package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Bandname;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;

public class BandnamesDAO extends BaseDAO {

    private static Logger logger = Logger.getRootLogger();

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public ArrayList getAllBandnames() {
        ArrayList bandnames = null;

        try {
            bandnames = (ArrayList) smc.queryForList("getAllBandnames");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void addBandname(Bandname bandname) {

        try {
            smc.insert("insertBandname", bandname);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
