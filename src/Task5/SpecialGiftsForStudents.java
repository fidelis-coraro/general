package Task5;

import java.util.*;
import java.util.stream.Collectors;

public class SpecialGiftsForStudents {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Anna", "Alex", "John", "Amy", "Adam", "Ava", "David", "Andrew");

        // Filter students whose names start with "A"
        List<String> studentsWithSpecialGifts = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the students who will receive special gifts
        System.out.println("Students who will receive special gifts:");
        studentsWithSpecialGifts.forEach(System.out::println);
    }
}
