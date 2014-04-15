/**
 * Created by Sil on 10/04/14.
 */
public class Customer implements PriorizableObject {
    private boolean priority;


    public Customer(boolean priority){
        this.priority=priority;
    }

    public boolean getPriority() {
        return priority;
    }

    public void print(){
        if (priority){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

}