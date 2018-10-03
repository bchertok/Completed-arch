package generators;

import appManager.InitPropertyReader;
import com.thoughtworks.xstream.XStream;
import dataModel.PaymentRequestData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class InkassoOrderDG {


    static void generateCorrectInkassoOrder() throws IOException {
        InitPropertyReader initPropertyReader = new InitPropertyReader();
        boolean generateNewData = initPropertyReader.isGenerateNewData();
        int count = initPropertyReader.getNumberOfData();
        if (generateNewData) {
            // аргумент путь к файлу, куда писать
            File file = new File("src\\test\\resources\\inkassoOrderData.xml");
            List<PaymentRequestData> dcList = generateCorrect(count);
            saveAsXML(dcList, file);
        }
    }

    static void generateUncorrectInkassoOrder() throws IOException {
        InitPropertyReader initPropertyReader = new InitPropertyReader();
        boolean generateNewData = initPropertyReader.isGenerateNewData();
        int count = initPropertyReader.getNumberOfData();
        if (generateNewData) {
            // аргумент путь к файлу, куда писать
            File file = new File("src\\test\\resources\\inkassoOrderData.xml");
            List<PaymentRequestData> dcList = generateUncorrect(count);
            saveAsXML(dcList, file);
        }
    }

    private static List<PaymentRequestData> generateUncorrect(int count) {
        List<PaymentRequestData> paymentRequestDataList = new ArrayList<>();
        Randoms rnd = new Randoms();
        for (int i = 0; i < count; i++) {
            String inn4 = rnd.correctnumbers(2);
            String kpp4a = rnd.correctnumbers(2);
            String typeOfOwnership5a = null;
            String nameOfOwner5 = rnd.correctstring(2);
            String summ6 = rnd.bigdoublenumber();
            String number7 = null;
            String bankBik10 = rnd.correctnumbers(2);;
            String kpp16a = null;
            String nds19 = rnd.bigdoublenumber();
            String ndspercent23 = rnd.percent();
            String ndsType23a = null;
            String kod22 = rnd.correctstring(2);
            String paymentAssign24 = null;
            String paytype25 = null;
            String documentnumber26 = null;
            String date27 = null;
            String oktmo31 = null;
            String taxablePeriod35 = null;
            String taxablePeriod36 = null;
            String documentNumber37 = null;
            String documentDateDay38 = null;
            String documentDateMonth39 = null;
            String documentDateYear40 = null;
            paymentRequestDataList.add(new PaymentRequestData(inn4, kpp4a, typeOfOwnership5a, nameOfOwner5, summ6, number7,
                    bankBik10, kpp16a, nds19, ndspercent23,
                    ndsType23a, kod22, paymentAssign24, paytype25, documentnumber26, date27, oktmo31,
                    taxablePeriod35, taxablePeriod36, documentNumber37, documentDateDay38, documentDateMonth39, documentDateYear40));
        }
        return paymentRequestDataList;
    }


    private static void saveAsXML(List<PaymentRequestData> data, File file) throws IOException {
        XStream xStream = new XStream();
        String xml = xStream.toXML(data);
        Writer writer = new FileWriter(file);
        writer.write(xml);
        writer.close();
    }


    private static List<PaymentRequestData> generateCorrect(int count) {
        // генерация и запись в лист
        List<PaymentRequestData> paymentRequestDataList = new ArrayList<>();
        Randoms rnd = new Randoms();
        for (int i = 0; i < count; i++) {
            String inn4 = rnd.correctnumbers(13);
            String kpp4a = rnd.correctnumbers(10);
            String typeOfOwnership5a = null;
            String nameOfOwner5 = rnd.correctstring(55);
            String summ6 = rnd.bigdoublenumber();
            String number7 = null;
            String bankBik10 = rnd.correctnumbers(10);;
            String kpp16a = null;
            String nds19 = rnd.bigdoublenumber();
            String ndspercent23 = rnd.percent();
            String ndsType23a = null;
            String kod22 = rnd.correctstring(25);
            String paymentAssign24 = null;
            String paytype25 = null;
            String documentnumber26 = null;
            String date27 = null;
            String oktmo31 = null;
            String taxablePeriod35 = null;
            String taxablePeriod36 = null;
            String documentNumber37 = null;
            String documentDateDay38 = null;
            String documentDateMonth39 = null;
            String documentDateYear40 = null;
            paymentRequestDataList.add(new PaymentRequestData(inn4, kpp4a, typeOfOwnership5a, nameOfOwner5, summ6, number7,
                     bankBik10, kpp16a, nds19, ndspercent23,
                    ndsType23a, kod22, paymentAssign24, paytype25, documentnumber26, date27, oktmo31,
                    taxablePeriod35, taxablePeriod36, documentNumber37, documentDateDay38, documentDateMonth39, documentDateYear40));
        }
        return paymentRequestDataList;
    }
}


