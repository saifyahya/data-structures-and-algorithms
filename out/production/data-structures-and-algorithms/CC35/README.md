## Graph Implementation

Implement a graph using adjacency list, and implement these methods: addVertex(), addEdge(), getVertices, getNeighbours().
- It uses a Hashmap with the key of type Vertex, and the value is a Linked-List of Edges.
- Each Vertex has  a value.
- Each Edge has a destination and a weight, the destination is a Vertex.

## Whiteboard process
![whiteboard](../assets/cc35-whiteboard.png)

## addVertex()
Arguments: Vertex, Returns: The added vertex.

## Approach and Efficiency
- It takes the vertex and use the `put` function to put the vertex and a value of empty linked list.
- Space Complexity: O(n), n: number of vertices.
- Time Complexity: O(1).

## addEdge()
Arguments: two vertices: start and destination, Returns: none.

## Approach and Efficiency
- It checks if the vertices are present in the map using `containKeys` method.
- if they are stored in the map, two edges will be created with the value of start and destination vertices respectively.
- for the start vertex: add the destination edge to its values.
- for the destination vertex: add the start edge to its values.
- Space Complexity: O(n), n: number of vertices.
- Time Complexity: O(1).

## getVertices()
Arguments: none, Returns: a set of all vertices in the graph.

## Approach and Efficiency
- It uses `keySet()` method to retrieve a set of keys, which are vertices in the graph.
- Space Complexity: O(n), n: number of vertices.
- Time Complexity: O(1).

## getNeighbours()
Arguments: vertex, Returns: a list for the edges for this vertex.

## Approach and Efficiency
- It uses `get()` method to retrieve the value for the given vertex, which are the edges (other vertices connected to it).
- Space Complexity: O(n), n: number of vertices.
- Time Complexity: O(1).


## Solution
![solution](../assets/cc35-sol.png)

## BFS
this method traverse the graph level-by-level starting from a given vertex.

## Approach and Efficiency
- Create a list to store the data traversed and a boolean array with size = maximum value in the graph + 1 to help us to track the visited vertices.
- Create a Queue to store the vertices and help us to do BFS traverse.
- Add the first vertex to the queue and change the value of the **array[vertex value]** to be true. 
- Looping through the queue vertices:
1. poll the vertex and add its value to the list.
2. loop through the edges of the vertex and check: if the value of **array[edge value]** equal false *(default value)*:
 a. make it true *(indicates visited vertex)*
 b. add this edge to the queue

- Space Complexity: *O(max vertex value)*.
- Time Complexity: *O(n)*.

## Whiteboard process
![whiteboard](../assets/cc36-whiteboard.png)

## Solution
![solution](../assets/cc36-sol.png)