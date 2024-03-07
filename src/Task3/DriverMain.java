package Task3;
import java.util.Scanner;

// Interface Taxable
interface Taxable {
    double SALES_TAX_PERCENTAGE = 7.0;
    double INCOME_TAX_PERCENTAGE = 10.5;

    void calcTax();
}

// Class Employee implementing Taxable
class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double incomeTax = (salary * INCOME_TAX_PERCENTAGE) / 100;
        System.out.println("Income Tax for employee " + name + " (EmpID: " + empId + "): Rs" + incomeTax);
    }
}

// Class Product implementing Taxable
class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double salesTax = (price * SALES_TAX_PERCENTAGE * quantity) / 100;
        System.out.println("Sales Tax for product (PID: " + pid + "): Rs" + salesTax);
    }
}
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Employee Salary: Rs");
        double empSalary = sc.nextDouble();

        // Create Employee object and calculate income tax
        Employee employee = new Employee(empId, empName, empSalary);
        employee.calcTax();

        // Accept product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();
        System.out.print("Enter Product Price: Rs");
        double productPrice = sc.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int productQuantity = sc.nextInt();

        // Create Product object and calculate sales tax
        Product product = new Product(productId, productPrice, productQuantity);
        product.calcTax();

    }
}

