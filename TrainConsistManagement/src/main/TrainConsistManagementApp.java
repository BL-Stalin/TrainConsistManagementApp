package main;

import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();
        // Add Bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("\nUnique Bogie IDs:");

        for (String bogieId : bogieIds) {
            System.out.println(bogieId);
        }
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}