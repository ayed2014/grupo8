/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 10/04/14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
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
