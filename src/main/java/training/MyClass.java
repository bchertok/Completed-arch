package training;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MyClass {
    private int number;
    private String name = "default";

    //    public MyClass(int number, String name) {
//        this.number = number;
//        this.name = name;
//    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + name);
    }


    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        MyClass m = new MyClass();
        System.out.println(m.getClass().getName());
        Class<? extends MyClass> aClass = m.getClass();
        for (int i = 0; i < 10; i++) {
            Method toString = aClass.getMethod("toString");
            System.out.println(toString.invoke(m, null));
        }
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(m, "nodefault");
        name.setAccessible(false);
        System.out.println(m);

        List<String> strings = new ArrayList<>();
        strings.add("");
        String o = strings.get(0);

    }
}