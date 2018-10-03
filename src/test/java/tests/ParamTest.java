package tests;


import dataModel.DC;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;




class ParamTest {


    @ParameterizedTest
    @MethodSource("generators.MethodSource#args")
    void paramtest(DC dc) {
        System.out.println(dc.getName());
        System.out.println(dc.getPassword());
//        System.out.println(dc.getPassword());

    }


}
