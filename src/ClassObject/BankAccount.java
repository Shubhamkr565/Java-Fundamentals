// Create a BankAccount class with accountHolder and balance.
// Add deposit() and withdraw() methods. Prevent withdrawals greater than the available balance.
package ClassObject;

    class Bank{
        String AccontHolder;
        double balance;

        Bank(String AccountHolder, double balance){
            this.AccontHolder = AccountHolder;
            this.balance = balance;
        }

        public void deposit(double amount){
            balance += amount;
            System.out.println("Account Holder Name: "+AccontHolder+" Deposite Amount: "+amount);

        }

        public void withDrow(double amount){
            balance -= amount;
            System.out.println("Account Holder Name: "+AccontHolder + " Withdrow Amount: "+amount);
        }

        public void display(){
            System.out.println("Name: "+AccontHolder);
            System.out.println("Amount: "+balance);
            System.out.println("========================");
        }


    }

public class BankAccount {

    public static void main(String[] args) {
        Bank b1 = new Bank("Ram", 15000);
        b1.deposit(15000);
        b1.withDrow(1000);
        b1.display();

        Bank b2 = new Bank("Ramesh", 5000);
        b2.deposit(50000);
        b2.withDrow(20000);
        b2.display();

    }

}
