package OOP.Polymorphism;


class Calculator{
//    method add two integers
    public int add(int a, int b){
        return a+b;
    }

//    method add three integers
    public int add(int a, int b, int c){
        return a+b+c;
    }

//    Method add two double integers
    public double add(double a, double b){
        return a+b;
    }

//    Method add four integers
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}


public class MethodOverloading {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println("Add Two Integers: "+c1.add(10,20));
        System.out.println("Add Three Integers: "+c1.add(10,20,30));
        System.out.println("Add Two Double number: "+c1.add(10.0, 20.0));
        System.out.println("Add Two Double numbers: "+c1.add(10.5, 20.3));
        System.out.println("Add four integers: "+c1.add(10,20,30,40));


    }
}
