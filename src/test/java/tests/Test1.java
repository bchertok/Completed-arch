package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Configuration;
    class Test1 extends TestBase {

        @Test
        void selenidTest() {

            open("https://yandex.ru/?utm_source=brand_new_1_x");

            $(byText("")).setValue("fg");
            $(byId("gf")).shouldHave(Condition.textCaseSensitive("12"));

            ElementsCollection resultLinks = $$("#search-results a");
            resultLinks.findBy(Condition.id("12"));
            resultLinks.size();
            resultLinks.findBy(Condition.text("fdf")).click();
            Assertions.assertEquals(12, 13);
            System.out.println("zzz");
            resultLinks.snapshot();
            // webdriverrunner
WebDriverRunner.isChrome();
//configuration
//Configuration.browserSize = "";

            Selenide.getJavascriptErrors();
            Selenide.assertNoJavascriptErrors();
            Selenide.screenshot("");
            Selenide.sleep(12);


        }
    }


