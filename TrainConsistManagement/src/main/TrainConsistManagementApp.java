package main;


import main.exception.InvalidCapacityException;
import main.model.PassengerBogie;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        try {
            PassengerBogie sleeper =
                    new PassengerBogie(
                            "Sleeper",
                            72);
            System.out.println(
                    "\nBogie Created Successfully:");
            System.out.println(sleeper);
            PassengerBogie invalidBogie =
                    new PassengerBogie(
                            "AC Chair",
                            -10);
            System.out.println(invalidBogie);
        } catch (InvalidCapacityException exception) {
            System.out.println(
                    "\nError: "
                            + exception.getMessage());
        }
        System.out.println(
                "\nProgram Continues Safely...");
    }
}