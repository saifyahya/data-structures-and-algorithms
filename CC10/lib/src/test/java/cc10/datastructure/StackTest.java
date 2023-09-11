package CC10.lib.src.test.java.cc10.datastructure;

import CC10.lib.src.main.java.cc10.datastsructure.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StackTest {

    @Test public void testStackPush(){              //Can successfully push onto a stack
       Stack<Integer> stack = new Stack<>();
       stack.push(5);
        Assertions.assertEquals(1,stack.getLength());
    }
    @Test public void testStackMultiplePush(){      //Can successfully push multiple values onto a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(16);
        Assertions.assertEquals(3,stack.getLength());
    }
    @Test public void testStackPop(){        //Can successfully pop off the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        Assertions.assertEquals(5,stack.pop());
    }
    @Test public void testStackPeak(){              //Can successfully peek the next item on the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        Assertions.assertEquals(7,stack.peak());
    }
    @Test public void testStackEmpty(){                    // Can successfully empty a stack after multiple pops
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.pop();
        Assertions.assertEquals(true,stack.isEmpty());
    }

    @Test public void testStackEmptyInstantiate(){          // Can successfully instantiate an empty stack
        Stack<Integer> stack = new Stack<>();
        Assertions.assertEquals(0,stack.getLength());
    }
     @Test void testEmptyStackException(){              //Calling pop or peek on empty stack raises exception
         Stack<Integer> stack = new Stack<>();
         Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
    }
}
