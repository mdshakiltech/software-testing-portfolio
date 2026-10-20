class Car {
    String brand;
    String color;
    int speed;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    void accelerate() {
        speed += 20;
        System.out.println("Car is accelerating...");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "White";
        car1.speed = 60;

        car1.displayDetails();
        car1.accelerate();

        System.out.println("New Speed: " + car1.speed + " km/h");
    }
}
