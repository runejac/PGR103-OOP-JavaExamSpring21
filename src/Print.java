
public class Print extends Program {

    // constructor that inherits from Program.java
    public Print(EquipmentSupply supply) throws Exception {
        super(supply);
    }


    // task 4)
    public void printTask3() {
        printBallsNeedingMoreAir();
        printEquipmentNeedingToBeReplaced();
        printTableTennisRacketsNeedingNewPad();
    }

    // task 3) printing balls that need more air
    private void printBallsNeedingMoreAir() {
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

    // task 3) printing equipment that needs to be replaced
    private void printEquipmentNeedingToBeReplaced() {
        System.out.println("Below are the equipments that needs to be replaced:\n");

        for (Equipment e : equipment) {
            if (e.hasToBeReplaced()) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    // task 3) printing table tennis rackets that needs new padding
    private void printTableTennisRacketsNeedingNewPad() {
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
