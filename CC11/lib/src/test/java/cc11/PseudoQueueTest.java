package CC11.lib.src.test.java.cc11;

import CC11.lib.src.main.java.cc11.PseudoQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PseudoQueueTest {
    @Test
    void testPseudoQueueEnqueue() {
        PseudoQueue<Integer> test = new PseudoQueue<>();
        test.enqueue(1);
        test.enqueue(2);
        Assertions.assertEquals(2,test.getLength());
    }

    @Test public void testPseudoQueueDequeue() {
        PseudoQueue<Integer> test = new PseudoQueue<>();
        test.enqueue(1);
        test.enqueue(2);
        Assertions.assertEquals(1,test.dequeue());
    }
}
