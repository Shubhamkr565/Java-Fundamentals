
package OOP.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Declares that this method may throw IOException
    public static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

        System.out.println("File opened successfully");

        file.close();
    }

    public static void main(String[] args) {

        try {
            // Calling method that declares IOException
            readFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
