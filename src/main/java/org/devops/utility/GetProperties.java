package org.devops.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {

    public String readProperties(String key)  {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/testDetails.properties"));
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}
