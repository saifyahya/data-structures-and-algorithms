package CC35.app.src.main.java.cc35;

import java.util.*;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;

    public Graph(int maxNumberOfVertices)
    {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(Vertex<T> newVertex)  // addNode()
    {
        // TODO: implement me
       // Vertex<T> newVertex = new Vertex<>(value);
        adjacencyLists.putIfAbsent(newVertex,new LinkedList<>());
        numberOfVertices++;
        return newVertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination)
    {
        addEdge(start, destination, 0);
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) {
        // Check if both start and destination vertices are in the graph
        if (adjacencyLists.containsKey(start) && adjacencyLists.containsKey(destination)) {
            // Create edges with the destination vertex and the specified weight
            Edge<T> edge1 = new Edge<>(destination, weight);
            Edge<T> edge2 = new Edge<>(start, weight);

            adjacencyLists.get(start).add(edge1);
            adjacencyLists.get(destination).add(edge2);

        } else {
            System.out.println("One or both vertices are not present in the adjacencyLists map.");
        }
    }

    public Set<Vertex<T>> getVertices()  // getNodes()
    {
        // TODO: implement me
        return  adjacencyLists.keySet();

    }

    public List<Edge<T>> getNeighbors(Vertex vertex)
    {
 return adjacencyLists.get(vertex);
    }

    public int size()
    {
        return numberOfVertices;  // TODO: make sure this gets updated at the right times
    }

    @Override
    public int compareTo(Graph<T> o)
    {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString()
    {
        // Good for testing
        // WARNING: Your HashMap does not guarantee ordering!
        // But you can basically rely on it if you add nodes to your graphs in a consistent way
        StringBuilder stringBuilder =new StringBuilder();
        for (Map.Entry<Vertex<T>,LinkedList<Edge<T>>> vertex:adjacencyLists.entrySet()){
            stringBuilder.append( "Vertex: "+vertex.getKey().toString()+" Edges: ");
            for(Edge edge:vertex.getValue())
                stringBuilder.append(edge.destination.value+" ");
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }

    public List<T> bfs(Vertex<T> vertex){
        List<T> result = new ArrayList<>();
        int maximumValue_inTheGraph = findMaxVertexValue();
        boolean[] visited = new boolean[maximumValue_inTheGraph+1];
        Queue<Vertex> queue = new LinkedList<>();
        queue.offer(vertex);
        visited[(Integer) vertex.value]=true;
        while (!queue.isEmpty()){
            Vertex temp =queue.poll();
            result.add((T) temp.value);
            for (Edge<T> edge: adjacencyLists.get(temp)){
                if(!visited[(Integer) edge.destination.value]){
                    visited[(Integer) edge.destination.value]=true;
                    queue.offer(edge.destination);
                }
            }
        }
        return result;
    }
    private int findMaxVertexValue() {
        int maxVertexValue = Integer.MIN_VALUE;
        for (Vertex<T> vertex : adjacencyLists.keySet()) {
            int vertexValue = (Integer) vertex.value;
            maxVertexValue = Math.max(maxVertexValue, vertexValue);
        }
        return maxVertexValue;
    }

    public Integer businessTrip(Graph graph, String[] cities){
        int totalCost=0;
        if(cities.length==0 || cities.length==1)
            return totalCost;
        Vertex retrievedVertex=null;
        boolean cityFounded = false;
        for(int i = 0 ; i<cities.length;i++){
            retrievedVertex=findVertexFromValue((T) cities[i]);
            if(retrievedVertex==null)
            return null;
            if(i<cities.length-1 && cities[i].equals(cities[i+1]))  // two same cities, go from city to the same city
            {
                cityFounded=true;
                continue ;}
            for(Object edge: graph.getNeighbors(retrievedVertex)){
                Edge retrievedEdge= (Edge) edge;
                if( i<cities.length-1 && retrievedEdge.destination.value.equals((T) cities[i+1])){  //search for neighbours unless we reach last vertex
                    totalCost+=retrievedEdge.weight;
                    cityFounded=true;
                }
            }
            if(cityFounded==false)
            return null;
            if(i!=cities.length-2)    //because next vertex will be the last one, and I don't want to check cityFounded for it
                cityFounded=false;
        }
        return totalCost;
    }
    private Vertex findVertexFromValue(T value){
        for(Vertex vertex:adjacencyLists.keySet()){
            if(vertex.value.equals(value))
                return vertex;
        }
        return null;
    }


}