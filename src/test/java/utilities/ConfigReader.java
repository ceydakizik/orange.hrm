package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {
        String pathOfFile="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(pathOfFile);
            properties=new Properties();
            properties.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}