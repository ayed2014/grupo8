/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 10/04/14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class PilaE {
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


}
