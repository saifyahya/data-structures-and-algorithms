package CC5.lib.src.main.java.datastructure.linkedlist;

public class LinkedList {
    public Node head;
    private Node tail;
    public static class Node {
        public int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insertAtTop(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head= newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head=newNode;
        }
    }
    public boolean include(int value) {
        Node current=head;
        while (current != null) {
            if(current.data==value)
                return true;
            current = current.next;
        }
        return false;
    }
    @Override
    public String toString() {
        String list = "";
        if (isEmpty())
            return list;
        Node current = head;
        while (current != null) {
            list += current.data+" -> ";
            current = current.next;
        }
        list += "NULL";
        return list;
    }
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail=newNode;
            head = newNode;
        } else {
            tail.next=newNode;
            tail = newNode;

        }
    }

    public void insertBefore(int value,int newValue) {
        Node newNode = new Node(newValue);
        if(isEmpty())
            return;
        Node current = head;
        if(current.data==value){
            insertAtTop(newValue);
            return;}
        while(current!=null) {
            if(current.next==null){ // to solve pointer null exception when current.next==null, we can't access its data
                if(current.data==value){
                    newNode.next=current.next;
                    current.next=newNode;
                    break;
                }}
            else{
                if(current.next.data==value){
                    newNode.next=current.next;
                    current.next=newNode;
                    break;
                }}
            current=current.next;
        }
    }
    public void insertAfter(int value,int newValue) {
        Node newNode = new Node(newValue);
        if(isEmpty())
            return;
        Node current = head;
        if(current.data==value){
            insertAtEnd(newValue);
            return;}
        while(current!=null) {
            if(current.data==value){
                newNode.next=current.next;
                current.next=newNode;
                break;
            }
            current=current.next;
        }
    }
    public int getLength() {
        int count =0;
        Node current =head;
        while (current!=null) {
            current=current.next;
            count++;
        }
        return count;
    }
    public String kthFromEnd(int indexFromEnd) {
        int currentIndex=1;  // navigate to first index from the top
        int listLength=this.getLength();
        int desiredIndex=listLength-indexFromEnd;
        if(desiredIndex>listLength || desiredIndex<=0) //in case negative number, empty list, invalid number(number=listLength)
            return " kth index does not exist";
        Node current = head;
        if(desiredIndex==currentIndex)  // handle first element in the list
            return Integer.toString(current.data);
        while(desiredIndex>currentIndex) {
            current=current.next; 
            currentIndex++;
        }
        return Integer.toString(current.data);
    }
}
