/*
 * Author: Jeevika
 */

import java.util.*;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "jeevika@123"; // customized password
        String enteredPassword;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        System.out.println("===== Welcome to Jeevika's Secure Portal =====");

        do {
            if (attempts >= MAX_ATTEMPTS) {
                System.out.println("Maximum attempts reached. Access denied.");
                System.exit(0);
            }

            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again.\n");
                attempts++;
            }
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted, Jeevika! You logged in on attempt #" + (attempts + 1));
        System.out.println("Hello Jeevika! Welcome to your personalized dashboard.");
        scanner.close();
    }
}
