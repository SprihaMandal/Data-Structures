package threading.topic2;

public class TrafficLight {

    public static void main(String[] args) throws Exception {

        TrafficLightController trafficPolice = new TrafficLightController();
        System.out.println(trafficPolice.getState());
        trafficPolice.start();
        System.out.println(trafficPolice.getState());
        Thread.sleep(3000);
        trafficPolice.pauseLight();
        System.out.println(trafficPolice.getState());
        Thread.sleep(1000);
        trafficPolice.resumeLight();
        System.out.println(trafficPolice.getState());

        Thread.sleep(3000);
        trafficPolice.stopLight();
        trafficPolice.join();
        System.out.println(trafficPolice.getState());

    }
}