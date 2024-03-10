package Task4;

// Custom exception for age not within the specified range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class with exception handling
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor to initialize values
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        // Validate name
        if (!isValidName(name)) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }

        // Assign values to attributes
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Helper method to check if the name is valid
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Example of creating a student with valid information
            Student validStudent = new Student(1, "JohnDoe", 20, "Computer Science");

            // Example of creating a student with invalid age (outside the range)
            Student invalidAgeStudent = new Student(2, "JaneDoe", 22, "Mathematics");

            // Example of creating a student with invalid name (contains numbers)
           // Student invalidNameStudent = new Student(3, "Alice123", 19, "Physics");

        }  catch (AgeNotWithinRangeException e) {
            // Handle AgeNotWithinRangeException here
            System.out.println("AgeNotWithinRangeException: " + e.getMessage());
        } catch (NameNotValidException e) {
            // Handle NameNotValidException here
            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}


