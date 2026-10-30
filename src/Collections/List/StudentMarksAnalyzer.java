package Collections.List;

import com.sun.net.httpserver.Headers;

import java.util.ArrayList;

public class StudentMarksAnalyzer {


    public static void main(String[] args) {

        ArrayList<Integer> student = new ArrayList<>();

        student.add(85);
        student.add(65);
        student.add(90);
        student.add(45);
        student.add(78);
        student.add(88);
        student.add(55);
        student.add(95);

        System.out.println(student);

        System.out.println("Total Students: "+student.size());
        int HighestMarks = 0;
        int LowestMarks = 100;
        int sum = 0;
        int count = 0;
        double Average = 0.0;

        for(int i=0; i<=student.size()-1; i++){
            if(HighestMarks < student.get(i)){
                HighestMarks = student.get(i);

            }
        }
        for(int i=0; i<=student.size()-1; i++){
            if(LowestMarks > student.get(i)){
                LowestMarks = student.get(i);

            }
        }
        for(int i=0; i<=student.size()-1; i++){
             sum += student.get(i);
        }

        for(int i=0; i<=student.size()-1; i++){
            if(student.get(i) >75){
                count++;
            }
        }

        Average = (double)sum/student.size();

        System.out.println("Highest Marks: "+ HighestMarks);
        System.out.println("Lowest Marks: "+ LowestMarks);
        System.out.println("Average Marks: "+ Average);
        System.out.println("Above 75: "+count);

    }
}
