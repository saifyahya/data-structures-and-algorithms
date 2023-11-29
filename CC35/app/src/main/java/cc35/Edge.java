package CC35.app.src.main.java.cc35;

import java.util.Objects;

public class Edge<T extends Comparable<? super T>> implements Comparable<Vertex<T>> // just in case you have Comparable data structures
{
    public Vertex<T> destination;   //destination vertex of this edge
    public int weight;  // Feel free to use a double instead, but comparison is a little trickier

    public Edge(Vertex<T> destination)  // telescoping constructor
    {
        this(destination, 0);  // don't really need, though, because weight will have 0 as a value to start
    }

    public Edge(Vertex<T> destination, int weight) {
    this.destination = destination;
    this.weight = weight;
}

    public Vertex<T> getDestination() {
        return destination;
    }

    @Override
    public int compareTo(Vertex<T> o) {
        throw new UnsupportedOperationException("Edge does not implement compareTo()");
    }

    @Override
    public String toString() {
        return "Edge{" +
                "destination=" + destination +
                ", weight=" + weight +
                '}';
    }
}