
public class TableTennisRacket extends Equipment{

    private final boolean needNewPad;


    public TableTennisRacket(int id, String lockerNumber, boolean hasToBeReplaced, boolean needNewPad) {
        super(id, lockerNumber, hasToBeReplaced);
        this.needNewPad = needNewPad;
    }

    public boolean needNewPad() {
        return needNewPad;
    }

    @Override
    public String toString() {
        return "TableTennisRacket: " +
                "id: " + getId() + ", " +
                "locker: " + getLockerNumber() + ", " +
                "has to be replaced: " + hasToBeReplaced() +  ", " +
                "need new pad: " + needNewPad;
    }
}
