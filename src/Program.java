import java.util.Set;

public class Program {

    private final EquipmentStorage storage;
    Set<Equipment> equipment;

    public Program(EquipmentStorage storage) throws Exception {
        this.storage = storage;
        equipment = storage.equipmentFromFile();
    }

    public void printEquipmentToTerminal() {
        for (Equipment e : equipment) {
            System.out.println(e);
        }
    }
}
