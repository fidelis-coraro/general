package Task4;

// Custom exception for age not within the specified range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
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
    String name;
    int age;
    private String course;

    // Parameterized constructor to initialize values
    public Student(int rollNo, String name, int age, String course) throws CustomValidationException {

        // Assign values to attributes
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Helper method to check if the name is valid
    public boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Example of creating a student with invalid name (contains numbers) and invalid age
            Student invalidStudent = new Student(2, "JaneDoe", 29, "Mathematics");

            validateStudent(invalidStudent);
        } catch (CustomValidationException e) {
            System.out.println( e.getMessage());
        }
    }

    private static void validateStudent(Student student) throws CustomValidationException {
        if (!student.isValidName(student.name) || student.age < 15 || student.age > 21) {
            StringBuilder message = new StringBuilder("Validation failed:");
            if (!student.isValidName(student.name)) {
                message.append(student.name+" Name should not contain numbers or special symbols.");
            }
            if (student.age < 15 || student.age > 21) {
                message.append(student.age +" Age should be between 15 and 21.");
            }
            throw new CustomValidationException(message.toString());
        }
    }
}


