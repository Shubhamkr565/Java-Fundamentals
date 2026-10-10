//Create a Student class with private marks.
// Add a setter that accepts marks only between 0 and 100, and a getter to read them.

package OOP.Encapsulation;

    class Student{
        private int marks;

        public int getMarks(){
            return marks;
        }
        public void setMarks(int marks){
            if(marks >= 0 && marks <= 100){
                this.marks = marks;
            }else{
                System.out.println("Invalid Marks! Enter marks between 0 to 100");
            }

        }
    }


public class StudentMarks {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setMarks(90);

        System.out.println("Student Marks: "+ s1.getMarks());
    }
}
