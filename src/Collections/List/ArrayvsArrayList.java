package Collections.List;

import java.util.ArrayList;

public class ArrayvsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = {10,20,30,40,50};

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        System.out.println(arr);

        System.out.println("ArrayList before: "+list);

        list.add(60);
        System.out.println("ArrayList after: "+ list);

        System.out.println("Array length: "+arr.length);
        System.out.println("ArrayList size: "+list.size());
    }
}
