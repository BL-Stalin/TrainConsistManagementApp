package main;

import main.model.Bogie;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        System.out.println("\nAll Bogies:");

        bogies.forEach(System.out::println);

        List<Bogie> highCapacityBogies =
                bogies.stream()
                        .filter(bogie -> bogie.getCapacity() > 60)
                        .toList();
        System.out.println("\nHigh Capacity Bogies (Capacity > 60):");
        highCapacityBogies.forEach(System.out::println);
    }
}