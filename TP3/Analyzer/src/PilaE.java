/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 18/03/14
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class PilaE implements Pila {
    private int tope;
    private Object[] datos;
    public PilaE(){
        datos=new Object[100];
        tope=0;
    }

    public void apilar(Object a){
        if (datos.length==tope){
            datos=duplicateArray();
        }
        datos[tope]=a;
        tope++;

    }
    public void desapilar(){
        if (tope!=-1){
            tope--;
        }else{
            throw new Error();
        }
    }
    public Object verTope(){
        return datos[tope-1];
    }
    public boolean isEmpty(){
        if (tope==0){
            return true;
        }
        return false;
    }
    private Object[] duplicateArray(){
        Object[] datos1=new Object[datos.length*2];
        for (int i=0;i<datos.length;i++){
            datos1[i]=datos[i];
        }
        return datos1;
    }
}
