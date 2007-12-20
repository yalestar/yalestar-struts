package com.yalestar.util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurator extends HttpServlet {

    private String userName;

    private String password;

    private String dbName;

    private String dbHost;

    private String configFileName;

    public static Properties properties;

    private static Configurator configurator;


    /**
     * Builds up a Properties object based on the values in
     * config/appconfig.properties
     */
    private void loadAppProperties() {
        String cfgFile = getServletContext()
                .getRealPath("/") + "conf/YalestarConfig.properties";
        File cfg = new File(cfgFile);

        if (cfg.exists() && cfg.canRead()) {
            properties = new Properties();
            try {
                properties.load(new FileInputStream(cfg));

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Unable to load properties file " + cfgFile);
        }
    }


    /**
     * Get properties from anywhere else in the app
     *
     * @param property the property to get
     * @return the value of the requested property
     */
    public static String getProperty(String property) {
        if (properties == null) {
            return null;
        } else {
            return properties.getProperty(property);
        }
    }


    public void init() throws ServletException {
        super.init();
        loadAppProperties();
    }


    private void setConfigFile(String f) {
        this.configFileName = f;
    }


    private String getConfigFile() {
        return this.configFileName;
    }
}
