public class Student implements Comparable<Student> {
    String name;
    int rollNo;

    Student(String name, int roll) {
        this.rollNo = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return other.rollNo - this.rollNo;
    }

}
