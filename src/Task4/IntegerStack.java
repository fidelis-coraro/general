package Task4;
import java.util.*;
public class IntegerStack {
    private List<Integer> stack;

    public IntegerStack() {
        stack = new ArrayList<>();
    }

    // Push operation to add an element to the stack
    public void push(int element) {
        stack.add(element);
        System.out.println("Pushed element: " + element);
    }

    // Pop operation to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int poppedElement = stack.remove(stack.size() - 1);
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Push some elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Pop elements from the stack
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        // Try to pop from an empty stack (will throw EmptyStackException)
        //integerStack.pop();
        System.out.println("Is the stack empty? " + integerStack.isEmpty());
    }
}

