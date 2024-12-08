class Vehicle {
    void speed() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car is moving at high speed");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.speed();

        Car c = new Car();
        c.speed();
    }
}
