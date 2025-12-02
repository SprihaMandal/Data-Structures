import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        // Animal pet = new Dog("Cooco", true);
        // pet.greet();
        // pet.train();

        Student s1 = new Student("Joe", 433);
        Student s2 = new Student("Hari", 456);
        Student s3 = new Student("Ash", 445);
        Student s4 = new Student("Sammy", 899);

        PriorityQueue<Student> pQueue = new PriorityQueue<>();
        pQueue.offer(s3);
        pQueue.offer(s2);
        pQueue.offer(s4);
        pQueue.offer(s1);

        while (!pQueue.isEmpty()) {
            Student s = pQueue.poll();
            System.out.println(s.rollNo + " : " + s.name);

        }

        // dynamic method dispatch
        Car car = new ElectricCar();
        car.mileage(); // Car's mileage method
        car.drive(); // ElectricCar's drive method
    }
}
