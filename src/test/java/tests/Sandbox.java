package tests;


import behaviorModel.Login;
import org.junit.jupiter.api.Test;

class Sandbox extends TestBase {
    private Login login = new Login();

    @Test
    void demo1() {
        login.loginUncorrectly();
    }

    @Test
    void demo2() {
        login.loginAsBank();
    }

    @Test
    void demo3() {
        login.loginAsClient();
    }
}
