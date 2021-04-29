
public class Main {

    public static void main(String[] args) throws Exception {

        EquipmentSupply storage = new ReadFile("equipment.txt");

        Program program = new Program(storage);
        /*program.printAllEquipmentToTerminal();*/

        // task 4)
        program.printBallsNeedingMoreAir();
        program.printEquipmentNeedingToBeReplaced();
        program.printTableTennisRacketsNeedingNewPad();
    }
}
