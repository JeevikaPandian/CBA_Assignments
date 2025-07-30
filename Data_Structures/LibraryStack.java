
import java.util.*;

public class LibraryStack {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Library Book Stack System");

        while (true) {
            System.out.println("\n----------------------------");
            System.out.println("1. Add Book to Stack");
            System.out.println("2. Remove Top Book");
            System.out.println("3. View Top Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    bookStack.push(book);
                    System.out.println("Book \"" + book + "\" added to the stack.");
                    break;

                case 2:
                    if (!bookStack.isEmpty()) {
                        String removedBook = bookStack.pop();
                        System.out.println("Removed book: " + removedBook);
                    } else {
                        System.out.println("No books in the stack to remove.");
                    }
                    break;

                case 3:
                    if (!bookStack.isEmpty()) {
                        System.out.println("Top book: " + bookStack.peek());
                    } else {
                        System.out.println("No books in the stack.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Library Stack System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
    }
}
