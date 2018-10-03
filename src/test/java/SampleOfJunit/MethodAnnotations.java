package SampleOfJunit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("A special test class")
 class MethodAnnotations {


        @BeforeAll
        static void initAll() {
            System.out.println("перед каждым классом");
        }

        @BeforeEach
        void init() {
            System.out.println("перед каждым тест методом");
        }

        @Test
        @DisplayName("╯°□°）╯")
        void succeedingTest() {
            System.out.println("удачный тестовый метод");
        }

        @Test
        @DisplayName("😱")
        void failingTest() {
            System.out.println("slozhno");
            fail("a failing test");
        }

        @Test
        @Disabled("for demonstration purposes этот отключен вывод из анотации")
        void skippedTest() {
            System.out.println("ne napechataetsya");
            // not executed
        }

        @AfterEach
        void tearDown() {
            System.out.println("после каждого метода");
        }

        @AfterAll
        static void tearDownAll() {
            System.out.println("после класса");
        }

    }
