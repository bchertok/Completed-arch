package appmanager;


import com.codeborne.selenide.Selenide;
import exception.UncorrectablePropertyException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.codeborne.selenide.WebDriverRunner;


public class ApplicationManager {

    private WebDriver driver;

    public void init() throws UncorrectablePropertyException {
        Properties properties = getProperties();
        String browser = properties.getProperty("browser");

        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
             driver = new FirefoxDriver();
                break;
            case "InternetExplorer":
               WebDriverRunner.isIE();
                break;
            default:
                throw new UncorrectablePropertyException("Неправильно указан браузер или драйвер");
        }
        WebDriverRunner.setWebDriver(driver);

        boolean windowmax = Boolean.parseBoolean(properties.getProperty("windowmax"));
        if (windowmax) {
            driver.manage().window().maximize();
        }


//        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


//        SessionHelper sessionHelper = new SessionHelper(wd);
//        sessionHelper.login("admin", "secret");
//        wd.get("http://localhost/addressbook/");

    }


    public void stop() {
        WebDriverRunner.getWebDriver().quit();

//        Selenide.close();
    }


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
