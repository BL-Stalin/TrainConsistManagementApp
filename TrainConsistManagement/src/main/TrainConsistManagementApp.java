package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.println("\nTrain ID : " + trainId);
        if (trainMatcher.matches()) {
            System.out.println("Train ID is Valid");
        } else {
            System.out.println("Train ID is Invalid");
        }
        System.out.println("\nCargo Code : " + cargoCode);
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is Valid");
        } else {
            System.out.println("Cargo Code is Invalid");
        }
    }
}