/**
 * Created by tomasbatto on 28/03/14.
 */
public class Cola  {
    private Object[]datos;
    private int front;
    private int back;
    private int quantity;

    public Cola(int size){
        datos=new Object[size];
        front=0;
        back=0;
        quantity=0;
    }

    private int rise(int x){
       if(x==datos.length-1){
             x=0;
        }else{
           x++;
       }
        return x;
    }

    public void enqueue(Object b){
        if(quantity==datos.length){
            datos=duplicateAddArray();
        }
        datos[back]=b;
        back=rise(back);
        quantity++;
    }

    public Object dequeue(){
        if(quantity!=0){
            Object b=datos[front];
            front=rise(front);
            quantity--;
            return b;
        }
        return null;
    }

    private Object[] duplicateAddArray(){
        Object[]datos2=new Object[datos.length*2];
        int i=0;
        do{
           datos2[i]=datos[front];
            front=rise(front);
            i++;

        }while(front!=back);
        front=0;
        back=datos.length;
        return datos2;
    }

    public boolean isEmpty(){
        return quantity==0;
    }
}
