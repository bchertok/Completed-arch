package appManager;

import lombok.Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Data
public class InitPropertyReader {

    private Properties properties = getProperties();


    private boolean windowmax = Boolean.parseBoolean(properties.getProperty("windowmax"));
    private String browser = properties.getProperty("browser");
    private boolean generateNewData = Boolean.parseBoolean(properties.getProperty("generateNewData"));
    private int numberOfData = Integer.parseInt(properties.getProperty("numberOfData"));


    private static Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/init.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
