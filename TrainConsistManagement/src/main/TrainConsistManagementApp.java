package main;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println(
                "=== Train Consist Management App ===");
        int[] capacities = {72, 24, 56, 90, 48};
        System.out.println("\nPassenger Bogie Capacities Before Sorting:");
        displayArray(capacities);
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        System.out.println("\nPassenger Bogie Capacities After Sorting:");
        displayArray(capacities);
    }

    private static void displayArray(int[] capacities) {
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
        System.out.println();
    }
}