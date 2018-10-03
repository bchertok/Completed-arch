package training;

public interface Car {
    int drive();

    default void drive2(String z) {
        System.out.println(z);
    }
}
