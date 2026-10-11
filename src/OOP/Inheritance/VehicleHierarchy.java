package OOP.Inheritance;

// Parent class: Vehicle
class Vehicle{

//        Comment method inheritance by child class
        public void start(){
            System.out.println("Vehicle Start....");
        }

        public void stop(){
            System.out.println("Vehicle Stop....");
        }
    }

// Child class: Car inherits Vehicle
    class Car extends Vehicle{
        @Override
        public void start(){
            System.out.println("Car Start.....");
        }
        @Override
        public void stop(){
            System.out.println("Car stop....");
        }

//        Car-specific Method
        public void brand(){
            System.out.println("BMW");
        }
    }

    class Bike extends Vehicle{
        @Override
        public void start(){
            System.out.println("Bike Start....");
        }

        @Override
        public void stop(){
            System.out.println("Bike stop....");
        }

//        Bike Specific Method
        public void brand(){
            System.out.println("Royal Enfield");
        }
    }


public class VehicleHierarchy {

    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();

        System.out.println("=====CAR=====");
        c1.start();
        c1.brand();
        c1.stop();

        System.out.println("==================");

        System.out.println("=====BIKE======");
        b1.start();
        b1.brand();
        b1.stop();

    }
}
