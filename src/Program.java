import java.util.Set;

public class Program {

    // Set field to connect it through the Interface with the parameter in the constructor below
    Set<Equipment> equipment;

    // reaching the equipmentFromFile(); method through the Interface so I can manipulate, print and do what I want with it
    public Program(EquipmentSupply supply) throws Exception {
        equipment = supply.equipmentFromFile();
    }

    // I would have used this class mainly if I wanted to manipulate the program more,
    // therefore the class Print.java has only one responsibility, to print and nothing else.

    // task 2) this method is in this location because it has nothing to do with task 3 and 4
    public void printAllEquipmentToTerminal() {
        System.out.println("Printing every object that is in the Set below:\n");

        for (Equipment e : equipment) {
            System.out.println(e);
        }
        System.out.println();
    }
}
