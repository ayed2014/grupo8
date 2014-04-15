/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 10/04/14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class PilaD {
    private Nodo tope;
    public void apilar(Object a) {
        Nodo p=new Nodo(a);
        p.setNext(tope);
        tope=p;
    }

    public void desapilar() {
        tope=tope.getNext();
    }
    public Object verTope() {
        return tope.getDato();
    }
    public boolean isEmpty() {
        return (tope==null);
    }

}
