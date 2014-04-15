/**
 * Created by tomasbatto on 19/03/14.
 */
public class PilaD implements Pila {
    private Nodo tope;


    @Override
    public void apilar(Object a) {
        Nodo p=new Nodo(a);
        p.setNext(tope);
        tope=p;
    }

    @Override
    public void desapilar() {
        tope=tope.getNext();
    }

    @Override
    public Object verTope() {
        return tope.getDato();
    }

    @Override
    public boolean isEmpty() {
        return (tope==null);
    }
}
