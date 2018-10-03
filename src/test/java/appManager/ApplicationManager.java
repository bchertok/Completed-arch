package appManager;


import behaviorModel.Login;
import com.codeborne.selenide.Selenide;
import exception.UncorrectablePropertyException;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;



public class ApplicationManager {
    private Login login;
    private InitPropertyReader pr = new InitPropertyReader();

    public void init() throws UncorrectablePropertyException {
login = new Login();
        String browser = pr.getBrowser();


//        System.setProperty("webdriver.chrome.driver", "/home/user/Work/chromedriver");
//        Configuration.browser = "chrome";
//        open("https://mail.ukr.net/desktop/login");

        switch (browser) {
            case "Chrome":
                Configuration.browser = "chrome";
//                driver = new ChromeDriver();
                break;
            case "Firefox":
                Configuration.browser = "firefox";
//                driver = new FirefoxDriver();
                break;
            case "InternetExplorer":

//                driver = new InternetExplorerDriver();
                break;
            default:
                throw new UncorrectablePropertyException("Неправильно указан браузер или драйвер");
        }


        boolean windowmax = pr.isWindowmax();
        if (windowmax) {
//            driver.manage().window().maximize();
            Configuration.startMaximized = true;
        }
//        WebDriverRunner.setWebDriver(driver);
//        open("https://www.google.ru");
    }

    public void stop() {
        Selenide.assertNoJavascriptErrors();
        System.out.println(Selenide.getJavascriptErrors());
//        WebDriverRunner.getWebDriver().quit();
WebDriverRunner.closeWebDriver();

    }
    public Login login() {
        return login;
    }



}
