
public abstract class Equipment {
    private int id;
    private String lockerNumber;
    private boolean hasToBeReplaced;


    public Equipment(int id, String lockerNumber, boolean hasToBeReplaced) {
        this.id = id;
        this.lockerNumber = lockerNumber;
        this.hasToBeReplaced = hasToBeReplaced;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(String lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public boolean hasToBeReplaced() {
        return hasToBeReplaced;
    }

    public void setHasToBeReplaced(boolean hasToBeReplaced) {
        this.hasToBeReplaced = hasToBeReplaced;
    }

    @Override
    public abstract String toString();
}
