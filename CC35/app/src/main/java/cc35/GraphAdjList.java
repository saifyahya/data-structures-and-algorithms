package CC35.app.src.main.java.cc35;

import java.util.LinkedList;

public class GraphAdjList {
    int vertices;
    int edges;
    LinkedList<Integer>[] adj;

    public GraphAdjList(int nodes){
        this.vertices=nodes;
        this.edges=0;
        this.adj=new LinkedList[nodes];

        for (int i =0 ;i< vertices;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int node1, int node2){
        this.adj[node1].add(node2);
        this.adj[node2].add(node1);
        this.edges++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(vertices+" Vertices "+ edges+" Edges "+"\n");
        for(int i=0;i<vertices;i++){
            sb.append(i+": ");
            for (int j=0;j<adj[i].size();j++){
                sb.append(adj[i].get(j)+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
