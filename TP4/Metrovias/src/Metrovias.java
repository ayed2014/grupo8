import java.util.Random;

/**
 * Created by tomasbatto on 08/04/2014.
 */
public class Metrovias {
    private List windows;
    private double totalIncome;
    private double waitingTime;




    public void simulate(int quantityOfWindows){
        Random random=new Random();
        windows= new ListE(quantityOfWindows);
        int passangers=0;
        int sacados=0;
        int time=0;
        for(int i=0;i<quantityOfWindows;i++){
            windows.putAfter(new Window(true));
        }
        for(int i=0;i<57570;i+=10) {
            for (int j = 0; j < 5; j++) {
                int rn=random.nextInt(quantityOfWindows);
                windows.goTo(rn);
                ((Window) windows.seeActual()).enqueue(new Passanger(i));
                passangers++;
            }
            for (int k = 0; k < quantityOfWindows; k++) {
                windows.goTo(k);
                Window a = (Window) windows.seeActual();
                if (a.isEmpty()) {
                    a.inLeisure();
                } else if (random.nextInt(10) <= 3) {
                    a.working();
                    time += ((Window) windows.seeActual()).dequeue(i);
                    sacados++;
                }
            }
        }
        totalIncome=0;
        for(int i=0;i<quantityOfWindows;i++){
            windows.goTo(i);
            Window w=((Window) windows.seeActual());
            time+=w.dequeue(i);
            totalIncome+=w.getIncome();
        }
        waitingTime=time/passangers;

    }

    public void getInfo() {
        for(int i=0;i<windows.getQuantity();i++){
            windows.goTo(i);
            Window w=(Window)windows.seeActual();
            System.out.println("Window "+(i+1)+": Income: "+w.getIncome()+" Leisure: "+w.getLeisureTime()+"segundos");

        }
        System.out.println("Ingreso total= "+totalIncome);
        System.out.println("Tiempo medio de espera: "+waitingTime+ "segundos");
    }

    public double getWaitingTime() {
        return waitingTime;
    }
}
