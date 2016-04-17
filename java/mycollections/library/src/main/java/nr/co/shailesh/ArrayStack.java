package nr.co.shailesh;

/**
 * Created by shailesh on 17/04/16.
 */


public class ArrayStack<T> implements Stack<T> {
    T[] elems;
    private int growthFactor = 100;
    int topIndex = -1;

    public static class EmptyException extends Exception {
        public EmptyException(String message) {
            super(message);
        }
    }

    public ArrayStack() {
        //Stupid java generics and type erasure and what not
        elems = (T[]) new Object[growthFactor];
    }

    public T pop() throws EmptyException {
        if (topIndex == -1) {
            throw new EmptyException("ArrayStack is empty");
        }
        T res = elems[topIndex];
        if (topIndex > 0) {
            topIndex--;
        }
        return res;
    }

    public void push(T t) {
        topIndex++;
        if (topIndex == elems.length) {
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
        T[] newelems = (T[]) new Object[elems.length + growthFactor];
        for (int i = 0; i < elems.length; i++) {
            newelems[i] = elems[i];
        }
        elems = newelems;
    }
}
