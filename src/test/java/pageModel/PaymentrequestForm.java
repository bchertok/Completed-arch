package pageModel;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PaymentrequestForm {
    private SelenideElement inn4 =  $(byId("email"));
    private SelenideElement kpp4a = $(byId("email"));
    private SelenideElement typeOfOwnership5a = $(byId("email"));
    private SelenideElement nameOfOwner5= $(byId("email"));
    private SelenideElement summ6= $(byId("email"));
    private SelenideElement number7= $(byId("email"));
    private SelenideElement bankBik10= $(byId("email"));
    private SelenideElement kpp16a= $(byId("email"));
    private SelenideElement nds19= $(byId("email"));
    private SelenideElement ndspercent23= $(byId("email"));
    private SelenideElement ndsType23a= $(byId("email"));
    private SelenideElement kod22= $(byId("email"));
    private SelenideElement paymentAssign24= $(byId("email"));
    private SelenideElement paytype25= $(byId("email"));
    private SelenideElement documentnumber26= $(byId("email"));
    private SelenideElement date27= $(byId("email"));
    private SelenideElement oktmo31= $(byId("email"));
    private SelenideElement taxablePeriod35= $(byId("email"));
    private SelenideElement taxablePeriod36= $(byId("email"));
    private SelenideElement documentNumber37= $(byId("email"));
    private SelenideElement documentDateDay38= $(byId("email"));
    private SelenideElement documentDateMonth39= $(byId("email"));
    private SelenideElement documentDateYear40= $(byId("email"));


    public void setInn4(String inn4) {
        this.inn4.setValue(inn4);
    }

    public void setKpp4a(String kpp4a) {
        this.kpp4a.setValue(kpp4a);
    }

    public void setTypeOfOwnership5a(String typeOfOwnership5a) {
        this.typeOfOwnership5a.setValue(typeOfOwnership5a);
    }

    public void setNameOfOwner5(String nameOfOwner5) {
        this.nameOfOwner5.setValue(nameOfOwner5);
    }

    public void setSumm6(String summ6) {
        this.summ6.setValue(summ6);
    }

    public void setNumber7(String number7) {
        this.number7.setValue(number7);
    }

    public void setBankBik10(String bankBik10) {
        this.bankBik10.setValue(bankBik10);
    }

    public void setKpp16a(String kpp16a) {
        this.kpp16a.setValue(kpp16a);
    }

    public void setNds19(String nds19) {
        this.nds19.setValue(nds19);
    }

    public void setNdspercent23(String ndspercent23) {
        this.ndspercent23.setValue(ndspercent23);
    }

    public void soutInn4(String inn4){
        System.out.println(inn4);
    }
}
