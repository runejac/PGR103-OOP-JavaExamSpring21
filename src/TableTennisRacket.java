public class TableTennisRacket extends Equipment{
    private boolean needNewPad;

    public TableTennisRacket(int id, String lockerNumber, boolean hasToBeReplaced, boolean needNewPad) {
        super(id, lockerNumber, hasToBeReplaced);
        this.needNewPad = needNewPad;
    }


    public boolean needNewPad() {
        return needNewPad;
    }

    public void setNeedNewPad(boolean needNewPad) {
        this.needNewPad = needNewPad;
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
