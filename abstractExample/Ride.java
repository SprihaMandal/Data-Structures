package abstractExample;

abstract public class Ride {
    private String driverName;
    private String vehicleNumber;

    Ride() {

    }

    Ride(String driverName, String vNum) {
        this.driverName = driverName;
        this.vehicleNumber = vNum;
    }

    abstract int calculateFair(int kms);

    public void startRide() {
        System.out.println("Ride Started with driver :" + driverName + " in vehicle number: " + vehicleNumber);
    }

}
