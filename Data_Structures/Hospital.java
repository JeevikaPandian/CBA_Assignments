import java.util.*;

public class Hospital {

    public static void main(String[] args) {
        LinkedList<String> beds = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hospital Bed Management System");

        while (true) {
            System.out.println("\n============================");
            System.out.println("1. Add Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Show All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    beds.add(name);
                    System.out.println("Patient added.");
                    break;

                case 2:
                    System.out.print("Enter name to discharge: ");
                    String removeName = sc.nextLine();
                    if (beds.remove(removeName)) {
                        System.out.println("Patient discharged.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    if (beds.isEmpty()) {
                        System.out.println("No patients currently admitted.");
                    } else {
                        System.out.println("Current Patients: " + beds);
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 4.");
            }
        }
    }
}




