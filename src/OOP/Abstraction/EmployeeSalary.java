
package OOP.Abstraction;

// Abstract parent class
abstract class Employee {

    // Abstract method: child classes must implement it
    public abstract void calculateSalary();

    // Concrete method: inherited by child classes
    public void displayRole() {
        System.out.println("Employee salary details");
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    // Constructor to initialize monthly salary
    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {

    double hoursWorked;
    double hourlyRate;

    // Constructor to initialize working hours and hourly rate
    PartTimeEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Salary: " + salary);
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        // Parent references holding child objects
        Employee ram = new FullTimeEmployee(30000);
        Employee amit = new PartTimeEmployee(80, 200);

        System.out.println("--- Full-Time Employee ---");
        ram.displayRole();
        ram.calculateSalary();

        System.out.println("=====================");

        System.out.println("--- Part-Time Employee ---");
        amit.displayRole();
        amit.calculateSalary();
    }
}
