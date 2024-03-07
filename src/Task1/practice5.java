package Task1;

import java.util.Scanner;

public class practice5 {
    public static void main (String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the purchase amount
        System.out.print("Enter the purchase amount: ");
        float purchaseAmount = sc.nextFloat();

        // Calculate the final payable amount based on discount criteria
        float discount = 0.0f;

        if (purchaseAmount < 500) {
            // No discount for amounts less than 500
            discount = 0.0f;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            // 10% discount for amounts between 500 and 1000
            discount = 0.1f;
        } else if (purchaseAmount > 1000) {
            // 20% discount for amounts greater than 1000
            discount = 0.2f;
        }

        // Calculate the final payable amount
        float payableAmount = purchaseAmount - (purchaseAmount * discount);

        // Display the results
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Final Payable Amount: " + payableAmount);
    }
}

