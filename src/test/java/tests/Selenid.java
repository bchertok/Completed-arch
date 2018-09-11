package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;

class Selenid extends TestBase {

    @Test
    void selenidTest(){

        open("https://yandex.ru/?utm_source=brand_new_1_x");

//        $(By.className("input__control input__input")).click();
//        $(".message").shouldHave(text("Привет"));
//        $(byText(""));
//        $(byId(""));
        Assertions.assertEquals(12,13);
        System.out.println("zzz");







    }
}
