package CC10.lib.src.main.java.cc10.datastsructure;

public class Node <T>{
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
