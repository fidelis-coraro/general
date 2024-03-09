package Task4;
import java.util.Scanner;
public class WeekdayArrayException {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = sc.nextInt();

                String dayName = weekdays[dayIndex];
                System.out.println("The day at position " + dayIndex + " is: " + dayName);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception: " + e.getMessage());
        }
    }
}




