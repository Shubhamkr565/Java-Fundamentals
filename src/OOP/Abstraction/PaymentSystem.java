//Create an abstract Payment class with an abstract pay() method.
// Implement it in UpiPayment and CardPayment classes and demonstrate runtime polymorphism.

package OOP.Abstraction;

    abstract class Payment{
        public abstract void pay();
    }

    class UpiPayment extends Payment{
        @Override
        public void pay(){
            System.out.println("Payment Using UPI ");
        }
    }

    class CardPayment extends  Payment{
        @Override
        public void pay(){
            System.out.println("Payment Using Card Payment");
        }
    }

    class CashPayment extends Payment{
        @Override
        public void pay(){
            System.out.println("Payment Using Cash ");
        }
    }

public class PaymentSystem {

    public static void main(String[] args) {

        UpiPayment u1 = new UpiPayment();
        CardPayment c1 = new CardPayment();
        CashPayment cash = new CashPayment();


        u1.pay();
        System.out.println("========================");
        c1.pay();
        System.out.println("========================");
        cash.pay();
        System.out.println("========================");


        // Parent references holding child objects
        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new CashPayment();

        p1.pay();
        System.out.println("========================");
        p2.pay();
        System.out.println("========================");
        p3.pay();
    }
}
