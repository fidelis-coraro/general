package Task2;

class Person {
    // Properties of the class
    private String name="john";
    private int age;

    // Default constructor with default age set to 18
    public Person() {

        this.age = 18;
    }

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name ;
        this.age = age;
    }

    // Method to display name and age of the person
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        // Creating a person object with default age
        Person person1 = new Person();
        System.out.println("Person 1 Details:");
        person1.displayPersonInfo();
        System.out.println();

        // Creating a person object with specified name and age
        Person person2 = new Person("John Doe", 25);
        System.out.println("Person 2 Details:");
        person2.displayPersonInfo();

    }
}
