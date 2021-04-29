
public class Main {

    public static void main(String[] args) throws Exception {

        // object from the Interface reading the file through the field in ReadFile.java
        EquipmentSupply supply = new ReadFile("equipment.txt");

        // task 2) testing if it prints every object
        Program program = new Program(supply);
        program.printAllEquipmentToTerminal();

        // task 4)
        Print print = new Print(supply);
        print.printTask3();
    }
}
