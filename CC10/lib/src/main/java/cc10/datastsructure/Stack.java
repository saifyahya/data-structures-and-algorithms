package CC10.lib.src.main.java.cc10.datastsructure;

import org.junit.jupiter.api.function.Executable;

import java.util.EmptyStackException;

public class Stack<T> {
    public Node<T> top;
    public int length;

    public Stack() {
        top =null;
        length = 0;
    }
    public void push(T data) {
        Node<T> temp =new Node<>(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        T result = top.data;
        top=top.next;
        length--;
        return result;
    }
    public boolean isEmpty() {
        return length==0;
    }
    public int getLength(){
        return length;
    }
    public T peak() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

}
