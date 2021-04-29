
public class Ball extends Equipment{

    private final boolean needMoreAir;
    private final String typeOfBall;


    public Ball(int id, String lockerNumber, boolean hasToBeReplaced, String typeOfBall, boolean needMoreAir) {
        super(id, lockerNumber, hasToBeReplaced);
        this.needMoreAir = needMoreAir;
        this.typeOfBall = typeOfBall;
    }

    public boolean needMoreAir() {
        return needMoreAir;
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
