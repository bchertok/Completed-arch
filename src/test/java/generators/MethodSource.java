package generators;

import com.thoughtworks.xstream.XStream;
import dataModel.DC;
import dataModel.PaymentRequestData;

import java.io.*;
import java.util.List;

@SuppressWarnings("unchecked")
public class MethodSource {

    private static String xml = "";

    public static List<PaymentRequestData> inkassoOrderCorrectList() throws IOException {
        InkassoOrderDG.generateCorrectInkassoOrder();
        XStream xstream = new XStream();
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypeHierarchy(PaymentRequestData.class);
        reader("src\\\\test\\\\resources\\\\inkassoOrderData.xml");
        return (List<PaymentRequestData>) xstream.fromXML(xml, PaymentRequestData.class);
    }

    public static List<PaymentRequestData> inkassoOrderUnCorrectList() throws IOException {
        InkassoOrderDG.generateUncorrectInkassoOrder();
        XStream xstream = new XStream();
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypeHierarchy(PaymentRequestData.class);
        reader("src\\\\test\\\\resources\\\\inkassoOrderData.xml");
        return (List<PaymentRequestData>) xstream.fromXML(xml, PaymentRequestData.class);
    }


    public static List<DC> args() throws IOException {
        DataGenerator.generateDC();
        XStream xstream = new XStream();
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypeHierarchy(DC.class);
        reader("src\\\\test\\\\resources\\\\Data.xml");
        return (List<DC>) xstream.fromXML(xml, DC.class);
    }

    private static void reader(String pathname) throws IOException {
        BufferedReader reader = new BufferedReader
                ((new FileReader(new File(pathname))));
        String line = reader.readLine();
        while (line != null) {
            xml += (line);
            line = reader.readLine();
        }

    }


}
