package abstractExample;

public class Bike extends Ride {
    Bike() {

    }

    Bike(String driverName, String vNum) {
        super(driverName, vNum);

    }

    @Override
    public int calculateFair(int kms) {
        return kms * 5;
    }

}
