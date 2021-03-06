/**
 * Created by tomasbatto on 06/04/14.
 */
public class ColaD {
    Nodo front;
    Nodo back;
    int quantity;

    public ColaD(){
    }
    public void enqueue(Object o){
       if(quantity==0){
           front=new Nodo(o);
           back=front;
       }else{
           Nodo n=new Nodo(o);
           back.setNext(n);
           back=back.getNext();
       }
       quantity++;
    }

    public Object dequeue(){
        Object o=front.getDato();
        front=front.getNext();
        quantity--;
        return o;
    }

    public boolean isEmpty(){
        return quantity==0;
    }
}
