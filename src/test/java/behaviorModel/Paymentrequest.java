package behaviorModel;

import dataModel.PaymentRequestData;
import pageModel.PaymentrequestForm;

public class Paymentrequest extends PaymentrequestForm {


    public void fillingForm(PaymentRequestData paymentRequestData) {
//setInn4(paymentRequestData.getInn4());
//setBankBik10(paymentRequestData.getBankBik10());
//setKpp4a(paymentRequestData.getKpp4a());
soutInn4(paymentRequestData.getInn4());
    }

    public void printsomethink() {
        System.out.println("new step");
    }
}
