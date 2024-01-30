// 1.) DFS (Depth First Search) - Recursive Approach

import java.util.*;

class Graph {
  private int V;
  private LinkedList<Integer> adj[];

  public Graph(int v) {
    V = v;
    adj = new LinkedList[v];

    for (int i = 0; i < v; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  // Add an edge into the graph
  public void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // DFS traversal of the vertices reachable from v
  public void DFS(int v) {
    // Mark all the vertices as not visited (by default set as false)
    boolean visited[] = new boolean[V];

    // Call the recursive helper function to print DFS traversal
    DFSUtil(v, visited);
  }

  private void DFSUtil(int v, boolean visited[]) {
    // Mark the current node as visited and print it
    visited[v] = true;
    System.out.print(v + " ");

    // Recur for all the vertices adjacent to this vertex
    Iterator<Integer> i = adj[v].listIterator();

    while (i.hasNext()) {
      int n = i.next();

      if (!visited[n]) {
        DFSUtil(n, visited);
      }
    }
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of vertices: ");
    int V = scanner.nextInt();
    System.out.print("Enter the number of edges: ");
    int E = scanner.nextInt();
    Graph graph = new Graph(V);

    System.out.println("Enter the edges:");
    for (int i = 0; i < E; i++) {
      int src = scanner.nextInt();
      int dest = scanner.nextInt();
      graph.addEdge(src, dest);
    }

    System.out.println("Following is Depth First Traversal:");
    graph.DFS(0);

  }
}

// 2.) DFS (Depth First Search) - Iterative Approach
// 3.) BFS (Breadth First Search) - Iterative Approach
// 4.) Topological Sort - DFS Approach
// 5.) Topological Sort - BFS Approach
// 6.) Detect Cycle in a Directed Graph - DFS Approach
// 7.) Detect Cycle in a Directed Graph - BFS Approach
// 8.) Detect Cycle in a Undirected Graph - DFS Approach
// 9.) Detect Cycle in a Undirected Graph - BFS Approach
// 10.) Find Mother Vertex in a Graph
// 11.) Find Number of Islands in a Graph
// 12.) Find Number of Connected Components in a Graph
// 13.) Find Shortest Path from Source to All Vertices in a Graph
// 14.) Find Shortest Path from Source to Destination in a Graph
// 15.) Find Shortest Path from Every Vertex to Every Other Vertex in a Graph
// 16.) Find Minimum Spanning Tree (MST) using Prim's Algorithm
// 17.) Find Minimum Spanning Tree (MST) using Kruskal's Algorithm
// 18.) Find Strongly Connected Components (SCC) in a Graph using Kosaraju's
// Algorithm
// 19.) Find Strongly Connected Components (SCC) in a Graph using Tarjan's
// Algorithm
// 20.) Find Bridges in a Graph using Tarjan's Algorithm
// 21.) Find Articulation Points in a Graph using Tarjan's Algorithm
// 22.) Find Articulation Points in a Graph using DFS Algorithm
// 23.) Find Articulation Points in a Graph using BFS Algorithm
// 24.) Find Biconnected Components in a Graph using Tarjan's Algorithm
// 25.) Find Biconnected Components in a Graph using DFS Algorithm
// 26.) Find Biconnected Components in a Graph using BFS Algorithm
// 27.) Find All Paths from Source to Destination in a Graph
// 28.) Find All Paths from Source to Destination with Given Sum in a Graph
// 29.) Find All Paths from Source to Destination with Maximum Sum in a Graph
// 30.) Find All Paths from Source to Destination with Minimum Sum in a Graph
// 31.) Find All Paths from Source to Destination with Maximum Number of Edges
// in a Graph
// 32.) Find All Paths from Source to Destination with Minimum Number of Edges
// in a Graph
// 33.) Find All Paths from Source to Destination with Maximum Number of Hops in
// a Graph
// 34.) Find All Paths from Source to Destination with Minimum Number of Hops in
// a Graph
// 35.) Find All Paths from Source to Destination with Maximum Number of
// Vertices in a Graph
// 36.) Find All Paths from Source to Destination with Minimum Number of
// Vertices in a Graph
// 37.) Find All Paths from Source to Destination with Maximum Number of Turns
// in a Graph
// 38.) Find All Paths from Source to Destination with Minimum Number of Turns
// in a Graph
