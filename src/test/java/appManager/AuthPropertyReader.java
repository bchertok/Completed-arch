package appManager;

import lombok.Data;
import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AuthPropertyReader {
    private Properties properties = getProperties();


 @Getter
    private String clientusername = properties.getProperty("clientusername");
    @Getter
    private String clientpassword = properties.getProperty("clientpassword");
    @Getter
    private String bankusername = properties.getProperty("bankusername");
    @Getter
    private String bankpassword = properties.getProperty("bankpassword");




    private static Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/login.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
