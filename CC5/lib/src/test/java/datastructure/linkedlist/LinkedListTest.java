package CC5.lib.src.test.java.datastructure.linkedlist;
import CC5.lib.src.main.java.datastructure.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LinkedListTest {
    @Test public void testEmptyLinkedList() {  // can properly initiate empty linked list
        LinkedList result = new LinkedList();
        Assertions.assertEquals(null,result.head);
    }
    @Test public void testOneNodeLinkedList() {  // the head property will point to the first Node in the linked list
        LinkedList result = new LinkedList();
        result.insertAtTop(1);
        Assertions.assertEquals(1,result.head.data);
    }
    @Test public void testInsertAtTop() {  // can properly insert to the linked list
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
    Assertions.assertTrue(result.include(1)); // Will return true when finding a value within the linked list that exists
    Assertions.assertFalse(result.include(10)); //Will return false when finding a value within the linked list that exists
    }

    @Test public void testInsertAtEnd() { // Can successfully add multiple nodes to the end of a linked list
        LinkedList result = new LinkedList();
    result.insertAtEnd(3);
    result.insertAtEnd(2);
    result.insertAtEnd(1);
    String expectedResult = "3 -> 2 -> 1 -> NULL";
    Assertions.assertEquals(expectedResult,result.toString());  // Can properly return a collection of all the values that exist in the linked list
}
    @Test public void testInsertBefore() { // Can successfully insert a node before a node located i the middle of a linked list
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        result.insertBefore(3,5);
        String expectedResult1 = "1 -> 2 -> 5 -> 3 -> NULL";
        Assertions.assertEquals(expectedResult1,result.toString());
        result.insertBefore(1,5);     // Can successfully insert a node before the first node of a linked list
        String expectedResult2 = "5 -> 1 -> 2 -> 5 -> 3 -> NULL";
        Assertions.assertEquals(expectedResult2,result.toString());

    }

    @Test public void testInsertAfter() {  // Can successfully insert after a node in the middle of the linked list
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        result.insertAfter(2,5);
        String expectedResult1 = "1 -> 2 -> 5 -> 3 -> NULL";
        Assertions.assertEquals(expectedResult1,result.toString());
        result.insertAfter(3,5); // Can successfully insert after the last node of the linked list
        String expectedResult2 = "1 -> 2 -> 5 -> 3 -> 5 -> NULL";
        Assertions.assertEquals(expectedResult2,result.toString());
    }
    @Test public void testInsertAfterFailed() {  // test insert after a non exist value
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        result.insertAfter(7,5);
        String expectedResult = "1 -> 2 -> 3 -> NULL";
        Assertions.assertEquals(expectedResult,result.toString());
    }
}

