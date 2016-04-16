package nr.co.shailesh;

/**
 * Created by shailesh on 17/04/16.
 */


public class Stack<T> {
    T[] elems;
    private int growthFactor = 100;
    int topIndex = -1;

    public static class EmptyException extends Exception {
        public EmptyException(String message) {
            super(message);
        }
    }

    public Stack() {
        //Stupid java generics and type erasure and what not
        elems = (T[]) new Object[growthFactor];
    }

    public T pop() throws EmptyException {
        if (topIndex == -1) {
            throw new EmptyException("Stack is empty");
        }
        T res = elems[topIndex];
        if (topIndex > 0) {
            topIndex--;
        }
        return res;
    }

    public void push(T t) {
        topIndex++;
        if (topIndex == growthFactor) {
            resize();
        }
        elems[topIndex] = t;
    }

    public int size() {
        return topIndex + 1;
    }

    public T top() {
        return elems[topIndex];
    }

    private void resize() {

    }
}
