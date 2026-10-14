
package OOP.ExceptionHandling;

public class AgeValidator {

    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                // Throw an exception if age is below 18
                throw new IllegalArgumentException(
                        "Age must be 18 or above"
                );
            }

            // Executes only if age is 18 or above
            System.out.println("You are eligible to vote");

        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
