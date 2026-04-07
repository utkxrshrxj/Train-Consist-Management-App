import java.util.Scanner;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create an array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Display bogie IDs
        System.out.println("\nBogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 3: Accept search key from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 4: Perform Linear Search
        boolean found = false;
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie ID " + searchKey + " found at position " + (i + 1));
                found = true;
                break; // Early termination once found
            }
        }

        // Step 5: Display result if not found
        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in train consist.");
        }

        scanner.close();
    }
}
