import java.awt.*;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ReadFile implements EquipmentStorage{

    private final String file;

    public ReadFile(String file) {
        this.file = file;
    }

    @Override
    public Set<Equipment> equipmentFromFile() throws Exception {

        Set<Equipment> equipment = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(file))) {
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
        } return equipment;
    }



    private Ball readBall(Scanner ballScanner) {

        int id = Integer.parseInt(ballScanner.nextLine());
        String lockerNumber = ballScanner.nextLine();
        boolean hasToBeReplaced = Boolean.parseBoolean(ballScanner.nextLine());
        String typeOfBall = ballScanner.nextLine();
        boolean needMoreAir = Boolean.parseBoolean(ballScanner.nextLine());

        return new Ball(id, lockerNumber, hasToBeReplaced, typeOfBall, needMoreAir);
    }

    private TableTennisRacket readRacket(Scanner racketScanner) {

        int id = Integer.parseInt(racketScanner.nextLine());
        String lockerNumber = racketScanner.nextLine();
        boolean hasToBeReplaced = Boolean.parseBoolean(racketScanner.nextLine());
        boolean needNewPad = Boolean.parseBoolean(racketScanner.nextLine());

        return new TableTennisRacket(id, lockerNumber, hasToBeReplaced, needNewPad);
    }
}
