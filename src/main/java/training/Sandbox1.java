package training;

import java.io.IOException;

public class Sandbox1 {
    public static void main(String[] args) throws IOException {
        System.out.println(CURRENCY.RUB);
    }
}

enum CURRENCY {
    RUB, USD;
}
