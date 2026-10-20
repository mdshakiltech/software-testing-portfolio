class Student {
    String name;
    int rollNumber;
    String course;

    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student student1 =
                new Student("Shakil", 101, "Computer Science");

        Student student2 =
                new Student("Aman", 102, "Software Testing");

        student1.displayDetails();
        System.out.println("--------------");
        student2.displayDetails();
    }
}
