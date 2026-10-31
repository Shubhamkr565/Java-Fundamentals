package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class CollegeStudentManagementSystem2 {

    public static void main(String[] args) {

        // Create two collections
        ArrayList<String> students = new ArrayList<>();
        HashSet<String> uniqueStudents = new HashSet<>();

        // Adding students
        String[] newStudents = {
                "Rahul", "Amit", "Priya", "Rahul", "Rohit"
        };

        for (String name : newStudents) {

            if (uniqueStudents.add(name)) {

                students.add(name);
                System.out.println(name + " added successfully");

            } else {

                System.out.println("Student already exists: " + name);
            }
        }

        // Search for a student
        System.out.println("\nSearch Student:");

        String searchName = "Rahul";

        if (uniqueStudents.contains(searchName)) {
            System.out.println(searchName + " is present");
        } else {
            System.out.println(searchName + " is not present");
        }

        // Remove a student
        System.out.println("\nRemove Student:");

        String removeName = "Amit";

        if (uniqueStudents.remove(removeName)) {

            students.remove(removeName);
            System.out.println(removeName + " removed successfully");

        } else {

            System.out.println(removeName + " not found");
        }

        // Final student list
        System.out.println("\nFinal Students: " + students);
        System.out.println("Total Students: " + students.size());
    }
}