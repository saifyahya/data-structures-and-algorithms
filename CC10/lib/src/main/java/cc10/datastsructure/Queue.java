package CC10.lib.src.main.java.cc10.datastsructure;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;
    private int length;
    public Queue(){
        front=null;
        back=null;
        length=0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if(isEmpty()) {
            front=node;
        }
        else
        {
            back.next=node;
        }
        back= node;
        length++;
    }
    public T dequeue(){
        if(isEmpty())
            throw new NoSuchElementException("Empty Queue");
        T result = front.data;
        front=front.next;
        length--;
        if (front==null)
            back=null;
        return result;

    }
    public T peak(){
        if(isEmpty())
            throw new NoSuchElementException("Empty Queue");
        return front.data;
    }
    public void printQueue() {
        if(isEmpty())
            return;
        Node current = front;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("Null");
    }
}
