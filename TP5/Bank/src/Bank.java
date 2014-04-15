import java.util.Random;

/**
 * Created by tomasbatto on 10/04/2014.
 */
public class Bank {
    private List windows;
    private double waitingTime;
    private int clients;


    public Bank(){
        this.windows=new ListE(3);
        windows.putAfter(new Window(true));
        windows.putAfter(new Window(true));
        windows.putAfter(new Window(true));
        clients=0;
        waitingTime=0;

    }

    public void simulate1(){
        Random random=new Random();
        windows.goTo(0);
        Window w1=(Window)windows.seeActual();
        windows.goTo(1);
        Window w2=(Window)windows.seeActual();
        windows.goTo(2);
        Window w3=(Window)windows.seeActual();
        int window1=18001;
        int window2=18001;
        int window3=18001;
        int waitTime=0;
        ColaD mainRow=new ColaD();
         for(int i=0;i<15;i++){
             mainRow.enqueue(new Client(0));
             clients++;
         }
         for(int time=0;time<18000;time++){
            if(time%90==0){
                mainRow.enqueue(new Client(time));
                clients++;
            }
            if(w1.isEmpty()||w2.isEmpty()||w3.isEmpty()){
                if(!mainRow.isEmpty()) {
                    int aux = chooseWindow2();
                    if (aux == 0) {
                        w1.enqueue((Client) mainRow.dequeue());
                        window1 = (random.nextInt(90 - 30) + 30) + time;
                    } else if (aux == 1) {
                        w2.enqueue((Client) mainRow.dequeue());
                        window2 = (random.nextInt(120 - 30) + 30) + time;
                    } else {
                        w3.enqueue((Client) mainRow.dequeue());
                        window3 = (random.nextInt(150 - 30) + 30) + time;
                    }
                }
            }
             if(window1==time){
                waitTime+=w1.dequeue(time);
             }
             if(window2==time){
                waitTime+=w2.dequeue(time);
             }
             if(window3==time){
                waitTime+=w3.dequeue(time);
             }
         }
        while(!mainRow.isEmpty()){
            windows.goTo(chooseWindow2());
            Window w=((Window)windows.seeActual());
            w.enqueue((Client)mainRow.dequeue());
            waitTime+=w.dequeue(18000);
        }
        waitingTime=waitTime/clients;
    }

    public void simulate2(){
        Random random=new Random();
        windows.goTo(0);
        Window w1=(Window)windows.seeActual();
        windows.goTo(1);
        Window w2=(Window)windows.seeActual();
        windows.goTo(2);
        Window w3=(Window)windows.seeActual();
        int window1=18001;
        int window2=18001;
        int window3=18001;
        int waitTime=0;
        for(int i=0;i<15;i++) {
            windows.goTo(chooseWindow2());
            ((Window) windows.seeActual()).enqueue(new Client(0));
            clients++;
        }
        for(int time=0;time<18000;time++){
            if(time%90==0) {
                int aux = chooseWindow2();
                clients++;
                if (aux == 0) {
                    w1.enqueue(new Client(time));
                    if(time==0){
                        window1 = (random.nextInt(90 - 30) + 30) + time;
                    }
                } else if (aux == 1) {
                    w2.enqueue(new Client(time));
                    if(time==0){
                        window2 = (random.nextInt(120 - 30) + 30) + time;
                    }

                } else {
                    w3.enqueue(new Client(time));
                    if(time==0){
                        window3 = (random.nextInt(150 - 30) + 30) + time;
                    }
                }
            }
            if(window1==time){
                waitTime+=w1.dequeue(time);
                window1 = (random.nextInt(90 - 30) + 30) + time;
            }
            if(window2==time){
                waitTime+=w2.dequeue(time);
                window2 = (random.nextInt(120 - 30) + 30) + time;
            }
            if(window3==time){
                waitTime+=w3.dequeue(time);
                window3 = (random.nextInt(150 - 30) + 30) + time;
            }
        }
        while(!w1.isEmpty()){
           waitTime+=w1.dequeue(18000);
        }
        while(!w2.isEmpty()){
            waitTime+=w2.dequeue(18000);
        }
        while(!w3.isEmpty()){
            waitTime+=w3.dequeue(18000);
        }

        waitingTime=waitTime/clients;
    }

    private int chooseWindow2(){
        Random random=new Random();
        windows.goTo(0);
        Window w1=(Window)windows.seeActual();
        windows.goTo(1);
        Window w2=(Window)windows.seeActual();
        windows.goTo(2);
        Window w3=(Window)windows.seeActual();
        if(w1.isEmpty()&&w2.isEmpty()&&w3.isEmpty()){
          return random.nextInt(2);
        }else if(w1.isEmpty()&&!w2.isEmpty()&&!w3.isEmpty()){
            return 0;
        }else if(!w1.isEmpty()&&w2.isEmpty()&&!w3.isEmpty()){
            return 1;
        }else if(!w1.isEmpty()&&!w2.isEmpty()&&w3.isEmpty()){
            return 2;
        }else if(w1.isEmpty()&&w2.isEmpty()&&!w3.isEmpty()) {
            return randomChoose(0,1);
        }else if(w1.isEmpty()&&!w2.isEmpty()&&w3.isEmpty()) {
            return randomChoose(0,2);
        }else if(!w1.isEmpty()&&w2.isEmpty()&&w3.isEmpty()) {
            return randomChoose(1,2);
        }else{
            int q1=w1.getRow().getQuantity();
            int q2=w2.getRow().getQuantity();
            int q3=w3.getRow().getQuantity();
            if(q1<=q2&&q1<q3){
                return 0;
            }else if(q2<q1&&q2<=q3){
                return 1;
            }else if(q3<=q1&&q3<q2){
                return 2;
            }else{
                return random.nextInt(2);
            }
        }
    }

    private int chooseWindow1() {
        Random random=new Random();
        windows.goTo(0);
        Window w1=(Window)windows.seeActual();
        windows.goTo(1);
        Window w2=(Window)windows.seeActual();
        windows.goTo(2);
        Window w3=(Window)windows.seeActual();
        if(w1.isEmpty()&&w2.isEmpty()&&w3.isEmpty()){
            return random.nextInt(2);
        }else if(w1.isEmpty()&&!w2.isEmpty()&&!w3.isEmpty()){
            return 0;
        }else if(!w1.isEmpty()&&w2.isEmpty()&&!w3.isEmpty()){
            return 1;
        }else if(!w1.isEmpty()&&!w2.isEmpty()&&w3.isEmpty()) {
            return 2;
        }else if(w1.isEmpty()&&w2.isEmpty()&&!w3.isEmpty()) {
            return randomChoose(0,1);
        }else if(w1.isEmpty()&&!w2.isEmpty()&&w3.isEmpty()) {
            return randomChoose(0,2);
        }else if(!w1.isEmpty()&&w2.isEmpty()&&w3.isEmpty()) {
            return randomChoose(1,2);
        }
        return 0;
    }

    private int randomChoose(int i1, int i2){
        Random random=new Random();
        Integer[]numbers={i1,i2};
        return numbers[random.nextInt(1)];
    }

    public List getWindows() {
        return windows;
    }

    public double getWaitingTime() {
        return waitingTime;
    }

    public int getClients() {
        return clients;
    }
}
