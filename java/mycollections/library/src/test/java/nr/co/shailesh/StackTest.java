package nr.co.shailesh;

import static org.junit.Assert.assertEquals;

/**
 * Created by shailesh on 17/04/16.
 */
public class StackTest {
    @org.junit.Test
    public void pop() throws Exception {
        Stack<Integer> s = new ArrayStack<>();
        s.push(10);
        s.push(20);
        int top = s.pop();
        assertEquals(20, top);
    }

    @org.junit.Test
    public void push() throws Exception {
        ArrayStack<Integer> s = new ArrayStack<>();
        s.push(10);
        s.push(20);
        int top = s.pop();
        assertEquals(20, top);
        assertEquals(1, s.size());
    }

    @org.junit.Test
    public void testResize(){
        Stack<Integer> s = new ArrayStack<>();
        for (int i = 0; i < 400; i++) {
            s.push(i);
        }
        int top = s.top();
        assertEquals(399, top);
        assertEquals(400, s.size());
    }

}