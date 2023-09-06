package CC12.lib.src.main.java.cc12;

import java.util.NoSuchElementException;

public class AnimalShelter <T>{
    protected Node<T> front;
    protected Node<T> back;
    protected int length;

    public AnimalShelter() {
        length=0;
    }
    public void enqueue(Animal animal){
        Node myAnimal =new Node<>(animal.species);
        if(front==null) {
        front= myAnimal;
        }
        back.next=myAnimal;
        back=myAnimal;
        length++;
    }
    public String dequeue(String pref)
    {
        if(length==0)
            throw new NoSuchElementException("Empty Queue");
        String result ="Not Found";
        int position = 0;
        Node prev= front;
        Node current =front;
        if(current.data==pref){ //handle one element or more queue
            if(current==back){
                front=front.next;
                back=front;
                result=pref;
                length--;
            }
            front=front.next;
            result=pref;
            length--;
        }
        current=current.next;
        while(current!=null){
        if(current.data.equals(pref)){
          prev.next=current.next;
          result=pref;
          length--;
          break;
        }
        }
        return result;
    }
}
