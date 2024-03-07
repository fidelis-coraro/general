package Task1;

import java.util.Scanner;

public class practice3 {
    public static void main (String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input
        int number = sc.nextInt();

        int reverse=0,r;
        // Reverse the number using a loop
        while(number>0){
            r=number%10;reverse=reverse*10+r;
            number=number/10;
        }
        // Display the reversed number
        System.out.println("reversed number is:"+reverse);
    }
}

