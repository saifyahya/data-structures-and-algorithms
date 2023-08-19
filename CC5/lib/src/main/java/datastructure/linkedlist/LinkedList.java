package CC5.lib.src.main.java.datastructure.linkedlist;

public class LinkedList {
    public Node head;
    private class Node {
       private int data;
       private Node next;
       public Node(int data) {
            this.data = data;
        }
    }

    private boolean isEmpty() {
        return (head == null);
    }

    public void insertAtTop(int value) {
        if (isEmpty()) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
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
}
