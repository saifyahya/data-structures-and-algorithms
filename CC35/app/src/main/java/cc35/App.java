/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC35.app.src.main.java.cc35;

public class App {

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        System.out.println(graph);

        Graph myGraph = new Graph<>(4);
        Vertex one = new Vertex<>(1);
        Vertex two = new Vertex<>(2);
        Vertex three = new Vertex<>(3);
        Vertex four = new Vertex<>(4);
        myGraph.addVertex(one);
        myGraph.addVertex(two);
        myGraph.addVertex(three);
        myGraph.addVertex(four);
        myGraph.addEdge(one,two);
        myGraph.addEdge(two,three);
        myGraph.addEdge(three,four);
        myGraph.addEdge(four,one);
        System.out.println(myGraph);
        System.out.println(myGraph.bfs(one.value));




    }
}
