package OOP.ExceptionHandling;

public class ThrowsPractice {

    public void checkAge(int age) throws IllegalArgumentException{
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("You are eligible to vote");
    }

    public static void main(String[] args) {
        ThrowsPractice t1 = new ThrowsPractice();

        try {
            t1.checkAge(16);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        finally {
            System.out.println("Program continues....");
        }

    }
}
