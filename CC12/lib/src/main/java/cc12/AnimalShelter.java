package CC12.lib.src.main.java.cc12;

import java.util.NoSuchElementException;

public class AnimalShelter {
    protected Node<String> front;
    protected Node<String> back;
    protected int length;

    public AnimalShelter() {
        length=0;
    }
    public void enqueue(Animal animal){
        if(!(animal.species.equalsIgnoreCase("cat") ||
                animal.species.equalsIgnoreCase("dog"))) {
            System.out.println("Not cat or dog");
            return;
        }
        Node<String> myAnimal =new Node<>(animal.species);
        if(length==0) {
            front= myAnimal;
        }
        else {back.next=myAnimal;}
        back=myAnimal;
        length++;
    }
    public String dequeue(String pref)
    {
        if(length==0)
            throw new NoSuchElementException("Empty Queue");
        String result ="Not Found";
        Node<String> prev= front;
        Node<String> current =front;
        if(current.data.equalsIgnoreCase(pref)){ //handle the front
            result=front.data;
            front=front.next;
            if(front==null){
                back=null;
            }
            length--;
            return result;
        }
        current=current.next;
        while(current!=null){
            if(current.data.equalsIgnoreCase(pref)){
                result= current.data;
                prev.next=current.next;
                length--;
                break;
            }
            current=current.next;
            prev=prev.next;
        }
        return result;
    }
    public void printShelter(){
        if(length==0)
            System.out.println("Empty Animal Shelter");
        Node current=front;
        System.out.print(" < Exit Door > ");
        while(current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("< Enter Door > ");
    }

    public Node<String> getFront() {
        return front;
    }

    public Node<String> getBack() {
        return back;
    }

    public int getLength() {
        return length;
    }
}
