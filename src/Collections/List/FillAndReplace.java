package Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class FillAndReplace {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(45);
        marks.add(95);
        marks.add(60);
        marks.add(75);
        marks.add(30);

        System.out.println("Original Marks: "+marks);

        ArrayList<Integer> backup = new ArrayList<>(marks);


//        Using Collections.fill() to replace every element with 0;

        Collections.fill(marks, 0);
        System.out.println("After Fill: "+marks);

        // Restoring original marks from the backup list
        marks.clear();
        marks.addAll(backup);
        System.out.println("Comming to Original values: "+marks);

//        Swap to exchange the elements at index 1 and index 4
        System.out.println("Before swap: "+marks);

        Collections.swap(marks,1,4);
        System.out.println("After Swap: "+marks);

//        Search for a number using Collections.binarySearch()
//        first sort the numbers

        Collections.sort(marks);

        int index = Collections.binarySearch(marks, 95);
        System.out.println("Search 95: "+index);


    }
}
