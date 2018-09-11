package tests;

import generators.AllureHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AllureGenerate {

    public static void test () throws IOException {
        AllureHelper allureHelper = new AllureHelper();
        allureHelper.autoReport();
    }
}
