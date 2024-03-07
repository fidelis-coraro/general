package Task1;
import java.util.Scanner;
public class practice2 {
    public static void main (String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input
        int number = sc.nextInt();

        // Check if the number is negative, positive, or zero
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
