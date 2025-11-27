package abstractExample;

public interface Test {

    public static void main(String[] args) {
        Ride car = new Car("Joseph", "VH10011AB");
        car.startRide();
        System.out.println("Fair :" + car.calculateFair(40));
        Bike bike = new Bike("Jose", "VMM8900");
        bike.startRide();

        Ride auto = new Ride("jm", "VA56797Q") {
            @Override
            int calculateFair(int kms) {
                return kms * 7;
            }

            @Override
            public void startRide() {
                super.startRide();
                System.out.println("auto ride started... ");
            }
        };

        auto.startRide();
        auto.calculateFair(50);
    }
}