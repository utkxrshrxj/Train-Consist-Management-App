import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create an unsorted array of bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort the array (Binary Search requires sorted data)
        Arrays.sort(bogieIds);

        // Step 3: Display sorted bogie IDs
        System.out.println("\nSorted Bogie IDs in Train:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 4: Accept search key from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 5: Perform Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("Bogie ID " + searchKey + " found at position " + (mid + 1));
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }

        // Step 6: Display result if not found
        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in train consist.");
        }

        scanner.close();
    }
}
