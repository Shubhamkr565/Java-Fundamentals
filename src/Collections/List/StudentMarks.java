package Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(45);
        marks.add(95);
        marks.add(60);
        marks.add(75);
        marks.add(30);


        System.out.println("Original Marks: "+marks);

//        Sorts marks in ascending order using Collections.sort().

        Collections.sort(marks);

        System.out.println("Ascending Order: "+marks);

//        Reverse the list using Collections.reverse().

        Collections.reverse(marks);

        System.out.println("Descending Order: "+marks);




    }
}
