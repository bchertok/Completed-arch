package training;

import com.sun.istack.internal.NotNull;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceTest implements Comparable<InterfaceTest>, Cloneable {

    private String name;
    private Integer age;
    private String email;

    public InterfaceTest clone() throws CloneNotSupportedException {
        {
            return (InterfaceTest) super.clone();
        }
    }

    @Override
    public int compareTo(@NotNull InterfaceTest o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    private InterfaceTest(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    private void doublevalue() {
        age = age * 2;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        InterfaceTest user1 = new InterfaceTest("Андрей", 19, "andryha@mail.ru");
        InterfaceTest user2 = new InterfaceTest("Олег", 25, "oleg@mail.ru");
        InterfaceTest user3 = new InterfaceTest("Андрей", 24, "opr@google.com");
        InterfaceTest user4 = new InterfaceTest("Игорь", 16, "igor@mail.ru");
        InterfaceTest user5 = new InterfaceTest("Андрей", 44, "stary@google.com");
        List<InterfaceTest> list = new ArrayList<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        InterfaceTest user6 = user1.clone();
        user6.doublevalue();
        System.out.println(user6);
        System.out.println(user1);

        System.out.println("-------до сортировки--------");
        for (InterfaceTest u : list) {
            System.out.println(u);
        }

        System.out.println("-------после сортировки-----");
        Collections.sort(list);
        for (InterfaceTest u : list) {
            System.out.println(u);
        }
    }


}



