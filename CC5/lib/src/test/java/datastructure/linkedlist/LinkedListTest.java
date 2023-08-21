package CC5.lib.src.test.java.datastructure.linkedlist;
import CC5.lib.src.main.java.datastructure.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LinkedListTest {
    @Test public void testEmptyLinkedList() {
        LinkedList result = new LinkedList();
        Assertions.assertEquals(null,result.head);
    }
    @Test public void testInsertAtTop() {
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        String expectedResult = "1 -> 2 -> 3 -> NULL";
        Assertions.assertEquals(expectedResult,result.toString());
    }
    @Test public void testInclude() {
    LinkedList result = new LinkedList();
    result.insertAtTop(3);
    result.insertAtTop(2);
    result.insertAtTop(1);
    Assertions.assertTrue(result.include(1));
    Assertions.assertFalse(result.include(10));
    }

    @Test public void testInsertAtEnd() {
    LinkedList result = new LinkedList();
    result.insertAtEnd(3);
    result.insertAtEnd(2);
    result.insertAtEnd(1);
    String expectedResult = "3 -> 2 -> 1 -> NULL";
    Assertions.assertEquals(expectedResult,result.toString());
}
    @Test public void testInsertBefore() {
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        result.insertBefore(3,5);
        Assertions.assertEquals("1 -> 2 -> 5 -> 3 ->NULL",result.toString());
    }
    @Test public void testInsertAfter() {
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        result.insertAfter(3,5);
        Assertions.assertEquals("1 -> 2 -> 3 -> 5 ->NULL",result.toString());
    }
}

