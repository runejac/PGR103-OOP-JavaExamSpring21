import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {


        EquipmentStorage storage = new ReadFile("equipmentBackup.txt");


        Program program = new Program(storage);
        program.printEquipmentToTerminal();



    }
}
