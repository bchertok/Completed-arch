package dataModel;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PaymentRequestData {
    private String inn4;
    private String kpp4a;
    private String typeOfOwnership5a;
    private String nameOfOwner5;
    private String summ6;
    private String number7;
    private String bankBik10;
    private String kpp16a;
    private String nds19;
    private String ndspercent23;
    private String ndsType23a;
    private String kod22;
    private String paymentAssign24;
    private String paytype25;
    private String documentnumber26;
    private String date27;
    private String oktmo31;
    private String taxablePeriod35;
    private String taxablePeriod36;
    private String documentNumber37;
    private String documentDateDay38;
    private String documentDateMonth39;
    private String documentDateYear40;

    public PaymentRequestData(String inn4, String kpp4a, String typeOfOwnership5a, String nameOfOwner5,
                              String summ6, String number7, String bankBik10, String kpp16a, String nds19, String ndspercent23, String ndsType23a, String kod22,
                              String paymentAssign24, String paytype25, String documentnumber26, String date27, String oktmo31, String taxablePeriod35,
                              String taxablePeriod36, String documentNumber37, String documentDateDay38, String documentDateMonth39, String documentDateYear40) {
        this.inn4 = inn4;
        this.kpp4a = kpp4a;
        this.typeOfOwnership5a = typeOfOwnership5a;
        this.nameOfOwner5 = nameOfOwner5;
        this.summ6 = summ6;
        this.number7 = number7;
        this.bankBik10 = bankBik10;
        this.kpp16a = kpp16a;
        this.nds19 = nds19;
        this.ndspercent23 = ndspercent23;
        this.ndsType23a = ndsType23a;
        this.kod22 = kod22;
        this.paymentAssign24 = paymentAssign24;
        this.paytype25 = paytype25;
        this.documentnumber26 = documentnumber26;
        this.date27 = date27;
        this.oktmo31 = oktmo31;
        this.taxablePeriod35 = taxablePeriod35;
        this.taxablePeriod36 = taxablePeriod36;
        this.documentNumber37 = documentNumber37;
        this.documentDateDay38 = documentDateDay38;
        this.documentDateMonth39 = documentDateMonth39;
        this.documentDateYear40 = documentDateYear40;
    }
}
