import java.util.Set;

public class Program {

    Set<Equipment> equipment;

    public Program(EquipmentSupply storage) throws Exception {
        equipment = storage.equipmentFromFile();
    }


    public void printEquipmentToTerminal() {
        for (Equipment e : equipment) {
            System.out.println(e);
        }
    }
}
