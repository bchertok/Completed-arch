package generators;

import java.security.SecureRandom;


public class Randoms {


    private static final String character = "ABC DEFGHIJK LMNOPQ RSTUVW XYZqwertyuio pasdfghjklzxc vbnmйцукенгшщзхъэ ждлорпав ыфячсмить бюЙЦУКЕН ГШЩЗХЪ ЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String special = "~`!@#$%^&*()_+=}][{|:;|/?><'";
    private static final String characterandspecial = "ABCDEFGHI JKLMNOPQRS TUVWXYZqwertyu iopasdfgh jklzxcvbnm йцукенгш щзхъэжд лорпавы фячсм итьбюЙЦ УКЕНГШЩЗХЪ ЭЖДЛОРПАВЫФ" +
            "ЯЧСМИТЬБЮ~`!@#$%^&*()_+=}][{|:;|/?><'";
    private static SecureRandom rnd = new SecureRandom();
    private static final String number = "0123456789";



    public String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(character.charAt(rnd.nextInt(character.length())));
        return sb.toString();
    }


    private String getString(int bound, String character) {
        int len1 = rnd.nextInt(bound);
        while (len1 == 0) {
            len1 = rnd.nextInt(bound);
        }
        StringBuilder sb = new StringBuilder(len1);
        for (int i = 0; i < len1; i++)
            sb.append(character.charAt(rnd.nextInt(character.length())));
        return sb.toString();
    }

    public String correctstring(int bound) {
        return getString(bound, character);
    }

    public String correctnumbers(int bound) {
        return getString(bound, number);
    }

    public String bigdoublenumber() {
        StringBuilder sb = new StringBuilder();
        int len1 = rnd.nextInt(12);
        int z = rnd.nextInt(10);
        while (z == 0) {
            z = rnd.nextInt(10);
        }
        int len = rnd.nextInt(3);
        while (len == 0) {
            len = rnd.nextInt(3);
        }
        sb.append(z);
        for (int i = 0; i < len1; i++) {
            sb.append(number.charAt(rnd.nextInt(number.length())));
        }
        sb.append(".");
        for (int i = 0; i < len; i++) {
            sb.append(number.charAt(rnd.nextInt(number.length())));
        }
        return sb.toString();
    }
    public String percent(){
        return String.valueOf(rnd.nextInt(100));

    }

}

