package main.model;

import main.exception.InvalidCapacityException;

public class PassengerBogie {

    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid Capacity: Capacity must be greater than zero.");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
