package tests;

import appmanager.ApplicationManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {

    @BeforeAll
    public static void setUp() throws Exception {
        ApplicationManager app = new ApplicationManager();
       app.init();
    }

    @AfterAll
    public static void tearDown() {
        ApplicationManager app = new ApplicationManager();
        app.stop();
    }

}
