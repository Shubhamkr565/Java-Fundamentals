package OOP.ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {

        int[] nums = {10,20,30};

        try {
            System.out.println(nums[5]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error occurred...");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
            System.out.println("Invalid array index....");
        }

        finally {
            System.out.println("Program End.....");
        }
    }
}
