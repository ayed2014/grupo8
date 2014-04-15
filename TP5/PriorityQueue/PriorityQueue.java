/**
 * Created by Sil on 10/04/14.
 */
public class PriorityQueue {
    private Object[] objects;
    private int front = 0;
    private int back = 0;
    private int quantity = 0;
    private int size;

    public PriorityQueue(int size){
        this.size = size;
        objects = new Object[size];
    }

    public void enQueue(PriorizableObject o){
        if (isFull()){
            resize();
        }
        if (o.getPriority()){
            resize(o);
            return;
        }

        objects[back] = o;
        quantity++;
        if (back == objects.length){
            back = 0;
        }
        else{
            back ++;
        }

    }

    private void resize(PriorizableObject o) {
        Object[] objects2 = new Object[size];
        int index =0;
        objects2[index] = o;
        quantity++;
        index++;
        for (int i = front; i<objects.length;i++){
            objects2[index] = objects[i];
            index++;
        }
        if (front!=0){
            for (int i = 0;i<back;i++){
                objects2[index]= objects[i];
                index++;
            }
        }
        back=objects.length;
        front=0;
        objects= objects2;
        }


    public Object deQueue() {
        Object o = objects[front];
        if (isEmpty()){
            return null;
        }
        if (front != objects.length){
            front++;
        }
        else{
            front =0;
        }
        quantity--;
        return o;
    }

    public void resize(){
        Object[] objects2 = new Object[size*2];
        size= size*2;
        int index =0;


        for (int i = front; i<objects.length;i++){
            objects2[index] = objects[i];
            index++;
        }

        if (front!=0){
            for (int i = 0;i<back;i++){
                objects2[index]= objects[i];
                index++;
            }
        }
        back=objects.length;
        front=0;
        objects= objects2;



    }

    public boolean isFull(){
        if (quantity == size ){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (quantity == 0){
            return true;
        }
        return false;
    }

}
