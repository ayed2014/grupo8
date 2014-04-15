/**
 * Created by tomasbatto on 04/04/14.
 */
public interface List {
    public Object seeActual();
    public void empty();
    public boolean isEmpty();
    public void putAfter(Object o);
    public void putBefore(Object o);
    public void next() throws IndexOutOfBoundsException;
    public void before() throws IndexOutOfBoundsException;
    public void goTo(int x) throws IndexOutOfBoundsException;
    public void erease();
    public void modify(Object o);
    public void printAll();
    public int getQuantity();
}
