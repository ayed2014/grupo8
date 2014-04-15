/**
 * Created by tomasbatto on 14/03/14.
 */
public class PilaE implements Pila {
    private Object[]datos;
    private int tope;

    public PilaE(){
        datos=new Object[100];
        int tope=0;
    }

    public void apilar(Object a){
        if(tope==datos.length){
            datos=duplicateAddArray();
        }
        datos[tope]=a;
        tope++;
    }

    public void desapilar(){
        tope--;
    }

    public Object verTope(){
        return datos[tope-1];
    }

    private Object[] duplicateAddArray(){
        Object[]datos2=new Object[datos.length+100];
        for(int i=0;i<datos.length;i++){
           datos2[i]=datos[i];
        }
        return datos2;

    }

    public boolean isEmpty(){
        return tope==0;
    }

    //Hacer un sistema que sea ABM y vista de una pila.
}
