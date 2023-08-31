package CC10.lib.src.main.java.cc10.datastsructure;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;
    private int length;

    public Stack() {
        top =null;
        length = 0;
    }
    public void push(T data) {
        Node<T> temp =new Node<>(data);
        temp.next=top;
        length++;
    }
    public T pop() {
      /*  if(isEmpty())
            throw EmptyStackException;*/
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
       /* if (isEmpty())
            throw EmptyStackException;*/
        return top.data;
    }
}
