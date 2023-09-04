package CC11.lib.src.main.java.cc11;

import CC10.lib.src.main.java.cc10.datastsructure.Stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class PseudoQueue <T> {
    Stack<T> stack1;
    Stack<T> stack2;
    int length;

    public PseudoQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        length = 0;
    }

    public void enqueue(T data) {
    stack1.push(data);
    length++;
    }
    public T dequeue() {
        if(stack1.length==0)
            throw new NoSuchElementException("Empty Queue");
        while (stack1.length!=0){
            stack2.push(stack1.pop());
        }
        length--;
        T poppedItem = stack2.pop();
        while (stack2.length!=0){   //return the new queue to stack1
            stack1.push(stack2.pop());
        }
        return poppedItem;
    }

    public int getLength() {
        return length;
    }
}