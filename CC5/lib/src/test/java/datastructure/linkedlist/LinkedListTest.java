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

    @Test void testKthIndexFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtTop(3);
        linkedList.insertAtTop(2);
        linkedList.insertAtTop(1);
        String result = linkedList.kthFromEnd(4);      // Where k is greater than the length of the linked list
        Assertions.assertEquals("kth index does not exist",result);
        String result2 = linkedList.kthFromEnd(3);     // Where k is the same as the length of the linked list
        Assertions.assertEquals("kth index does not exist",result2);
        String result3 = linkedList.kthFromEnd(-1);      // Where k is not a positive integer
        Assertions.assertEquals("kth index does not exist",result3);
        String result4 = linkedList.kthFromEnd(1); // “Happy Path” where k is not at the end, but somewhere in the middle of the linked list
        Assertions.assertEquals("2",result4);
        LinkedList linkedList2 = new LinkedList();     // New Linked List of Size 1
        linkedList2.insertAtTop(1);
        String result5 = linkedList2.kthFromEnd(0);// Where the linked list is of a size 1
        Assertions.assertEquals("1",result5);
    }
    @Test public void testZipLists()        // test zipping two lists into one list  in case equal lengths
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insertAtTop(3);
        linkedList1.insertAtTop(2);
        linkedList1.insertAtTop(1);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertAtTop(6);
        linkedList2.insertAtTop(5);
        linkedList2.insertAtTop(4);
        LinkedList actualResult= LinkedList.zipLists(linkedList1,linkedList2);
        LinkedList expectedResult = new LinkedList();
        expectedResult.insertAtTop(6);
        expectedResult.insertAtTop(3);
        expectedResult.insertAtTop(5);
        expectedResult.insertAtTop(2);
        expectedResult.insertAtTop(4);
        expectedResult.insertAtTop(1);
        Assertions.assertEquals(expectedResult.toString(),actualResult.toString());
    }
    @Test public void testZipLists2()        // test zipping two lists into one list  in different lengths
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insertAtTop(3);
        linkedList1.insertAtTop(2);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertAtTop(6);
        linkedList2.insertAtTop(5);
        linkedList2.insertAtTop(4);
        LinkedList actualResult= LinkedList.zipLists(linkedList1,linkedList2);
        LinkedList expectedResult = new LinkedList();
        expectedResult.insertAtTop(6);
        expectedResult.insertAtTop(5);
        expectedResult.insertAtTop(3);
        expectedResult.insertAtTop(4);
        Assertions.assertEquals(expectedResult.toString(),actualResult.toString());
    }
    @Test public void testZipLists3()        // test zipping two lists into one list  with one list empty
    {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertAtTop(6);
        linkedList2.insertAtTop(5);
        linkedList2.insertAtTop(4);
        LinkedList actualResult= LinkedList.zipLists(linkedList1,linkedList2);
        Assertions.assertEquals(linkedList2.toString(),actualResult.toString());
    }
}

