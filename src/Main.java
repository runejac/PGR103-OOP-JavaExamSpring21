
public class Main {

    public static void main(String[] args) throws Exception {

        EquipmentSupply storage = new ReadFile("equipmentBackup.txt");


        Program program = new Program(storage);
        program.printEquipmentToTerminal();



    }
}
