/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 10/04/14
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class PalindromeE {
    ColaE cola;
    PilaE pila;
    PilaE[] pilas;
    ColaE[] colas;
    String palabra;
    String[] palabras;
    boolean frase=false;
    public PalindromeE(String palabra){
        this.palabra=palabra;
        isFrase();
        fill();
    }
    private void isFrase(){
        for (int i=0;i<palabra.length();i++){
            char a=palabra.charAt(i);
            if (" ".equals(a)){
                frase=true;
            }
        }
        if (frase){
            String[] parts=palabra.split(" ");
            for (int i=0;i<parts.length;i++){
                palabras[i]=parts[i];
            }
            colas=new ColaE[palabras.length];
            pilas=new PilaE[palabras.length];
        }
        else {
            cola=new ColaE(palabra.length());
            pila=new PilaE();
        }
    }
    private void fill(){
        if (!frase){
            for (int i=0;i<palabra.length();i++){
                pila.apilar(palabra.charAt(i));
                cola.enqueue(palabra.charAt(i));
            }
        }
        else {
            for (int i=0;i<palabras.length;i++){
                for (int j=0;j<palabras[i].length();j++){
                    pilas[i].apilar(palabras[i].charAt(j));
                    colas[i].enqueue(palabras[i].charAt(j));
                }
            }
        }
    }
    public boolean compare(){
        if (!frase){
            while(!pila.isEmpty()&&!cola.isEmpty()){
                if (!pila.verTope().equals(cola.dequeue())){
                    return false;
                }else {
                    pila.desapilar();
                }
            }
            return true;
        }else {
            for (int i=0;i<palabras.length;i++){
                while (!pilas[i].isEmpty()&&!colas[i].isEmpty()){
                    if (pilas[i].verTope()!=cola.dequeue()){
                        return false;
                    }else {
                        pilas[i].desapilar();
                    }
                }
            }
            return true;
        }
    }
}
