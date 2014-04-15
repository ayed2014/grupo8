import java.util.Objects;
import java.util.Random;

/**
 * Created by Sil on 10/04/14.
 */
public class PriorityTester {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue(5);
        for (int i=0;i<10;i++){
            Random random = new Random();
            boolean b = random.nextBoolean();
            Customer c = new Customer(b);
            p.enQueue(c);
        }
        while (!p.isEmpty()){
            Customer c =(Customer) p.deQueue();
            c.print();
        }
    }
}
