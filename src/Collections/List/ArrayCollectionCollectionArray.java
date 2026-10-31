package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayCollectionCollectionArray {

    public static void main(String[] args) {
        Integer[] prices = {100,200,300,400,500};

        System.out.println("Original Array:");
        for(int price: prices){
            System.out.print(price+" ");
        }

//        Convert the array into an ArrayList.
        ArrayList<Integer> list = new ArrayList<>();

        for(int price: prices){
            list.add(price);
        }

        System.out.println();

        System.out.println("ArrayList after conversion");
        System.out.println(list);

//        Add two new prices: 600 and 700
        list.add(600);
        list.add(700);

        System.out.println();
        System.out.println("After adding two new prices");

        System.out.println(list);

//        Remove the price 200
        list.remove(Integer.valueOf(200));

        System.out.println();
        System.out.println("After removing 200");
        System.out.println();
        System.out.println(list);

//        Convert ArrayList into Integer Array
        prices = list.toArray(new Integer[0]);


        System.out.println("Final Array:");
        System.out.println(Arrays.toString(prices));



    }
}
