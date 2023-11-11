package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class QueueTests {

    @Test
    public void testQueuePush(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Hello");
        queue.push("World");

        assertFalse(queue.isEmpty());

    }

    @Test
    public void testQueuePopFirst(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Hello");
        queue.push("World");
        queue.push(":DDD");

        String popped = queue.pop();

        assertEquals(":DDD", popped);

    }

    @Test
    public void testQueueIsEmpty(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Hello");
        queue.push("World");

        assertFalse(queue.isEmpty());
    }

    @Test
    public void testQueueAddLast(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Hello");
        queue.push("World");

        queue.addLast("Yo");

        assertEquals("Yo", queue.peekLast());

    }

    @Test
    public void testQueueRemoveLast(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Hello");
        queue.push("World");

        assertEquals("Hello", queue.removeLast());
    }
}
