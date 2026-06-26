package main;

import main.model.Bogie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(
                "=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create large dataset
        for (int i = 1; i <= 100000; i++) {

            bogies.add(
                    new Bogie(
                            "Sleeper-" + i,
                            "Passenger",
                            i % 100));
        }

        // -----------------------------
        // Loop Based Filtering
        // -----------------------------
        long loopStartTime =
                System.nanoTime();

        List<Bogie> loopResult =
                new ArrayList<>();

        for (Bogie bogie : bogies) {

            if (bogie.getCapacity() > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEndTime =
                System.nanoTime();

        long loopExecutionTime =
                loopEndTime - loopStartTime;

        // -----------------------------
        // Stream Based Filtering
        // -----------------------------
        long streamStartTime =
                System.nanoTime();

        List<Bogie> streamResult =
                bogies.stream()
                        .filter(
                                bogie ->
                                        bogie.getCapacity() > 60)
                        .collect(Collectors.toList());

        long streamEndTime =
                System.nanoTime();

        long streamExecutionTime =
                streamEndTime - streamStartTime;

        System.out.println(
                "\nLoop Result Count : "
                        + loopResult.size());

        System.out.println(
                "Loop Execution Time : "
                        + loopExecutionTime
                        + " ns");

        System.out.println(
                "\nStream Result Count : "
                        + streamResult.size());

        System.out.println(
                "Stream Execution Time : "
                        + streamExecutionTime
                        + " ns");
    }
}