package SampleOfJunit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class JunitAssert {

    @Test
    void standardAssertions() {
        assertEquals(4, 2, "Можно написать любую ошибку, которая будет выведена");
        assertTrue('a' < 'b', "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    void groupedAssertions() {
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        Person person = new Person("John", "Doe");
        List<Person> list = new ArrayList<>();
        list.add(person);
        person = new Person("John1", "Doe1");
        list.add(person);
        System.out.println(list);


        for (Person p : list) {
            // В сгруппированном утверждении выполняются все утверждения, и любые
            // ошибки сообщаются вместе
            assertAll("p",
                    () -> assertEquals("John", p.getFirstname()),
                    () -> assertEquals("Doe", p.getLastname())
            );
        }

    }

    @Test
        // нам даром не нужно
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        assertEquals("a message", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() throws InterruptedException {
        assertTimeout(ofSeconds(1), () -> {
            // body of test
            Thread.sleep(1003);
            // тест должен занять менее second
        });
    }

    @Test
    void timeoutNotExceededWithMethod() {
        // The following assertion invokes a method reference and returns an object.
        String actualGreeting = assertTimeout(ofSeconds(1), JunitAssert::greeting);
        assertEquals("Hello, World!", actualGreeting);
    }

    private static String greeting() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello, World!";
    }

    /* *
     Если вы хотите, чтобы JUnit Jupiter выполнял все методы тестирования в одном тестовом экземпляре,
     просто аннотируйте свой тестовый класс с помощью @TestInstance (Lifecycle.PER_CLASS).
     При использовании этого режима новый тестовый экземпляр будет создан один раз на тестовый класс.
     Таким образом, если ваши методы тестирования зависят от состояния, хранящегося в переменных экземпляра,
     вам может потребоваться сбросить это состояние в методах @BeforeEach или @AfterEach.
      */

}