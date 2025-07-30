import java.util.*;

public class BrowseHistory {

    public static void main(String[] args) {
        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Browser History Simulator");

        while (true) {
            System.out.println("\n============================");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = sc.nextLine();
                    backStack.push(url);
                    forwardStack.clear();
                    System.out.println("Visited: " + url);
                    break;

                case 2:
                    if (backStack.size() > 1) {
                        forwardStack.push(backStack.pop());
                        System.out.println("Went back to: " + backStack.peek());
                    } else {
                        System.out.println("No page to go back to.");
                    }
                    break;

                case 3:
                    if (!forwardStack.isEmpty()) {
                        String forwardUrl = forwardStack.pop();
                        backStack.push(forwardUrl);
                        System.out.println("Went forward to: " + forwardUrl);
                    } else {
                        System.out.println("No page to go forward to.");
                    }
                    break;

                case 4:
                    if (!backStack.isEmpty()) {
                        System.out.println("Current Page: " + backStack.peek());
                    } else {
                        System.out.println("No pages visited yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting browser...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
