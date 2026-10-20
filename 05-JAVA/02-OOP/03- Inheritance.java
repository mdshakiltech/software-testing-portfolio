class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    int numberOfDoors = 4;

    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Doors: " + numberOfDoors);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.displayCarDetails();
    }
}
