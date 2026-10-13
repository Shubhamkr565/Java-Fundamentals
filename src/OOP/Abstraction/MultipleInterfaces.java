package OOP.Abstraction;

    interface Printable{
        void print();
    }

    interface Scannable{
        void scan();
    }

    interface Faxable{
        void fax();
    }

class Printer implements Printable, Scannable, Faxable{
        @Override
        public void print(){
            System.out.println("Printing document...");
        }

        @Override
        public void scan(){
            System.out.println("Scanning document...");
        }

        @Override
    public void fax(){
            System.out.println("Sending fax...");

        }
    }





public class MultipleInterfaces {
    public static void main(String[] args) {
        Printer p1 = new Printer();

        p1.print();
        p1.scan();
        p1.fax();
    }
}
