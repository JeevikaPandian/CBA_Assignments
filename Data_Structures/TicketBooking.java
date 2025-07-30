import java.util.*;

public class TicketBooking {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ticket Booking System");

        while (true) {
            System.out.println("\n----------------------------");
            System.out.println("1. Add Person to Queue");
            System.out.println("2. Serve Next Person");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Show Current Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter person's name: ");
                    String nameToAdd = sc.nextLine();
                    queue.add(nameToAdd);
                    System.out.println("Added to booking queue: " + nameToAdd);
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String served = queue.poll();
                        System.out.println("Serving: " + served);
                    } else {
                        System.out.println("No one in the queue to serve.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to cancel ticket: ");
                    String nameToCancel = sc.nextLine();
                    if (queue.remove(nameToCancel)) {
                        System.out.println("Ticket cancelled for: " + nameToCancel);
                    } else {
                        System.out.println("Person not found in the queue.");
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is currently empty.");
                    } else {
                        System.out.println("Current Queue: " + queue);
                    }
                    break;

                case 5:
                    System.out.println("Exiting Ticket Booking System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 5.");
            }
        }
    }
}
