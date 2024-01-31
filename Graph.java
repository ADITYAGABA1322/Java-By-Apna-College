// 1.) DFS (Depth First Search) - Recursive Approach

// import java.util.*;

// class Graph {
//   private int V;
//   private LinkedList<Integer> adj[];

//   public Graph(int v) {
//     V = v;
//     adj = new LinkedList[v];

//     for (int i = 0; i < v; i++) {
//       adj[i] = new LinkedList<Integer>();
//     }
//   }

//   // Add an edge into the graph
//   public void addEdge(int v, int w) {
//     adj[v].add(w);
//   }

//   // DFS traversal of the vertices reachable from v
//   public void DFS(int v) {
//     // Mark all the vertices as not visited (by default set as false)
//     boolean visited[] = new boolean[V];

//     // Call the recursive helper function to print DFS traversal
//     DFSUtil(v, visited);
//   }

//   void DFSUtil(int v, boolean[] vis) {
//     vis[v] = true;
//     System.out.print(v + " ");
//     for (int n : adj[v]) {
//       if (!vis[n]) {
//         DFSUtil(n, vis);
//       }
//     }
//   }

//   void BFS(int v) {
//     boolean[] vis = new boolean[V];
//     Queue<Integer> q = new LinkedList<>();
//     vis[v] = true;
//     q.add(v);
//     while (!q.isEmpty()) {
//       v = q.poll();
//       System.out.print(v + " ");
//       for (int n : adj[v]) {
//         if (!vis[n]) {
//           q.add(n);
//           vis[n] = true;
//         }
//       }
//     }
//   }

// A function used by DFS
// private void DFSUtil(int v, boolean visited[]) {
// // Mark the current node as visited and print it
// visited[v] = true;
// System.out.print(v + " ");

// // Recur for all the vertices adjacent to this vertex
// Iterator<Integer> i = adj[v].listIterator();

// while (i.hasNext()) {
// int n = i.next();

// if (!visited[n]) {
// DFSUtil(n, visited);
// }
// }
// }

// public void BFS(int s) { // s = source
// boolean visited[] = new boolean[V];
// LinkedList<Integer> queue = new LinkedList<>();

// visited[s] = true;
// queue.add(s);

// while (queue.size() != 0) {
// s = queue.poll();
// System.out.print(s + " ");

// Iterator<Integer> i = adj[s].listIterator(); // i = iterator -> use i for
// iteration of adjLists of s (source) vertex and add it to queue if not visited
// and mark it as visited if not visited and repeat the process until queue is
// empty and print the queue at last to get the BFS traversal of the graph (i.e.
// the order in which the vertices are visited in BFS traversal of the graph)
// and we can also use a stack instead of queue to get the DFS traversal of the
// graph (i.e. the order in which the vertices are visited in DFS traversal of
// the graph)
// while (i.hasNext()) {
// int n = i.next();
// if (!visited[n]) {
// queue.add(n);
// visited[n] = true;
// }
// }
// }
// }

//   public static void main(String args[]) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Enter the number of vertices: ");
//     int V = scanner.nextInt();
//     System.out.print("Enter the number of edges: ");
//     int E = scanner.nextInt();
//     Graph graph = new Graph(V);

//     System.out.println("Enter the edges:");
//     for (int i = 0; i < E; i++) {
//       int src = scanner.nextInt();
//       int dest = scanner.nextInt();
//       graph.addEdge(src, dest);
//     }

//     System.out.println("Following is Depth First Traversal:");
//     graph.DFS(0);

//     System.out.println("\nFollowing is Breadth First Traversal:");
//     graph.BFS(0);

//   }
// }

