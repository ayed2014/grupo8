/**
 * Created by tomasbatto on 06/04/14.
 */
public class Client {
    int inTime;
    int waitTime;

    public Client(int time){
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
