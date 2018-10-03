package sandboxs;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class UserStoryViewer {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cheklist = new ArrayList<>();
        ArrayList<String> us = new ArrayList<>();
        ArrayList<String> completeUS = new ArrayList<>();
        ArrayList<String> avtosravn1 = new ArrayList<>();
        ArrayList<String> finalstr;

        Reader reader = new InputStreamReader(new FileInputStream("C:\\Users\\BChertok\\Desktop\\bugs\\fromCheklist.txt"), StandardCharsets.UTF_8);
        Reader reader2 = new InputStreamReader(new FileInputStream("C:\\Users\\BChertok\\Desktop\\bugs\\fromUS.txt"), StandardCharsets.UTF_8);


        BufferedReader fromCheklist = new BufferedReader(reader);
        fromCheklist.lines().forEach(cheklist::add);

        System.out.println("====================");

        BufferedReader fromUS = new BufferedReader(reader2);
        fromUS.lines().forEach(us::add);

        System.out.println("====================");

        for (String s : us) {
            if (s.contains("Описание User story")) {
                String new_str = s.replace("Описание User story – ", "");
                String new_str2 = new_str.replace("Описание User story –", "");
                String new_str3 = new_str2.replace("Описание User story  –", "");
                completeUS.add(new_str3);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\BChertok\\Desktop\\bugs\\cleanWord.txt"))) {
            for (String line : completeUS) {
                bw.write(line + "\n");
                bw.newLine();
            }
        }


        for (String aUs : completeUS) {
            for (String aCheklist : cheklist) {
                // если юзерстори содержит чеклист добавляем чеклист
                if (aUs.contains(aCheklist)) {
                    avtosravn1.add(aCheklist);
                }


            }
        }

        for (String aCheklist : cheklist) {
            for (String aUs : completeUS) {
                // если чеклист содержит юзерстори добавляем чеклист
                if (aCheklist.contains(aUs)) {
                    avtosravn1.add(aUs);
                }
            }
        }

        finalstr = completeUS;
        finalstr.removeAll(avtosravn1);

        System.out.println("\n======================================================================================");
        finalstr.forEach(System.out::println);
        System.out.println(finalstr.size());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\BChertok\\Desktop\\bugs\\rezultatproverkiUS" + java.time.LocalDate.now() + ".txt"))) {
            for (String line : finalstr) {
                bw.write(line + "\n");
                bw.newLine();
            }
        }
    }
}