// for dfs and bfs both code below

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

  static void print(int[][] edges, int n, int sv, boolean[] visited) {
    System.out.println(sv);
    visited[sv] = true;
    for (int i = 0; i < n; i++) {
      if (i == sv) {
        continue;
      }
      if (edges[sv][i] == 1 && !visited[i]) {
        print(edges, n, i, visited);
      }
    }
  }

  static void printBFS(int[][] edges, int n, int sv) {
    Queue<Integer> pendingVertices = new LinkedList<>();
    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      visited[i] = false;
    }
    pendingVertices.add(sv);
    visited[sv] = true;
    while (!pendingVertices.isEmpty()) {
      int currentVertex = pendingVertices.poll();
      System.out.println(currentVertex);
      for (int i = 0; i < n; i++) {
        if (i == currentVertex) {
          continue;
        }
        if (edges[currentVertex][i] == 1 && !visited[i]) {
          pendingVertices.add(i);
          visited[i] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int e = scanner.nextInt();

    int[][] edges = new int[n][n];
    for (int i = 0; i < e; i++) {
      int f = scanner.nextInt();
      int s = scanner.nextInt();
      edges[f][s] = 1;
      edges[s][f] = 1;
    }

    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      visited[i] = false;
    }

    System.out.println("DFS");
    print(edges, n, 0, visited);

    System.out.println("BFS");
    printBFS(edges, n, 0);

    // Delete all the memory
    scanner.close();
  }
}

// or

// import java.util.*;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;

// public class Graph {

// private Map<Integer, List<Integer>> adjacencyList;

// public Graph() {
// adjacencyList = new HashMap<>();
// }

// public void addEdge(int from, int to) {
// adjacencyList.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
// adjacencyList.computeIfAbsent(to, k -> new ArrayList<>()).add(from); // for
// undirected graph
// }

// public void dfs(int start) {
// Set<Integer> visited = new HashSet<>();
// System.out.println("Depth-First Search:");
// dfsRecursive(start, visited);
// }

// private void dfsRecursive(int current, Set<Integer> visited) {
// if (!visited.contains(current)) {
// System.out.print(current + " ");
// visited.add(current);
// for (int neighbor : adjacencyList.getOrDefault(current,
// Collections.emptyList())) {
// dfsRecursive(neighbor, visited);
// }
// }
// }

// public void bfs(int start) {
// Set<Integer> visited = new HashSet<>();
// Queue<Integer> queue = new LinkedList<>();
// System.out.println("\nBreadth-First Search:");
// queue.add(start);

// while (!queue.isEmpty()) {
// int current = queue.poll();
// if (!visited.contains(current)) {
// System.out.print(current + " ");
// visited.add(current);
// for (int neighbor : adjacencyList.getOrDefault(current,
// Collections.emptyList())) {
// queue.add(neighbor);
// }
// }
// }
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of vertices: ");
// int vertices = scanner.nextInt();

// Graph graph = new Graph();

// System.out.println("Enter the edges (format: from to):");
// for (int i = 0; i < vertices - 1; i++) {
// int from = scanner.nextInt();
// int to = scanner.nextInt();
// graph.addEdge(from, to);
// }

// System.out.print("Enter the starting vertex for traversal: ");
// int startVertex = scanner.nextInt();

// graph.dfs(startVertex);
// graph.bfs(startVertex);

// scanner.close();
// }
// }

// or

// import java.util.*;

// class Graph {
// private int numVertices;
// private LinkedList<Integer> adjLists[];

// Graph(int vertices) {
// numVertices = vertices;
// adjLists = new LinkedList[vertices];
// for (int i = 0; i < vertices; i++) {
// adjLists[i] = new LinkedList<>();
// }
// }

// void addEdge(int src, int dest) {
// adjLists[src].add(dest);
// }

// void DFS(int vertex) {
// boolean visited[] = new boolean[numVertices];
// DFSUtil(vertex, visited);
// }

// void DFSUtil(int vertex, boolean visited[]) {
// visited[vertex] = true;
// System.out.print(vertex + " ");

// Iterator<Integer> it = adjLists[vertex].listIterator();
// while (it.hasNext()) {
// int adj = it.next();
// if (!visited[adj])
// DFSUtil(adj, visited);
// }
// }

