package OOP.Abstraction;

    interface Vehicle{
        void start();
        void stop();
    }

    class Car implements Vehicle{
        @Override
        public void start() {
            System.out.println("Car Start");
        }

        @Override
        public void stop(){
            System.out.println("Car Stop");
        }

        public void brand(){
            System.out.println("Car Brand Name: BMW");
        }
    }

    class Bike implements Vehicle{
        @Override
        public void start(){
            System.out.println("Bike Start");
        }
        @Override
        public void stop(){
            System.out.println("Bike Stop");
        }

        public void brand(){
            System.out.println("Bike Brand name: Royal Enfield");
        }
    }


public class InterfaceDemo {

//    public static void main(String[] args) {
//        Car c1 = new Car();
//        Bike b1 = new Bike();
//
//        c1.start();
//        c1.stop();
//        c1.brand();
//
//        System.out.println("=================");
//
//        b1.start();
//        b1.stop();
//        b1.brand();
//    }


public static void main(String[] args) {

    // Interface references holding implementation objects
    Vehicle v1 = new Car();
    Vehicle v2 = new Bike();

    // Runtime polymorphism with Car
    v1.start();
    v1.stop();

    System.out.println("=================");

    // Runtime polymorphism with Bike
    v2.start();
    v2.stop();
}

}
