package ClassObject;

class Car{
    String brand;
    int speed;

    //        constructor
    Car(String brand){
        this.brand = brand;
    }
    void acceleration(){
        speed += 10;
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.acceleration();

        System.out.println(c.brand +" "+c.speed);
    }
}
