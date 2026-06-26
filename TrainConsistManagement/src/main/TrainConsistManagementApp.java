package main;

import main.model.GoodsBogie;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie(
                "BG101",
                "Cylindrical",
                "Petroleum"));
        goodsBogies.add(new GoodsBogie(
                "BG102",
                "Open",
                "Coal"));
        goodsBogies.add(new GoodsBogie(
                "BG103",
                "Covered",
                "Food Grains"));
        System.out.println("\nGoods Bogies:");

        goodsBogies.forEach(System.out::println);
        boolean isSafetyCompliant = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.getBogieType()
                                .equalsIgnoreCase(
                                        "Cylindrical") ||
                                bogie.getCargoType()
                                        .equalsIgnoreCase(
                                                "Petroleum"));

        System.out.println("\nSafety Compliance Status : " + isSafetyCompliant);
        if (isSafetyCompliant) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train FAILED safety compliance check.");
        }
    }
}