package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStackPop(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.pop();

        assertEquals("Hello", stack.peek());
    }

    @Test
    public void TestStackPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        String actual = stack.peek();

        assertEquals("World", actual);
    }

    @Test
    public void TestStackIsEmpty(){
        Stack<String> stack = new Stack<>();

        assertTrue(stack.isEmpty());
    }
}