// void BFS(int s) { // s = source
// boolean visited[] = new boolean[numVertices];
// LinkedList<Integer> queue = new LinkedList<>();

// visited[s] = true;
// queue.add(s);

// while (queue.size() != 0) {
// s = queue.poll();
// System.out.print(s + " ");

// Iterator<Integer> i = adjLists[s].listIterator(); // i = iterator -> use i
// for iteration of adjLists of s (source) vertex and add it to queue if not
// visited and mark it as visited if not visited and repeat the process until
// queue is empty and print the queue at last to get the BFS traversal of the
// graph (i.e. the order in which the vertices are visited in BFS traversal of
// the graph) and we can also use a stack instead of queue to get the DFS
// traversal of the graph (i.e. the order in which the vertices are visited in
// DFS traversal of the graph)
// while (i.hasNext()) {
// int n = i.next();
// if (!visited[n]) {
// queue.add(n);
// visited[n] = true;
// }
// }
// }
// }

// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter the number of vertices:");
// int v = scanner.nextInt();
// System.out.println("Enter the number of edges:");
// int e = scanner.nextInt();

// Graph g = new Graph(v);

// System.out.println("Enter the edges:");
// for (int i = 0; i < e; i++) {
// int src = scanner.nextInt();
// int dest = scanner.nextInt();
// g.addEdge(src, dest);
// }

// System.out.println("Following is Depth First Traversal:");
// g.DFS(0);

// System.out.println("\nFollowing is Breadth First Traversal:");
// g.BFS(0);
// }
// }

// 2.) DFS (Depth First Search) - Iterative Approach

// import java.util.*;

// class Graph {
// private int V;
// private LinkedList<Integer> adj[];

// public Graph(int v) {
// V = v;
// adj = new LinkedList[v];

// for (int i = 0; i < v; i++) {
// adj[i] = new LinkedList<Integer>();
// }
// }

// // Add an edge into the graph
// public void addEdge(int v, int w) {
// adj[v].add(w);
// }

// // DFS traversal of the vertices reachable from v
// public void DFS(int v) {
// // Mark all the vertices as not visited (by default set as false)
// boolean visited[] = new boolean[V];

// // Create a stack for DFS
// Stack<Integer> stack = new Stack<Integer>();

// // Push the current source node
// stack.push(v);

// while (!stack.isEmpty()) {
// // Pop a vertex from stack and print it
// v = stack.peek();
// stack.pop();

// // Stack may contain same vertex twice. So we need to print the popped item
// // only if it is not visited.
// if (!visited[v]) {
// System.out.print(v + " ");
// visited[v] = true;
// }

// // Get all adjacent vertices of the popped vertex s. If a adjacent has not
// been
// // visited, then push it to the stack.
// Iterator<Integer> i = adj[v].listIterator();

// while (i.hasNext()) {
// int n = i.next();

// if (!visited[n]) {
// stack.push(n);
// }
// }
// }
// }

// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of vertices: ");
// int V = scanner.nextInt();
// System.out.print("Enter the number of edges: ");
// int E = scanner.nextInt();
// Graph graph = new Graph(V);

// System.out.println("Enter the edges:");
// for (int i = 0; i < E; i++) {
// int src = scanner.nextInt();
// int dest = scanner.nextInt();
// graph.addEdge(src, dest);
// }

// System.out.println("Following is Depth First Traversal:");
// graph.DFS(0);

// }
// }

// Input Format:
// Enter the number of vertices: 5
// Enter the number of edges: 4
// Enter the edges:
// 0 1
// 0 2
// 1 3
// 2 4

// Output Format:
// Following is Depth First Traversal:
// 0 2 4 1 3

// 3.) BFS (Breadth First Search) - Iterative Approach

// import java.util.*;

// class Graph {
// private int V;
// private LinkedList<Integer> adj[];

// public Graph(int v) {
// V = v;
// adj = new LinkedList[v];

