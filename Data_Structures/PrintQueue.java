
import java.util.*;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Print Job");
            System.out.println("2. Process Job");
            System.out.println("3. View Pending Jobs");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter job name: ");
                    String job = sc.nextLine();
                    queue.add(job);
                    System.out.println("Job added.");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No jobs to process.");
                    } else {
                        System.out.println("Processing: " + queue.poll());
                    }
                    break;

                case 3:
                    System.out.println("Pending Jobs: " + queue);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

