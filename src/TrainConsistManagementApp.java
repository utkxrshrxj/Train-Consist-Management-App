import java.util.ArrayList;
import java.util.List;

// Step 1: Define a custom runtime exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie class with cargo assignment logic
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Method to assign cargo with validation
    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe assignment: Rectangular bogie cannot carry Petroleum!");
            }
            this.cargo = cargo;
            System.out.println(type + " bogie successfully assigned cargo: " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println("Error assigning cargo: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for bogie type: " + type);
        }
    }

    @Override
    public String toString() {
        return type + " carrying " + (cargo == null ? "No Cargo" : cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 3: Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        goodsBogies.add(cylindrical);
        goodsBogies.add(rectangular);

        // Step 4: Assign cargo safely
        System.out.println("\nAssigning Cargo:");
        cylindrical.assignCargo("Petroleum");   // Safe
        rectangular.assignCargo("Petroleum");   // Unsafe, triggers exception
        rectangular.assignCargo("Coal");        // Safe

        // Step 5: Display final bogie states
        System.out.println("\nFinal Goods Bogies in Train:");
        for (GoodsBogie bogie : goodsBogies) {
            System.out.println(bogie);
        }
    }
}
