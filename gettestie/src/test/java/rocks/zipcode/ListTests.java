package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListTests {

    @Test
    public void testListAdd(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testListRemove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        assertTrue(list.remove("Hello"));
    }

    @Test
    public void testListIsEmpty(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testListContains(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        assertTrue(list.contains("World"));
    }

    @Test
    public void testListIndexOf(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        int actual = list.indexOf("Hello");

        assertEquals(0, actual);
    }

    @Test
    public void testListGet(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        String actual = list.get(1);

        assertEquals("World", actual);
    }

    @Test
    public void testListSize(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        int actual = list.size();

        assertEquals(2, actual);
    }
}
