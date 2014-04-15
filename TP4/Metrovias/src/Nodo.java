/**
 * Created by tomasbatto on 19/03/14.
 */
public class Nodo {
    public Object dato;
    public Nodo next;

    public Nodo(Object dato){
        this.dato=dato;

    }

    public Nodo(Object dato, Nodo next){
        this.dato=dato;
        this.next=next;

    }

    public Object getDato() {
        return dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void print(){
        System.out.println(dato);
    }
}
