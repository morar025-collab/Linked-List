import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircularLinkedListTest {

    @Test
    void testAddItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(30);

        assertEquals(3, list.size());
        assertEquals("10 20 30", list.toString());
    }

    @Test
    void testFindExistingItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(5);
        list.addItem(15);
        list.addItem(25);

        assertTrue(list.find(15));
    }

    @Test
    void testFindMissingItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(5);
        list.addItem(15);

        assertFalse(list.find(100));
    }

    @Test
    void testRemoveMiddleItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(30);

        assertTrue(list.remove(20));

        assertEquals("10 30", list.toString());
        assertEquals(2, list.size());
    }

    @Test
    void testRemoveFirstItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(30);

        assertTrue(list.remove(10));

        assertEquals("20 30", list.toString());
    }

    @Test
    void testRemoveLastItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(30);

        assertTrue(list.remove(30));

        assertEquals("10 20", list.toString());
    }

    @Test
    void testRemoveNonExistentItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);

        assertFalse(list.remove(50));
        assertEquals(2, list.size());
    }

    @Test
    void testRemoveOnlyItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(42);

        assertTrue(list.remove(42));
        assertEquals(0, list.size());
        assertEquals("", list.toString());
    }

    @Test
    void testDuplicateRemoval() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(20);
        list.addItem(30);

        assertTrue(list.remove(20));
        assertEquals("10 20 30", list.toString());
    }
}