package generators;

import appManager.InitPropertyReader;
import com.thoughtworks.xstream.XStream;
import dataModel.DC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static void generateDC() throws IOException {
        InitPropertyReader initPropertyReader = new InitPropertyReader();
        boolean generateNewData = initPropertyReader.isGenerateNewData();
        int count = initPropertyReader.getNumberOfData();
        if (generateNewData) {
            // аргумент путь к файлу, куда писать
            File file = new File("src\\test\\resources\\Data.xml");
            List<DC> dcList = generate(count);
            saveAsXML(dcList, file);
        }
    }


    private static void saveAsXML(List<DC> data, File file) throws IOException {
        XStream xStream = new XStream();
        String xml = xStream.toXML(data);
        Writer writer = new FileWriter(file);
        writer.write(xml);
        writer.close();
    }


    private static List<DC> generate(int count) {
        // генерация и запись в лист

        List<DC> dcList = new ArrayList<>();


        Randoms rnd = new Randoms();
        for (int i = 0; i < count; i++) {
            dcList.add(new DC().withname(rnd.randomString(10)).withpassword(rnd.randomString(3)));
        }

        return dcList;
    }
}
