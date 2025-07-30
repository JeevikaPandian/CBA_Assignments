import java.util.*;

public class AdmissionQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Normal Student");
            System.out.println("2. Add VIP Student");
            System.out.println("3. Admit Student");
            System.out.println("4. Show Queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            if (ch == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                queue.addLast(name);
                System.out.println("Student added at end.");
            } else if (ch == 2) {
                System.out.print("Enter VIP student name: ");
                String name = sc.nextLine();
                queue.addFirst(name);
                System.out.println("VIP student added at front.");
            } else if (ch == 3) {
                if (!queue.isEmpty()) {
                    System.out.println("Admitted: " + queue.removeFirst());
                } else {
                    System.out.println("No students in queue.");
                }
            } else if (ch == 4) {
                System.out.println("Current Queue: " + queue);
            } else if (ch == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
