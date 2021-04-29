
public abstract class Equipment {

    private final int id;
    private final String lockerNumber;
    private final boolean hasToBeReplaced;


    public Equipment(int id, String lockerNumber, boolean hasToBeReplaced) {
        this.id = id;
        this.lockerNumber = lockerNumber;
        this.hasToBeReplaced = hasToBeReplaced;
    }

    public int getId() {
        return id;
    }

    public String getLockerNumber() {
        return lockerNumber;
    }

    public boolean hasToBeReplaced() {
        return hasToBeReplaced;
    }

    @Override
    public abstract String toString();
}
