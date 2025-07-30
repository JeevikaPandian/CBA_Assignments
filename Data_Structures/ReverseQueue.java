import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        // Enqueue customers
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear input buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();
            queue.add(name);
        }

        System.out.println("Original Queue: " + queue);

        // Step 1: Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Move all elements from stack back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}