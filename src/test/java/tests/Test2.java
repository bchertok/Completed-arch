package tests;


import pageModel.AuthPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class Test2 extends TestBase{
    @ParameterizedTest
    @MethodSource("generators.MethodSource#args")
    void selenid2()  {
        AuthPage authPage = new AuthPage();
        authPage.openstartpage();
//        authPage.login(dc.getName(),dc.getPassword());
        authPage.clikloginbotton();
//        Assertions.assertEquals(dc.getName(),"124");
        authPage.assertenabled();
    }
    }
