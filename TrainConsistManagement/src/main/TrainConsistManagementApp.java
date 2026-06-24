package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        Set<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("\nTrain Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
        System.out.println("\nFinal Formation:");
        System.out.println(trainFormation);
    }
}