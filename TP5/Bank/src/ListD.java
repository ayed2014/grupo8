/**
 * Created by tomasbatto on 04/04/14.
 */
public class ListD implements List {
    Nodo window;
    Nodo principal;

    public ListD(){

    }

    @Override
    public Object seeActual() {
        return window.dato;
    }

    @Override
    public void empty() {
        principal=null;
    }

    @Override
    public boolean isEmpty() {
        if(principal.dato==null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void putAfter(Object o) {

    }

    @Override
    public void putBefore(Object o) {

    }

    @Override
    public void next() throws IndexOutOfBoundsException {

    }

    @Override
    public void before() throws IndexOutOfBoundsException {

    }

    @Override
    public void goTo(int x) throws IndexOutOfBoundsException {

    }

    @Override
    public void erease() {

    }

    @Override
    public void modify(Object o) {

    }

    @Override
    public void printAll() {

    }

    public int getQuantity(){
        return 0;
    }
}
