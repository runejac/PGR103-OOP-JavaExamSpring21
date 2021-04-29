import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadFile implements EquipmentSupply {

    private final String file;

    // constructor that takes the .txt file
    public ReadFile(String file) {
        this.file = file;
    }


    // task 1) class reads from file, and the method below returns eventually the collection of equipments read from the file
    @Override
    public Set<Equipment> equipmentFromFile() throws Exception {
        // making a Set that will collect all the equipment read from file
        Set<Equipment> equipment = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(file))) {

            while (scanner.hasNextLine()) {
                String equipmentName = scanner.nextLine();

                switch (equipmentName) {
                    case "Ball" -> {
                        // reading the Ball object, and then returning new Ball object, then adding it into the Set
                        Ball ball = readBall(scanner);
                        equipment.add(ball);
                    }
                    case "TableTennisRacket" -> {
                        // reading the TableTennisRacket object, and then returning new TableTennisRacket object, then adding it into the Set
                        TableTennisRacket tableTennisRacket = readRacket(scanner);
                        equipment.add(tableTennisRacket);
                    }
                    // if there is no match, this would have been threw
                    default -> throw new RuntimeException("Not an equipment");
                }
            }
            // returns the Set when the while loop is false = done
        } return equipment;
    }

    // method for reading a Ball object, with its parameters for each line in the correct order
    private Ball readBall(Scanner ballScanner) {

        int id = Integer.parseInt(ballScanner.nextLine());
        String lockerNumber = ballScanner.nextLine();

        // no need for helper methods here because of Boolean.parseBoolean() method
        boolean hasToBeReplaced = Boolean.parseBoolean(ballScanner.nextLine());
        String typeOfBall = ballScanner.nextLine();
        boolean needMoreAir = Boolean.parseBoolean(ballScanner.nextLine());
        // reading every line and makes a Ball object
        return new Ball(id, lockerNumber, hasToBeReplaced, typeOfBall, needMoreAir);
    }

    // method for reading a TableTennisRacket object, with its parameters for each line in the correct order
    private TableTennisRacket readRacket(Scanner racketScanner) {

        int id = Integer.parseInt(racketScanner.nextLine());
        String lockerNumber = racketScanner.nextLine();
        boolean hasToBeReplaced = Boolean.parseBoolean(racketScanner.nextLine());
        boolean needNewPad = Boolean.parseBoolean(racketScanner.nextLine());
        // reading every line and makes a TableTennisRacket object
        return new TableTennisRacket(id, lockerNumber, hasToBeReplaced, needNewPad);
    }
}
