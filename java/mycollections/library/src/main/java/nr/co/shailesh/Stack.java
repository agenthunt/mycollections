package nr.co.shailesh;

/**
 * Created by shailesh on 18/04/16.
 */
public interface Stack<T> {
    public T pop() throws ArrayStack.EmptyException;
    public void push(T t);
    public int size();
    public T top();

}
