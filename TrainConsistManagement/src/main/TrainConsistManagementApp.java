package main;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> bogieIds = new ArrayList<>();
        String searchKey = "BG101";
        try {
            searchBogie(bogieIds, searchKey);
        } catch (IllegalStateException exception) {
            System.out.println("\nError : " + exception.getMessage());
        }
        System.out.println("\nProgram Continues Safely...");
    }

    private static void searchBogie(List<String> bogieIds, String searchKey) {
        // Fail-Fast Validation
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search. Train consist is empty.");
        }
        boolean found = false;
        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchKey)) {
                System.out.println("Bogie Found : " + searchKey);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}