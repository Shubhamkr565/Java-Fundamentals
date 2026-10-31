package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class CollegeStudentManagementSystem {

    public static void main(String[] args) {
//        Adding student
        HashSet<String> list = new HashSet<>();

        list.add("Rahul");
        list.add("Amit");
        list.add("Priya");
        list.add("Rahul");

        for(String name: list){
            System.out.println("Add: "+name);
        }
        System.out.println("student: "+list);

//        Privent duplicate name
//        System.out.println("Privent duplicate names");
//        HashSet<String> RemoveDuplicate = new HashSet<>();
//
//        for(String name: list){
//            RemoveDuplicate.add(name);
//        }
//        System.out.println(RemoveDuplicate);

        System.out.println();

        System.out.println("Search for a student");
        boolean isPresent = list.contains("Rahul");

        System.out.println("Search Rahul: "+ isPresent);

//        Remove a student
        System.out.println();
        System.out.println("Remove student: ");
        list.remove("Amit");
        System.out.println("Remove Amit: successful");

        System.out.println();
        System.out.println("Final Students"+ list);
        System.out.println("Total Student: "+list.size());


    }
}
