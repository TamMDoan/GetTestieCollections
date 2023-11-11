package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapTests {

    @Test
    public void testMapAdd(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");

        assertFalse(map.isEmpty());
    }

    @Test
    public void testMapRemove(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        map.remove(0);

        assertFalse(map.containsKey(0));
    }

    @Test
    public void testMapGet(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        String actual = map.get(0);

        assertEquals("Hello", actual);

    }

    @Test
    public void testMapContainsValue(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        assertTrue(map.containsValue("World"));
    }

    @Test
    public void testMapContainsKey(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        assertTrue(map.containsKey(0));
    }

    @Test
    public void testMapClear(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        map.clear();

        assertTrue(map.isEmpty());
    }

    @Test
    public void testMapIsEmpty(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");

        assertFalse(map.isEmpty());
    }
}
