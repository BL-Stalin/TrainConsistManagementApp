package main;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(
                "=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG518", "BG620", "BG725"};
        // Ensure array is sorted
        Arrays.sort(bogieIds);
        String searchKey = "BG412";
        int low = 0;
        int high = bogieIds.length - 1;
        boolean isFound = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = bogieIds[mid].compareTo(searchKey);
            if (comparison == 0) {
                System.out.println("\nBogie Found!");
                System.out.println("Bogie ID : " + searchKey);
                System.out.println("Position : " + mid);
                isFound = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!isFound) {
            System.out.println("\nBogie ID " + searchKey + " not found.");
        }
        System.out.println("\nProgram Continues...");
    }
}