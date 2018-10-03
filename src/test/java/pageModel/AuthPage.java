package pageModel;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AuthPage {

    private SelenideElement email = $(byId("email"));
    private SelenideElement pass = $(byId("pass"));
    private SelenideElement loginbutton = $(byId("login_button"));

    public void openstartpage() {
        open("https://vk.com/im");
    }

    public void setloginvalue(String email, String password) {
        this.email.setValue(email);
        this.pass.setValue(password);
    }

    public void clikloginbotton() {
        this.loginbutton.click();
    }

    public void assertenabled(){
        this.loginbutton.shouldBe(selected);
        this.loginbutton.shouldNotBe(visible);
        //com.codeborne.selenide.CollectionCondition.*;

    }
}
