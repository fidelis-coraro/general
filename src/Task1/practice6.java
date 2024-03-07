package Task1;

public class practice6 {
    public static void main(String[] args) {
        int rows = 5;
        // for loop to print the pattern
        for (int i = rows; i >= 1; i--) {
            // Print the numbers for each row
            for (int j = rows; j >= 1; j--) {
                if (i > j) {
                    System.out.print(i);
                } else {
                    System.out.print(j);
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}




