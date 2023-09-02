package CC10.lib.src.main.java.cc10.datastsructure;

public class Node <T>{
    protected T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
