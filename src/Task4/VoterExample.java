package Task4;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private String voterId;
    private String name;
    private int age;

    // Parameterized constructor with checked exception
    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

public class VoterExample {
    public static void main(String[] args) {
        try {
            // Example of creating a voter with valid age
            Voter validVoter = new Voter("V123", "Sachin", 25);

            // Example of creating a voter with invalid age
            Voter invalidVoter = new Voter("V456", "virat", 17);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}

