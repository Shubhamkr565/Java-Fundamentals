package OOP.ExceptionHandling;

    class BankAccount {
    int balance = 5000;

    public void withdraw(int amount){
            if(amount > balance) {
                throw new IllegalArgumentException("Insufficient balance!");
            }
            System.out.println("Withdrow Amount Successfully");
            balance = balance-amount;
            System.out.println("Remaining Balance: "+ balance);

    }

    public static void main(String[] args) {
        BankAccount ram = new BankAccount();

        try {
//            ram.withdrow(1000);
            ram.withdraw(70000);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        finally {
            System.out.println("Program Continues.......");
        }

    }
}
