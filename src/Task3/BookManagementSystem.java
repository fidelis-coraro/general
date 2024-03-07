package Task3;
import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

class Library {
    private Book[] books;
    private int size;
    private static final int MAX_SIZE = 100;

    public Library() {
        this.books = new Book[MAX_SIZE];
        this.size = 0;
    }

    public void addBook(Book book) {
        if (size < MAX_SIZE) {
            books[size++] = book;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setAvailable(false);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void searchBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found: " + books[i]);
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book newBook = new Book(bookID, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = sc.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = sc.nextInt();
                    library.searchBook(searchID);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting the Library System. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

