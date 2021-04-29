import java.awt.*;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ReadFile {

    public Set<Equipment> equipmentFromFile() throws Exception {

        Set<Equipment> equipment = new HashSet<>();
        try (Scanner scanner = new Scanner(new File("equipmentBackup.txt"))) {
            scanner.useLocale(Locale.US);

            while (scanner.hasNextLine()) {
                String equipmentName = scanner.nextLine();

                switch (equipmentName) {
                    case "Ball" -> {
                        Ball ball = readBall(scanner);
                        equipment.add(ball);
                    }
                    case "TableTennisRacket" -> {
                        TableTennisRacket tableTennisRacket = readRacket(scanner);
                        equipment.add(tableTennisRacket);
                    }
                    default -> throw new RuntimeException("Not an equipment");
                }
            }
        }
        return equipment;
    }


    private Ball readBall(Scanner ballScanner) {

        int id = readIntAndCr(ballScanner);
        String lockerNumber = ballScanner.nextLine();
        boolean hasToBeReplaced = readBoolAndCr(ballScanner);
        String typeOfBall = ballScanner.nextLine();
        boolean needMoreAir = readBoolAndCr(ballScanner);

        return new Ball(id, lockerNumber, hasToBeReplaced, typeOfBall, needMoreAir);
    }

    private TableTennisRacket readRacket(Scanner racketScanner) {

        int id = readIntAndCr(racketScanner);
        String lockerNumber = racketScanner.nextLine();
        boolean hasToBeReplaced = readBoolAndCr(racketScanner);
        boolean needNewPad = readBoolAndCr(racketScanner);

        return new TableTennisRacket(id, lockerNumber, hasToBeReplaced, needNewPad);
    }



    private boolean readBoolAndCr(Scanner scanner) {

        boolean input = scanner.nextBoolean();
        scanner.nextLine();

        return input;
    }

    private int readIntAndCr(Scanner scanner) {

        int input = scanner.nextInt();
        scanner.nextLine();

        return input;
    }

}
