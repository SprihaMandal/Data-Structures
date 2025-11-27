package abstractExample;

public class Car extends Ride {
    Car() {

    }

    Car(String driverName, String vNum) {
        super(driverName, vNum);
    }

    @Override
    public int calculateFair(int kms) {
        return kms * 10;
    }

}
