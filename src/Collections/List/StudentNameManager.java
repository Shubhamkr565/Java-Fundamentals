package Collections.List;

import java.util.ArrayList;

public class StudentNameManager {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");

        System.out.println("Students: "+students);

        System.out.println("Total Number of Student: "+students.size());

        System.out.println("First Student name: "+students.get(0));

        System.out.println("Last Student name: "+students.get(students.size()-1) );

    }
}
