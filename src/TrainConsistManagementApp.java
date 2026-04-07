public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create an array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Step 2: Display original capacities
        System.out.println("\nOriginal Passenger Bogie Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }

        // Step 3: Bubble Sort algorithm
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 4: Display sorted capacities
        System.out.println("\n\nSorted Passenger Bogie Capacities (Bubble Sort):");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}
