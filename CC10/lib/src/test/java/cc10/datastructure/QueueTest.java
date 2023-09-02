package CC10.lib.src.test.java.cc10.datastructure;

import CC10.lib.src.main.java.cc10.datastsructure.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class QueueTest {
    @Test void  testEnqueue(){              //Can successfully enqueue multiple values into a queue
        Queue<Integer> queue= new Queue<>();
        queue.enqueue(10);
        queue.enqueue(17);
        Assertions.assertEquals(2,queue.getLength());
    }
    @Test void  testDequeue(){             // Can successfully dequeue out of a queue the expected value
        Queue<Integer> queue= new Queue<>();
        queue.enqueue(10);
        queue.enqueue(15);
        Assertions.assertEquals(10,queue.dequeue());
    }
    @Test void  testPeak(){             //Can successfully peek into a queue, seeing the expected value
        Queue<Integer> queue= new Queue<>();
        queue.enqueue(20);
        queue.enqueue(35);
        Assertions.assertEquals(20,queue.peak());
    }
    @Test void  testEmpty(){            //Can successfully empty a queue after multiple dequeues
        Queue<Integer> queue= new Queue<>();
        queue.enqueue(20);
        queue.enqueue(35);
        queue.dequeue();
        queue.dequeue();
        Assertions.assertEquals(true,queue.isEmpty());
    }

    @Test void testInstantiateEmpty() {         //Can successfully instantiate an empty queue
        Queue<Integer> queue= new Queue<>();
        Assertions.assertEquals(true,queue.isEmpty());
    }
    @Test void testNoSuchElementException() {         // Calling dequeue or peek on empty queue raises exception
        Queue<Integer> queue= new Queue<>();
        Assertions.assertEquals(new NoSuchElementException("Empty Queue"),queue.dequeue());
    }

}
