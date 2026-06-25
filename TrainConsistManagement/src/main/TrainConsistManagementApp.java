package main;

import main.model.Bogie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                "Cargo A",
                "Goods",
                100));
        bogies.add(new Bogie(
                "Cargo B",
                "Goods",
                120));

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(
                                Bogie::getType));

        System.out.println("\nGrouped Bogies:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println("\n" + type + " Bogies:");
            bogieList.forEach(System.out::println);
        });
    }
}