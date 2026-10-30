package Collections.List;

import java.util.ArrayList;

public class EmployeeRecordManager {

    public static void main(String[] args) {

        ArrayList<String> emp = new ArrayList<>();

        emp.add("Amit");
        emp.add("Rahul");
        emp.add("Priya");
        emp.add("Neha");
        emp.add("Rohit");

        System.out.println("Emp Name: "+emp);

        emp.remove("Neha");

        emp.contains("Priya");
        System.out.println("Update Emp data: "+emp);

    }
}
