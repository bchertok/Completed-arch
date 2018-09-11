package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
class Selenid2 extends TestBase{
    @Test
    void selenid2() throws InterruptedException {
        open("https://ru.selenide.org/quick-start.html");
        Thread.sleep(3000);
    }

    @Test void selenid3() throws InterruptedException {
        open("https://www.google.ru/search?q=Junit5+%D0%B0%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D0%B8&oq=Junit5+%D0%B0%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D0%B8+&aqs=chrome..69i57.7167j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(4000);
        Assertions.assertEquals("zzz","ce");
    }
}
