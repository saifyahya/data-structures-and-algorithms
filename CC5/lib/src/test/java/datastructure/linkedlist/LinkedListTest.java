package CC5.lib.src.test.java.datastructure.linkedlist;
import CC5.lib.src.main.java.datastructure.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LinkedListTest {
    @Test
    public void testInsertAtTop() {
        LinkedList result = new LinkedList();
        result.insertAtTop(3);
        result.insertAtTop(2);
        result.insertAtTop(1);
        Assertions.assertEquals("1 -> 2 -> 3 -> Null",result.toString());
    }
@Test
public void testInclude() {
    LinkedList result = new LinkedList();
    result.insertAtTop(3);
    result.insertAtTop(2);
    result.insertAtTop(1);
Assertions.assertEquals(true,result.include(1));
    }


}

