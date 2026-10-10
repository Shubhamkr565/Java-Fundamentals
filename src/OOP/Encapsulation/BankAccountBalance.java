//Create a BankAccount class with a private balance variable.

package OOP.Encapsulation;

    class BankAccount{
        private double balance;

//        Using gitter
        public double getBalance(){
            return balance;
        }

//        Using setter
        public void setBalance(double balance){
            if(balance >=0){
                this.balance = balance;
            }else{
                System.out.println("Invalid Balance!");
            }
        }
    }


public class BankAccountBalance {


    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setBalance(15000);
        System.out.println("Account Balance: " + b1.getBalance());

    }


}
