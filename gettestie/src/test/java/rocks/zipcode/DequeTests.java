package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class DequeTests {

    @Test
    public void testDequeAdd(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        assertFalse(deque.isEmpty());
    }

    @Test
    public void testDequeRemove(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        deque.remove("World");

        assertFalse(deque.contains("World"));
    }

    @Test
    public void testDequeIsEmpty(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        assertFalse(deque.isEmpty());
    }

    @Test
    public void testDequeContains(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        assertTrue(deque.contains("Hello"));
    }

    @Test
    public void testDequeGetLast(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        String actual = deque.getLast();

        assertEquals("World", actual);
    }

    @Test
    public void testDequeGetFirst(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        String actual = deque.getFirst();

        assertEquals("Hello", actual);
    }

    @Test
    public void testDeque(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        int actual = deque.size();

        assertEquals(2, actual);
    }
}
