/**
 * Created by tomasbatto on 06/04/14.
 */
public class Window {
    private double income;
    private int leisureTime;
    private boolean inService;
    private boolean leisure;
    private ColaD row;

    public Window(boolean working){
        this.income=0;
        this.leisureTime=0;
        this.inService=working;
        this.leisure=true;
        this.row=new ColaD();
    }

    public void inLeisure(){
        leisureTime+=10;
        leisure=true;
    }

    public void working(){
       leisure=false;
    }

    public void open(){
        inService=true;
    }

    public void close(){
        inService=false;
    }

    public void enqueue(Passanger p){
        row.enqueue(p);
    }
    public int dequeue(int time){
        if(!this.isEmpty()){
            Passanger p=(Passanger)row.dequeue();
            income+=0.7;
            return p.getWaitTime(time);
        }else{
            return 0;
        }
    }

    public boolean isEmpty(){
        return row.isEmpty();
    }

    public double getIncome() {
        return income;
    }

    public int getLeisureTime() {
        return leisureTime;
    }

    public boolean isInService() {
        return inService;
    }

    public boolean isLeisure() {
        return leisure;
    }

    public ColaD getRow() {
        return row;
    }
}
