//Shape, Circle, Rectangle and Triangle
package OOP.Polymorphism;

    class shape{
//        Common method for all shapes
        public void drow(){
            System.out.println("Drowing a  shape");
        }
    }


    class Circle extends shape{
        @Override
        public void drow(){
            System.out.println("Drawing a Circle.");
        }
    }

    class Rectangle extends shape{
        @Override
        public void drow(){
            System.out.println("Drawing a  Rectangle ");
        }
    }
    class Triangle extends shape{
        @Override
        public void drow(){
            System.out.println("Drawing a Triangle");
        }
    }

    class Square extends shape{
        @Override
        public void drow(){
            System.out.println("Drowing a Square");
        }
    }

public class MethodOverriding {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        c1.drow();
        r1.drow();
        t1.drow();
        s1.drow();

    }
}
