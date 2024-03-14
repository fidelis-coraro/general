package Task5;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class UppercaseConverter {
    public static void main(String[] args) {
        // Given list of strings
        Stream<String> names = Stream.of("aBc","d","ef");

        // Convert the list of strings to uppercase using map()
        List<String> uppercaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the uppercase names
        System.out.println("Uppercase names: " + uppercaseNames);
    }
}
