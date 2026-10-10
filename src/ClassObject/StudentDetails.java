//Create a Student class with name, age and marks. Create two objects and display the details of both students.

package ClassObject;

class Student{
    String name;
    int age;
    int marks;

//    constructor
    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);

        System.out.println("==========================");

    }
}


public class StudentDetails {

    public static void main(String[] args) {
        Student s1 = new Student("Ram",25,900);
        Student s2 = new Student("Shyam",28,850);

        s1.display();
        s2.display();
    }

}
