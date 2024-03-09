package Task4;
import java.util.*;
public class StudentGradeSystem {
    private Map<String, Integer> studentGrades;

    public StudentGradeSystem() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade: " + grade);
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            int removedGrade = studentGrades.remove(name);
            System.out.println("Student " + name + " removed. Grade was: " + removedGrade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayGradeByName(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade of student " + name + " is: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeSystem gradeSystem = new StudentGradeSystem();

        // Sample usage
        gradeSystem.addStudent("John", 85);
        gradeSystem.addStudent("Alice", 92);
        gradeSystem.addStudent("Bob", 78);

        System.out.println("\nOptions:");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Grade by Name");
        System.out.println("0. Exit");

        int option;
        do {
            System.out.print("\nEnter your option (0-3): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.next();
                    System.out.print("Enter student grade: ");
                    int addGrade = scanner.nextInt();
                    gradeSystem.addStudent(addName, addGrade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.next();
                    gradeSystem.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.next();
                    gradeSystem.displayGradeByName(displayName);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option (0-3).");
            }
        } while (option != 0);

    }
}

