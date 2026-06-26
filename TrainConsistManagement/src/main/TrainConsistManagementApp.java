package main;

import main.model.GoodsBogie;
import main.service.CargoAssignmentService;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println(
                "=== Train Consist Management App ===");

        CargoAssignmentService service =
                new CargoAssignmentService();

        GoodsBogie bogie =
                new GoodsBogie(
                        "BG101",
                        "Rectangular");

        service.assignCargo(
                bogie,
                "Petroleum");

        System.out.println(
                "\nApplication Continues Running...");
    }
}