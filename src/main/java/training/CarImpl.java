package training;

public class CarImpl implements Car {
    private int i;
    private int z;

    CarImpl(int i, int z){
        this.i = i;
        this.z = z;
    }

    @Override
    public int drive() {
        return i*z;
        }
}
