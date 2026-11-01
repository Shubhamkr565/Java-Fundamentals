package Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(10);

        System.out.println("Number: "+numbers);

//        Find the max number using collections.max()
        System.out.println("Maximun Number: "+Collections.max(numbers));

//        find the min number using collections.min()
        System.out.println("Minimun Number: "+Collections.min(numbers));

//        Count how many times 20 appears using collections.frequency()
        System.out.println("Frequency of 20: "+Collections.frequency(numbers,20));

//        count how many times 10 appears
        System.out.println("Frequency of 10: "+Collections.frequency(numbers, 10));

//        display total number of element:
        System.out.println("Total Element: "+numbers.size());

    }

}
