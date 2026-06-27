package main;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG518"};
        String searchId = "BG309";
        boolean isFound = false;
        for (int index = 0; index < bogieIds.length; index++) {
            if (bogieIds[index].equals(searchId)) {
                System.out.println("\nBogie Found!");
                System.out.println("Bogie ID : " + searchId);
                System.out.println("Position : " + index);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("\nBogie ID " + searchId + " not found.");
        }
        System.out.println("\nProgram Continues...");
    }
}