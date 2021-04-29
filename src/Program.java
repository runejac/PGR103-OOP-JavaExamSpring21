import java.util.Set;

public class Program {

    Set<Equipment> equipment;

    public Program(EquipmentSupply storage) throws Exception {
        equipment = storage.equipmentFromFile();
    }


    // print tester
    public void printAllEquipmentToTerminal() {
        for (Equipment e : equipment) {
            System.out.println(e);
        }
    }

    // task 3)
    public void printBallsNeedingMoreAir() {
        System.out.println("Below are all the balls that needs more air:\n");

        for (Equipment e : equipment) {
            if (e instanceof Ball) {
                if (((Ball) e).needMoreAir()) {
                    System.out.println(e);
                }
            }
        }
        System.out.println();
    }

    // task 3)
    public void printEquipmentNeedingToBeReplaced() {
        System.out.println("Below are the equipments that needs to be replaced:\n");

        for (Equipment e : equipment) {
            if (e.hasToBeReplaced()) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    // task 3)
    public void printTableTennisRacketsNeedingNewPad() {
        System.out.println("Below are the table tennis rackets that needs new padding:\n");

        for (Equipment e : equipment) {
            if (e instanceof TableTennisRacket) {
                if (((TableTennisRacket) e).needNewPad()) {
                    System.out.println(e);
                }
            }
        }
        System.out.println();
    }
}
