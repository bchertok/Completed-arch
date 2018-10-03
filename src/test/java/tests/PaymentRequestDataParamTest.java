package tests;


import behaviorModel.Login;
import dataModel.PaymentRequestData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import behaviorModel.Paymentrequest;


class PaymentRequestDataParamTest extends TestBase {
private Login login = new Login();
    private Paymentrequest paymentrequest = new Paymentrequest();


        @ParameterizedTest
        @MethodSource("generators.MethodSource#inkassoOrderCorrectList")
        void paramtest1(PaymentRequestData paymentRequestData) {
//            login.loginAsClient();
            paymentrequest.fillingForm(paymentRequestData);

        }
    @ParameterizedTest
    @MethodSource("generators.MethodSource#inkassoOrderUnCorrectList")
    void paramtest2(PaymentRequestData paymentRequestData) {
//            login.loginAsClient();
        paymentrequest.fillingForm(paymentRequestData);
    }



}

