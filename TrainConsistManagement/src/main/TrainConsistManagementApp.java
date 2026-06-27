package main;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        String[] bogieNames = {"Sleeper", "First Class", "Cargo", "AC Chair", "Guard"};
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        // Sort Alphabetically
        Arrays.sort(bogieNames);
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}