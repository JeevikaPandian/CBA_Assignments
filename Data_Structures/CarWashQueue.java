import java.util.*;

public class CarWashQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Wash Service Queue System");

        while (true) {
            System.out.println("\n----------------------------");
            System.out.println("1. Add Normal Car to Queue");
            System.out.println("2. Add VIP Car to Front");
            System.out.println("3. Remove Washed Car");
            System.out.println("4. Show Current Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter car name: ");
                    String normalCar = sc.nextLine();
                    queue.addLast(normalCar);
                    System.out.println("Normal car added to end of the queue.");
                    break;

                case 2:
                    System.out.print("Enter VIP car name: ");
                    String vipCar = sc.nextLine();
                    queue.addFirst(vipCar);
                    System.out.println("VIP car added to the front of the queue.");
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        String removedCar = queue.removeFirst();
                        System.out.println("Car washed and removed: " + removedCar);
                    } else {
                        System.out.println("No cars in the queue.");
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. No cars waiting.");
                    } else {
                        System.out.println("Current Car Queue: " + queue);
                    }
                    break;

                case 5:
                    System.out.println("Exiting Car Wash Queue System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
