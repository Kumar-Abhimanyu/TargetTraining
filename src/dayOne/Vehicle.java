package dayOne;

public class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}

class TwoWheeler extends Vehicle{
    @Override
    void run(){
        System.out.println("Two wheeler is running");
    }
}

class Bike extends TwoWheeler{
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}