package OOP.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int result = a/b;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero...");
        }

        System.out.println("Program continues.......");
    }
}

/*
Java enters the try block.
a / b throws an ArithmeticException.
Java skips the remaining statements in that try block.
The matching catch block handles the exception.
Execution continues after the try/catch construct.
 */