// for (int i = 0; i < v; i++) {
// adj[i] = new LinkedList<Integer>();
// }
// }

// // Add an edge into the graph
// public void addEdge(int v, int w) {
// adj[v].add(w);
// }

// // BFS traversal of the vertices reachable from v
// public void BFS(int v) {
// // Mark all the vertices as not visited (by default set as false)
// boolean visited[] = new boolean[V];

// // Create a queue for BFS
// Queue<Integer> queue = new LinkedList<Integer>();

// // Mark the current node as visited and enqueue it
// visited[v] = true;
// queue.add(v);

// while (queue.size() != 0) {
// // Dequeue a vertex from queue and print it
// v = queue.poll();
// System.out.print(v + " ");

// // Get all adjacent vertices of the dequeued vertex s. If a adjacent has not
// // been visited, then mark it visited and enqueue it
// Iterator<Integer> i = adj[v].listIterator();

// while (i.hasNext()) {
// int n = i.next();

// if (!visited[n]) {
// visited[n] = true;
// queue.add(n);
// }
// }
// }
// }

// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of vertices: ");
// int V = scanner.nextInt();
// System.out.print("Enter the number of edges: ");
// int E = scanner.nextInt();
// Graph graph = new Graph(V);

// System.out.println("Enter the edges:");
// for (int i = 0; i < E; i++) {
// int src = scanner.nextInt();
// int dest = scanner.nextInt();
// graph.addEdge(src, dest);
// }

// System.out.println("Following is Breadth First Traversal:");
// graph.BFS(0);

// }
// }

// 4.) Topological Sort - DFS Approach

// import java.util.*;

// class Graph {
// private int V;
// private LinkedList<Integer> adj[];

// public Graph(int v) {
// V = v;
// adj = new LinkedList[v];

// for (int i = 0; i < v; i++) {
// adj[i] = new LinkedList<Integer>();
// }
// }

// // Add an edge into the graph
// public void addEdge(int v, int w) {
// adj[v].add(w);
// }

// // A recursive function used by topologicalSort
// private void topologicalSortUtil(int v, boolean visited[], Stack<Integer>
// stack) {
// // Mark the current node as visited
// visited[v] = true;

// // Recur for all the vertices adjacent to this vertex
// Iterator<Integer> i = adj[v].listIterator();

// while (i.hasNext()) {
// int n = i.next();

// if (!visited[n]) {
// topologicalSortUtil(n, visited, stack);
// }
// }

// // Push current vertex to stack which stores result
// stack.push(v);
// }

// // The function to do Topological Sort. It uses recursive
// topologicalSortUtil()
// public void topologicalSort() {
// Stack<Integer> stack = new Stack<Integer>();

// // Mark all the vertices as not visited
// boolean visited[] = new boolean[V];

// // Call the recursive helper function to store Topological Sort starting from
// // all
// // vertices one by one
// for (int i = 0; i < V; i++) {
// if (!visited[i]) {
// topologicalSortUtil(i, visited, stack);
// }
// }

// // Print contents of stack
// while (!stack.isEmpty()) {
// System.out.print(stack.pop() + " ");
// }
// }

// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of vertices: ");
// int V = scanner.nextInt();
// System.out.print("Enter the number of edges: ");
// int E = scanner.nextInt();
// Graph graph = new Graph(V);

// System.out.println("Enter the edges:");
// for (int i = 0; i < E; i++) {
// int src = scanner.nextInt();
// int dest = scanner.nextInt();
// graph.addEdge(src, dest);
// }

// System.out.println("Following is a Topological Sort of the given graph:");
// graph.topologicalSort();

// }
// }

// Input Format:
// Enter the number of vertices: 6
// Enter the number of edges: 6
// Enter the edges:
// 5 2
// 5 0
// 4 0
// 4 1
// 2 3
// 3 1

// Output Format:
// Following is a Topological Sort of the given graph:
// 5 4 2 3 1 0

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
