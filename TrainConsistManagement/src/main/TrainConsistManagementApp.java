package main;

import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}