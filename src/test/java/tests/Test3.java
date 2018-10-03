package tests;

import generators.AllureHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class Test3 {
    @Test
    void test() {
        AllureHelper allureHelper = new AllureHelper();
        allureHelper.autoReport();
    }
}
