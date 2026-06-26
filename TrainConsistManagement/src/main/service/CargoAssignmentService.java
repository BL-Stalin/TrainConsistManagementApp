package main.service;

import main.exception.CargoSafetyException;
import main.model.GoodsBogie;

public class CargoAssignmentService {

    public void assignCargo(GoodsBogie bogie, String cargoType) {
        try {
            if (bogie.getShape().equalsIgnoreCase("Rectangular")
                    && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to a Rectangular Bogie.");
            }
            bogie.setCargoType(cargoType);
            System.out.println(
                    "Cargo assigned successfully.");
            System.out.println(bogie);
        } catch (CargoSafetyException exception) {
            System.out.println(
                    "Safety Violation : "
                            + exception.getMessage());
        } finally {
            System.out.println(
                    "Cargo assignment process completed.");
        }
    }
}