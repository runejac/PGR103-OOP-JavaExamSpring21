
public class Ball extends Equipment{

    private boolean needMoreAir;
    private final String typeOfBall;


    public Ball(int id, String lockerNumber, boolean hasToBeReplaced, String typeOfBall, boolean needMoreAir) {
        super(id, lockerNumber, hasToBeReplaced);
        this.needMoreAir = needMoreAir;
        this.typeOfBall = typeOfBall;
    }

    public boolean isNeedMoreAir() {
        return needMoreAir;
    }

    public void setNeedMoreAir(boolean needMoreAir) {
        this.needMoreAir = needMoreAir;
    }

    @Override
    public String toString() {
        return "Ball: " +
                "id: " + getId() + ", " +
                "locker: " + getLockerNumber() + ", " +
                "type of ball: " + typeOfBall + ", " +
                "has to be replaced: " + hasToBeReplaced() +  ", " +
                "need more air: " + needMoreAir;
    }
}
