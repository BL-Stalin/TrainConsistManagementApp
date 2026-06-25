package main;

import main.model.Bogie;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(
                "Sleeper",
                "Passenger",
                72));
        bogies.add(new Bogie(
                "AC Chair",
                "Passenger",
                56));
        bogies.add(new Bogie(
                "First Class",
                "Passenger",
                24));
        bogies.add(new Bogie(
                "General",
                "Passenger",
                90));

        System.out.println("\nTrain Bogies:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
        System.out.println("\nTotal Seating Capacity : " + totalSeats);
    }
}