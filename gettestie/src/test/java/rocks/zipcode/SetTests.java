package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class SetTests {

    @Test
    public void testSetAdd(){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");

        assertFalse(set.isEmpty());

    }

    @Test
    public void testSetRemove(){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");

        assertTrue(set.remove("World"));

    }

    @Test
    public void testSetContains(){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");

        assertTrue(set.contains("Hello"));
    }

    @Test
    public void testSetSize(){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");

        assertEquals(2, set.size());
    }

    @Test
    public void testSetIsEmpty(){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");

        assertFalse(set.isEmpty());
    }
}
