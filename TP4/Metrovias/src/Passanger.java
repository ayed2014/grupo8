/**
 * Created by tomasbatto on 06/04/14.
 */
public class Passanger {
    int inTime;
    int waitTime;

    public Passanger(int time){
        inTime=time;

    }

    public int getInTime() {
        return inTime;
    }

    public int getWaitTime(int finishTime){
        waitTime=finishTime-inTime;
        return waitTime;
    }
}
