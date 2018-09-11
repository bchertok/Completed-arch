package tests;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import model.DC;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.util.Collection;
import java.util.List;

class ParamTest {

    @ParameterizedTest
    @MethodSource("args")
    void paramtest(DC dc) {
        System.out.println(dc.getName());
        System.out.println(dc.getPassword());

    }
static List<DC> args() throws IOException {
    XStream xstream = new XStream();
    XStream.setupDefaultSecurity(xstream);
    xstream.allowTypeHierarchy(DC.class);

    String xml = "";
    BufferedReader reader = new BufferedReader
                ((new FileReader(new File("src\\\\test\\\\resources\\\\Data.xml"))));
        String line = reader.readLine();
        while (line != null) {
            xml += (line);
            line = reader.readLine();
        }

    return (List<DC>) xstream.fromXML(xml);

}

}
