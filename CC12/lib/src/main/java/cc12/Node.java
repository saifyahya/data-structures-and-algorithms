package CC12.lib.src.main.java.cc12;

public class Node <T>{
    protected T data;
    protected Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
