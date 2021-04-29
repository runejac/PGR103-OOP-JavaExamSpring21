import java.util.Set;

public class Program {

    // Set field to connect it through the Interface with the parameter in the constructor below
    Set<Equipment> equipment;

    // reaching the equipmentFromFile(); method through the Interface so I can manipulate, print and do what I want with it
    public Program(EquipmentSupply supply) throws Exception {
        equipment = supply.equipmentFromFile();
    }


    // task 2)
    public void printAllEquipmentToTerminal() {
        System.out.println("Printing every object that is in the Set below:\n");

        for (Equipment e : equipment) {
            System.out.println(e);
        }
        System.out.println();
    }
}
