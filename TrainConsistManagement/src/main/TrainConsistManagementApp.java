package main;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> trainConsist = new ArrayList<>();
        // Add Passenger Bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(trainConsist);

        trainConsist.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(trainConsist);

        boolean isSleeperPresent = trainConsist.contains("Sleeper");

        System.out.println("\nIs Sleeper Bogie Present? " + isSleeperPresent);
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}