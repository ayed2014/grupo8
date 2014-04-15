/**
 * Created by tomasbatto on 04/04/14.
 */

public class ListE implements List {
    private Object[]things;
    private int window;
    private int quantity;

    public ListE(int size){
     things=new Object[size];
     window=0;
     quantity=0;
    }
    @Override
    public Object seeActual() {
        return things[window];
    }

    @Override
    public void empty() {
     things=new Object[10];
    }

    @Override
    public boolean isEmpty() {
        if(quantity==0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void putAfter(Object o) {
        if(quantity==things.length){
            things=duplicateAddArray();
        }
        if(!isEmpty()){
            for(int i=quantity;i>window;i--){
                things[i]=things[i-1];
            }
            things[window]=o;
            quantity++;
            window++;
        }else{
            things[window]=o;
            quantity++;
            window++;
        }
    }

    @Override
    public void putBefore(Object o) {
        if(quantity==things.length){
            things=duplicateAddArray();
        }
        if(!isEmpty()){
            for(int i=quantity;i>window-1;i--){
                things[i]=things[i-1];
            }
            things[window-1]=o;
            window--;
            quantity++;
        }else{
            things[window]=o;
            quantity++;
        }
    }

    @Override
    public void next() throws IndexOutOfBoundsException{
        if(things[window+1]!=null){
            window++;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void before() throws IndexOutOfBoundsException{
     if(window-1!=-2){
       window--;
     }else{
         throw new IndexOutOfBoundsException();
     }
    }

    @Override
    public void goTo(int x) throws IndexOutOfBoundsException{
    if(x<things.length){
        window=x;
    }else{
        throw new IndexOutOfBoundsException();
    }
    }

    @Override
    public void erease() {
        if(quantity==things.length){
            things=duplicateAddArray();
        }
        for(int i=window;i<quantity;i++){
            things[i]=things[i+1];
        }
        quantity--;


    }

    @Override
    public void modify(Object o) {
      things[window]=o;
    }

    private Object[] duplicateAddArray(){
        Object[]datos2=new Object[things.length*2];
        for(int i=0;i<things.length;i++){
            datos2[i]=things[i];
        }
        return datos2;

    }

    public Object[] getThings() {
        return things;
    }

    public int getWindow() {
        return window;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printAll(){
        for(int i=0;i<things.length;i++){
           System.out.println(things[i]);
        }
    }


}
