import java.util.*;

public class SimpleUndoRedo {

    public static void main(String[] args) {
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Undo-Redo System");

        while (true) {
            System.out.println("\n============================");
            System.out.println("1. Perform Action");
            System.out.println("2. Undo Last Action");
            System.out.println("3. Redo Last Undone Action");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter action: ");
                    String action = sc.nextLine();
                    undo.push(action);
                    redo.clear(); // Clear redo stack on new action
                    System.out.println("Action performed: " + action);
                    break;

                case 2:
                    if (!undo.isEmpty()) {
                        String undoneAction = undo.pop();
                        redo.push(undoneAction);
                        System.out.println("Undo performed: " + undoneAction);
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 3:
                    if (!redo.isEmpty()) {
                        String redoneAction = redo.pop();
                        undo.push(redoneAction);
                        System.out.println("Redo performed: " + redoneAction);
                    } else {
                        System.out.println("Nothing to redo.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter between 1 to 4.");
            }
        }
    }
}
