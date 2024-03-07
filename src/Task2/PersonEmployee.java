package Task2;
class Person1 {
    // Attributes of the base class
    private String name;
    private int age;

    // Constructor for the base class
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for the base class attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person1 {
    // Additional attributes for the subclass
    private int employeeID;
    private double salary;

    // Constructor for the subclass using the super keyword to initialize Person attributes
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Initialize Person attributes using the super keyword
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter methods for the subclass attributes
    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }
}
public class PersonEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, 12345, 50000.0);

        // Access attributes using getter methods
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Salary: Rs " + employee.getSalary());
    }
}

