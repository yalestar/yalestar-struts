package com.yalestar.data;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.yalestar.util.Configurator;

import java.io.IOException;
import java.io.Reader;

public class SQLMapsConfigurator {

    private String map = Configurator.getProperty("sqlMapsConfig");

    private static SqlMapClient sqlMapClient;


    public static SqlMapClient getSQLMapper() {

        if (sqlMapClient == null) {
            new SQLMapsConfigurator().init();
            return sqlMapClient;
        } else {
            return sqlMapClient;
        }

    }

    private void init() {
        try {
            Reader reader = Resources.getResourceAsReader(map);
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();

        } catch (IOException e) {
            System.err.println("bad sql maps something");
            e.printStackTrace();
        }
    }
}