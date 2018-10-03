package tests;

import appManager.ApplicationManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    static private ApplicationManager app = new ApplicationManager();

    @BeforeAll
    public static void setUp() throws Exception {
        app.init();
    }

    @AfterAll
    public static void tearDown() {
        app.stop();
    }

}
