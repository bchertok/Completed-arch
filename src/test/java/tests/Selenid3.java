package tests;

import generators.AllureHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class Selenid3 {
    @Test
    void test() throws IOException {
        AllureHelper allureHelper = new AllureHelper();
        allureHelper.autoReport();
    }
}
