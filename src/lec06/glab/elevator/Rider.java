package lec06.glab.elevator;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 11/2/13
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class Rider {

    //Rider can be waiting, riding, or indisposed  (must we make this static?)
    public static enum State {RIDING, WAITING, IN_BUILDING, AWAY}
    private State mState;
    private int mFloor; //0-4

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
    }

    public int getFloor() {
        return mFloor;
    }

    public void setFloor(int floor) {
        mFloor = floor;
    }
}
