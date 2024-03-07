package Task2;
import java.util.Scanner;

class Product {
    private int productId;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class ProductEntry {
    // Method to accept product information from the user and store in an array
    public static Product[] acceptProductInformation() {
        Scanner sc = new Scanner(System.in);

        // Create an array to store product information
        Product[] products = new Product[5];

        // Accept product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int productId = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            // Create a new Product object and store it in the array
            products[i] = new Product(productId, price, quantity);
        }

        return products;
    }

    // Method to find the product ID with the highest price
    public static int findMaxPriceProductId(Product[] products) {
        if (products == null || products.length == 0) {
            return -1; // Return -1 if the array is empty
        }

        int maxPriceProductId = products[0].getProductId();
        double maxPrice = products[0].getPrice();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPriceProductId = products[i].getProductId();
            }
        }

        return maxPriceProductId;
    }

    // Method to calculate and return the total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }

    // Main function
    public static void main(String[] args) {
        // Accept product information from the user
        Product[] products = acceptProductInformation();

        // Find the product ID of the product with the highest price
        int maxPriceProductId = findMaxPriceProductId(products);

        // Display the result
        System.out.println("Product ID with the highest price: " + maxPriceProductId);

        // Calculate and display the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: Rs" + totalAmountSpent);
    }
}

