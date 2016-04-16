package nr.co.shailesh;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by shailesh on 17/04/16.
 */
public class StackTest {
    @org.junit.Test
    public void pop() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        int top = s.pop();
        assertEquals(20, top);
    }

    @org.junit.Test
    public void push() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        int top = s.pop();
        assertEquals(20, top);
        assertEquals(1, s.size());
    }

}