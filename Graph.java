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

    // System.out.println("Following is Depth First Traversal:");
    // graph.DFS(0);

    // System.out.println("\nFollowing is Breadth First Traversal:");
    // graph.BFS(0);

//   }
// }

// or
// for dfs and bfs both code below

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class Graph {

//   static void print(int[][] edges, int n, int sv, boolean[] visited) {
//     System.out.println(sv);
//     visited[sv] = true;
//     for (int i = 0; i < n; i++) {
//       if (i == sv) {
//         continue;
//       }
//       if (edges[sv][i] == 1 && !visited[i]) {
//         print(edges, n, i, visited);
//       }
//     }
//   }

//   static void printBFS(int[][] edges, int n, int sv) {
//     Queue<Integer> pendingVertices = new LinkedList<>();
//     boolean[] visited = new boolean[n];
//     for (int i = 0; i < n; i++) {
//       visited[i] = false;
//     }
//     pendingVertices.add(sv);
//     visited[sv] = true;
//     while (!pendingVertices.isEmpty()) {
//       int currentVertex = pendingVertices.poll();
//       System.out.println(currentVertex);
//       for (int i = 0; i < n; i++) {
//         if (i == currentVertex) {
//           continue;
//         }
//         if (edges[currentVertex][i] == 1 && !visited[i]) {
//           pendingVertices.add(i);
//           visited[i] = true;
//         }
//       }
//     }
//   }

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     int n = scanner.nextInt();
//     int e = scanner.nextInt();

//     int[][] edges = new int[n][n];
//     for (int i = 0; i < e; i++) {
//       int f = scanner.nextInt();
//       int s = scanner.nextInt();
//       edges[f][s] = 1;
//       edges[s][f] = 1;
//     }

//     boolean[] visited = new boolean[n];
//     for (int i = 0; i < n; i++) {
//       visited[i] = false;
//     }

//     System.out.println("DFS");
//     print(edges, n, 0, visited);

//     System.out.println("BFS");
//     printBFS(edges, n, 0);

//     // Delete all the memory
//     scanner.close();
//   }
// }

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

//     // Create a stack for DFS
//     Stack<Integer> stack = new Stack<Integer>();

//     // Push the current source node
//     stack.push(v);

//     while (!stack.isEmpty()) {
//       // Pop a vertex from stack and print it
//       v = stack.peek();
//       stack.pop();

//       // Stack may contain same vertex twice. So we need to print the popped item
//       // only if it is not visited.
//       if (!visited[v]) {
//         System.out.print(v + " ");
//         visited[v] = true;
//       }

//       // Get all adjacent vertices of the popped vertex s. If a adjacent has not been
//       // visited, then push it to the stack.
//       Iterator<Integer> i = adj[v].listIterator();

//       while (i.hasNext()) {
//         int n = i.next();

//         if (!visited[n]) {
//           stack.push(n);
//         }
//       }
//     }
//   }

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

//   }
// }

// or  both recursive and iterative dfs

// import java.util.*;

// class Graph {
//   private int V;
//   private List<Integer>[] adj;

//   public Graph(int v) {
//     V = v;
//     adj = new ArrayList[v];
//     for (int i = 0; i < v; i++) {
//       adj[i] = new ArrayList<>();
//     }
//   }

//   public void addEdge(int v, int w) {
//     adj[v].add(w);
//   }

//   public void recursiveDFS(int start) {
//     boolean[] visited = new boolean[V];
//     System.out.print("Recursive DFS: ");
//     recursiveDFSUtil(start, visited);
//     System.out.println();
//   }

//   private void recursiveDFSUtil(int v, boolean[] visited) {
//     visited[v] = true;
//     System.out.print(v + " ");
//     for (int neighbor : adj[v]) {
//       if (!visited[neighbor]) {
//         recursiveDFSUtil(neighbor, visited);
//       }
//     }
//   }

//   public void iterativeDFS(int start) {
//     boolean[] visited = new boolean[V];
//     Stack<Integer> stack = new Stack<>();
//     System.out.print("Iterative DFS: ");

//     stack.push(start);

//     while (!stack.isEmpty()) {
//       int current = stack.pop();

//       if (!visited[current]) {
//         System.out.print(current + " ");
//         visited[current] = true;

//         for (int neighbor : adj[current]) {
//           if (!visited[neighbor]) {
//             stack.push(neighbor);
//           }
//         }
//       }
//     }

//     System.out.println();
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter No of vertices");
//     int V = sc.nextInt();

//     System.out.println("Enter No of Edges");
//     int E = sc.nextInt();

//     Graph graph = new Graph(V);
//     for (int i = 0; i < E; i++) {
//       int src = sc.nextInt();
//       int des = sc.nextInt();
//       graph.addEdge(src, des);
//     }

//     graph.recursiveDFS(0);
//     graph.iterativeDFS(0);
//   }
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

// Note:- Before doing any of the above questions, first do the following questions:- 
// Lets do all important algorithms in Graphs
// 1.) DFS (Depth First Search) - Recursive Approach ->Done in the above code
// 2.) DFS (Depth First Search) - Iterative Approach ->Done in the above code
// 3.) BFS (Breadth First Search) - Iterative Approach ->Done in the above code
// 4.) Topological Sort - DFS Approach ->Done in the above code
// 5.) Topological Sort - BFS Approach ->Done in the above code

// Lets do important algorithms in Graphs
// 1.) Dijkstra's Algorithm

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Node implements Comparator<Node> {
//   public int node;
//   public int weight;

//   public Node() {
//   }

//   public Node(int node, int weight) {
//     this.node = node;
//     this.weight = weight;
//   }

//   @Override
//   public int compare(Node node1, Node node2) {
//     if (node1.weight < node2.weight) {
//       return -1;
//     }
//     if (node1.weight > node2.weight) {
//       return 1;
//     }
//     return 0;
//   }
// }

// class Graph {
//   private int V;
//   private LinkedList<Node> adj[];

//   public Graph(int v) {
//     V = v;
//     adj = new LinkedList[v];

//     for (int i = 0; i < v; i++) {
//       adj[i] = new LinkedList<Node>();
//     }
//   }

//   // Add an edge into the graph
//   public void addEdge(int v, int w, int weight) {
//     adj[v].add(new Node(w, weight));
//   }

//   // Dijkstra's Algorithm
//   public void dijkstra(int src) {
//     // Create a priority queue to store vertices that are being preprocessed
//     PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());

//     // Create a vector for distances and initialize all distances as infinite
//     int dist[] = new int[V];

//     // Create a vector to store parent pointers of all vertices
//     int parent[] = new int[V];

//     // Create a vector to store vertices included in shortest path tree
//     // or shortest distance from src to i is finalized
//     boolean sptSet[] = new boolean[V];

//     // Initialize all distances as INFINITE and stpSet[] as false
//     for (int i = 0; i < V; i++) {
//       dist[i] = Integer.MAX_VALUE;
//       sptSet[i] = false;
//     }

//     // Distance of source vertex from itself is always 0
//     dist[src] = 0;

//     // Insert source vertex into the priority queue and initialize its parent as -1
//     pq.add(new Node(src, 0));
//     parent[src] = -1;

//     // Looping till priority queue becomes empty (or all distances are not
//     // finalized)
//     while (!pq.isEmpty()) {
//       // The first vertex in pair is the minimum distance vertex, extract it from
//       // priority queue.
//       // vertex label is stored in second of pair (it has to be done this way to keep
//       // the vertices
//       // sorted distance (distance must be first item in pair)
//       int u = pq.poll().node;

//       // Mark the extracted vertex as processed
//       sptSet[u] = true;

//       // 'i' is used to get all adjacent vertices of a vertex
//       Iterator<Node> i = adj[u].listIterator();

//       while (i.hasNext()) {
//         Node node = i.next();
//         int v = node.node;
//         int weight = node.weight;

//         // If there is shorted path to v through u.
//         if (!sptSet[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
//           // Updating distance of v
//           dist[v] = dist[u] + weight;
//           pq.add(new Node(v, dist[v]));
//           parent[v] = u;
//         }
//       }
//     }

//     // Print shortest distances stored in dist[]
//     System.out.println("Vertex Distance from Source");
//     for (int i = 0; i < V; i++) {
//       System.out.println(i + " " + dist[i]);
//     }
//   }

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
//       int weight = scanner.nextInt();
//       graph.addEdge(src, dest, weight);
//     }

//     graph.dijkstra(0);

//   }
// }

// 2nd method without using iterator

// import java.util.*;

// class Graph {
//   class Node implements Comparator<Node> {
//     public int node;
//     public int weight;

//     public Node() {
//     }

//     public Node(int node, int weight) {
//       this.node = node;
//       this.weight = weight;
//     }

//     @Override
//     public int compare(Node node1, Node node2) {
//       if (node1.weight < node2.weight) {
//         return -1;
//       }
//       if (node1.weight > node2.weight) {
//         return 1;
//       }
//       return 0;
//     }
//   }

//   private int V;
//   private LinkedList<Node> adj[];

//   public Graph(int v) {
//     V = v;
//     adj = new LinkedList[v];

//     for (int i = 0; i < v; i++) {
//       adj[i] = new LinkedList<Node>();
//     }
//   }

//   // Add an edge into the graph
//   public void addEdge(int v, int w, int weight) {
//     adj[v].add(new Node(w, weight));
//   }

//   // Dijkstra's Algorithm
//   public void dijkstra(int src) {
//     // Create a priority queue to store vertices that are being preprocessed
//     PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());

//     // Create a vector for distances and initialize all distances as infinite
//     int dist[] = new int[V];

//     // Create a vector to store parent pointers of all vertices
//     int parent[] = new int[V];

//     // Create a vector to store vertices included in shortest path tree
//     // or shortest distance from src to i is finalized
//     boolean sptSet[] = new boolean[V];

//     // Initialize all distances as INFINITE and stpSet[] as false
//     for (int i = 0; i < V; i++) {
//       dist[i] = Integer.MAX_VALUE;
//       sptSet[i] = false;
//     }

//     // Distance of source vertex from itself is always 0
//     dist[src] = 0;

//     // Insert source vertex into the priority queue and initialize its parent as -1
//     pq.add(new Node(src, 0));
//     parent[src] = -1;

//     // Looping till priority queue becomes empty (or all distances are not
//     // finalized)
//     while (!pq.isEmpty()) {
//       // The first vertex in pair is the minimum distance vertex, extract it from
//       // priority queue.
//       // vertex label is stored in second of pair (it has to be done this way to keep
//       // the vertices
//       // sorted distance (distance must be first item in pair)
//       int u = pq.poll().node;

//       // Mark the extracted vertex as processed
//       sptSet[u] = true;

//       // 'i' is used to get all adjacent vertices of a vertex
//       for (Node node : adj[u]) {
//         int v = node.node;
//         int weight = node.weight;

//         // If there is shorted path
//         // to v through u.
//         if (!sptSet[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
//           // Updating distance of v
//           dist[v] = dist[u] + weight;
//           pq.add(new Node(v, dist[v]));
//           parent[v] = u;
//         }
//       }
//     }

//     // Print shortest distances stored in dist[]
//     System.out.println("Vertex Distance from Source");
    // for (int i = 0; i < V; i++) {
    //   System.out.println(i + " " + dist[i]);
    // }
//   }

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
//       int weight = scanner.nextInt();
//       graph.addEdge(src, dest, weight);
//     }

//     graph.dijkstra(0);

//   }
// }

// input format
// Enter the number of vertices: 9
// Enter the number of edges: 14
// Enter the edges:
// 0 1 4
// 0 7 8
// 1 2 8
// 1 7 11
// 2 3 7
// 2 8 2
// 2 5 4
// 3 4 9
// 3 5 14
// 4 5 10
// 5 6 2
// 6 7 1
// 6 8 6
// 7 8 7

// output format
// Vertex Distance from Source
// 0 0
// 1 4
// 2 12
// 3 19
// 4 21
// 5 11
// 6 9
// 7 8
// 8 14

// or 

// import java.util.*;
// import java.util.Arrays;

// class Graph {
//   private int V;
//   private List<Edge>[] adj;

//   class Edge {
//     int destination;
//     int weight;

//     Edge(int destination, int weight) {
//       this.destination = destination;
//       this.weight = weight;
//     }
//   }

//   public Graph(int v) {
//     V = v;
//     adj = new ArrayList[V];
//     for (int i = 0; i < V; i++) {
//       adj[i] = new ArrayList<>();
//     }
//   }

//   public void addEdge(int source, int destination, int weight) {
//     adj[source].add(new Edge(destination, weight));
//     adj[destination].add(new Edge(source, weight)); // For undirected graph
//   }

//   public void dijkstra(int source) {
//     PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
//     int[] distance = new int[V];
//     Arrays.fill(distance, Integer.MAX_VALUE);
//     distance[source] = 0;

//     minHeap.add(new Node(source, 0));

//     while (!minHeap.isEmpty()) {
//       Node current = minHeap.poll();

//       for (Edge neighbor : adj[current.vertex]) {
//         int newDistance = distance[current.vertex] + neighbor.weight;

//         if (newDistance < distance[neighbor.destination]) {
//           distance[neighbor.destination] = newDistance;
//           minHeap.add(new Node(neighbor.destination, newDistance));
//         }
//       }
//     }

//     printShortestPaths(distance);
//   }

//   private void printShortestPaths(int[] distance) {
//     System.out.println("Shortest Distances from Source:");
//     for (int i = 0; i < V; i++) {
//       System.out.println("Vertex " + i + ": " + distance[i]);
//     }
//   }

//   class Node {
//     int vertex;
//     int distance;

//     Node(int vertex, int distance) {
//       this.vertex = vertex;
//       this.distance = distance;
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter No of vertices");
//     int V = sc.nextInt();

//     System.out.println("Enter No of Edges");
//     int E = sc.nextInt();

//     Graph graph = new Graph(V);
//     for (int i = 0; i < E; i++) {
//       int src = sc.nextInt();
//       int des = sc.nextInt();
//       int weight = sc.nextInt();
//       graph.addEdge(src, des, weight);
//     }

//     System.out.println("Enter Source Vertex:");
//     int source = sc.nextInt();

//     graph.dijkstra(source);
//   }
// }

// or 

// import java.util.*;

// class Graph {
//   int V;
//   int graph[][];

//   Graph(int v) {
//     V = v;
//     graph = new int[V][V];
//   }

//   int minDistance(int dist[], Boolean sptSet[]) {
//     int min = Integer.MAX_VALUE, min_index = -1;

//     for (int v = 0; v < V; v++)
//       if (sptSet[v] == false && dist[v] <= min) {
//         min = dist[v];
//         min_index = v;
//       }

//     return min_index;
//   }

//   void printSolution(int dist[]) {
//     System.out.println("Vertex \t\t Distance from Source");
//     for (int i = 0; i < V; i++)
//       System.out.println(i + " \t\t " + dist[i]);
//   }

//   void dijkstra(int src) {
//     int dist[] = new int[V];
//     Boolean sptSet[] = new Boolean[V];

//     for (int i = 0; i < V; i++) {
//       dist[i] = Integer.MAX_VALUE;
//       sptSet[i] = false;
//     }

//     dist[src] = 0;

//     for (int count = 0; count < V - 1; count++) {
//       int u = minDistance(dist, sptSet);
//       sptSet[u] = true;

//       for (int v = 0; v < V; v++)
//         if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
//           dist[v] = dist[u] + graph[u][v];
//     }

//     printSolution(dist);
//   }

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the number of vertices:");
//     int v = scanner.nextInt();

//     Graph t = new Graph(v);

//     System.out.println("Enter the graph matrix:");
//     for (int i = 0; i < v; i++) {
//       for (int j = 0; j < v; j++) {
//         t.graph[i][j] = scanner.nextInt();
//       }
//     }

//     System.out.println("Enter the source vertex:");
//     int src = scanner.nextInt();

//     t.dijkstra(src);
//   }
// }

// Input Format:
// Enter the number of vertices:
// 4
// Enter the graph matrix:
// 0 5 0 10
// 0 0 3 0
// 0 0 0 1
// 0 0 0 0
// Enter the source vertex:
// 0

// Output Format:
// Vertex Distance from Source
// 0 0
// 1 5
// 2 8
// 3 9

// or 

// import java.util.*;
// import java.util.Arrays;

// class Graph {
//   private int V;
//   private int[][] graph;

//   public Graph(int v) {
//     V = v;
//     graph = new int[V][V];
//   }

//   public void readGraphMatrix(Scanner scanner) {
//     System.out.println("Enter the graph matrix:");
//     for (int i = 0; i < V; i++) {
//       for (int j = 0; j < V; j++) {
//         graph[i][j] = scanner.nextInt();
//       }
//     }
//   }

//   public void dijkstra(int source) {
//     int[] distance = new int[V];
//     boolean[] visited = new boolean[V];

//     Arrays.fill(distance, Integer.MAX_VALUE);
//     distance[source] = 0;

//     for (int count = 0; count < V - 1; count++) {
//       int u = minDistance(distance, visited);
//       visited[u] = true;

//       for (int v = 0; v < V; v++) {
//         if (!visited[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE
//             && distance[u] + graph[u][v] < distance[v]) {
//           distance[v] = distance[u] + graph[u][v];
//         }
//       }
//     }

//     printShortestPaths(distance);
//   }

//   private int minDistance(int[] distance, boolean[] visited) {
//     int min = Integer.MAX_VALUE;
//     int minIndex = -1;

//     for (int v = 0; v < V; v++) {
//       if (!visited[v] && distance[v] <= min) {
//         min = distance[v];
//         minIndex = v;
//       }
//     }

//     return minIndex;
//   }

//   private void printShortestPaths(int[] distance) {
//     System.out.println("Shortest Distances from Source:");
//     for (int i = 0; i < V; i++) {
//       System.out.println("Vertex " + i + ": " + distance[i]);
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number of vertices:");
//     int V = sc.nextInt();

//     Graph dijkstraAlgorithm = new Graph(V);
//     dijkstraAlgorithm.readGraphMatrix(sc);

//     System.out.println("Enter the source vertex:");
//     int source = sc.nextInt();

//     dijkstraAlgorithm.dijkstra(source);
//   }
// }

// 2.) Bellman Ford Algorithm

// import java.util.*;

// class Graph {
//   class Edge {
//     int source;
//     int destination;
//     int weight;

//     Edge() {
//       source = 0;
//       destination = 0;
//       weight = 0;
//     }

//     Edge(int source, int destination, int weight) {
//       this.source = source;
//       this.destination = destination;
//       this.weight = weight;
//     }
//   }

//   int V;
//   int E;
//   Edge edge[];

//   Graph(int v, int e) {
//     V = v;
//     E = e;
//     edge = new Edge[E];

//     for (int i = 0; i < E; i++) {
//       edge[i] = new Edge();
//     }
//   }

//   void BellmanFord(Graph graph, int source) {
//     int V = graph.V;
//     int E = graph.E;
//     int dist[] = new int[V];

//     // Step 1: Initialize distances from src to all other vertices as INFINITE
//     for (int i = 0; i < V; ++i)
//       dist[i] = Integer.MAX_VALUE;
//     dist[source] = 0;

//     // Step 2: Relax all edges |V| - 1 times. A simple shortest path from src to any
//     // other vertex can have at-most |V| - 1 edges
//     for (int i = 1; i < V; ++i) {
//       for (int j = 0; j < E; ++j) {
//         int u = graph.edge[j].source;
//         int v = graph.edge[j].destination;
//         int weight = graph.edge[j].weight;
//         if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
//           dist[v] = dist[u] + weight;
//       }
//     }

//     // Step 3: check for negative-weight cycles. The above step guarantees shortest
//     // distances if graph doesn't contain negative weight cycle. If we get a shorter
//     // path, then there is a cycle.
//     for (int j = 0; j < E; ++j) {
//       int u = graph.edge[j].source;
//       int v = graph.edge[j].destination;
//       int weight = graph.edge[j].weight;
//       if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
//         System.out.println("Graph contains negative weight cycle");
//         return;
//       }
//     }
//     printArr(dist, V);
//   }

//   // A utility function used to print the solution
//   void printArr(int dist[], int V) {
//     System.out.println("Vertex Distance from Source");
//     for (int i = 0; i < V; ++i)
//       System.out.println(i + "\t\t" + dist[i]);
//   }

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the number of vertices:");
//     int v = scanner.nextInt();
//     System.out.println("Enter the number of edges:");
//     int e = scanner.nextInt();

//     Graph graph = new Graph(v, e);

//     System.out.println("Enter the edges:");
//     for (int i = 0; i < e; i++) {
//       int src = scanner.nextInt();
//       int dest = scanner.nextInt();
//       int weight = scanner.nextInt();
//       graph.edge[i].source = src;
//       graph.edge[i].destination = dest;
//       graph.edge[i].weight = weight;
//     }

//     graph.BellmanFord(graph, 0);
//   }
// }

// or

// import java.util.*;
// import java.util.Arrays;

// class Graph {
// class Edge {
// int source, destination, weight;

// Edge(int source, int destination, int weight) {
// this.source = source;
// this.destination = destination;
// this.weight = weight;
// }
// }

// private int V, E;
// private List<Edge> edges;

// public Graph(int vertices, int edges) {
// V = vertices;
// E = edges;
// this.edges = new ArrayList<>();
// }

// public void addEdge(int source, int destination, int weight) {
// edges.add(new Edge(source, destination, weight));
// }

// public void bellmanFord(int source) {
// int[] distance = new int[V];
// Arrays.fill(distance, Integer.MAX_VALUE);
// distance[source] = 0;

// // Relax all edges V-1 times
// for (int i = 1; i < V; i++) {
// for (Edge edge : edges) {
// int u = edge.source;
// int v = edge.destination;
// int w = edge.weight;

// if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
// distance[v] = distance[u] + w;
// }
// }
// }

// // Check for negative weight cycles
// for (Edge edge : edges) {
// int u = edge.source;
// int v = edge.destination;
// int w = edge.weight;

// if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
// System.out.println("Graph contains negative weight cycle.");
// return;
// }
// }

// printShortestPaths(distance);
// }

// private void printShortestPaths(int[] distance) {
// System.out.println("Shortest Distances from Source:");
// for (int i = 0; i < V; i++) {
// System.out.println("Vertex " + i + ": " + distance[i]);
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number of vertices:");
// int V = sc.nextInt();

// System.out.println("Enter the number of edges:");
// int E = sc.nextInt();

// Graph bellmanFordAlgorithm = new Graph(V, E);

// System.out.println("Enter the edges (source destination weight):");
// for (int i = 0; i < E; i++) {
// int source = sc.nextInt();
// int destination = sc.nextInt();
// int weight = sc.nextInt();
// bellmanFordAlgorithm.addEdge(source, destination, weight);
// }

// System.out.println("Enter the source vertex:");
// int source = sc.nextInt();

// bellmanFordAlgorithm.bellmanFord(source);
// }
// }

// or

// import java.util.*;

// class Edge {
// int src, dest, weight;

// Edge() {
// src = dest = weight = 0;
// }
// };

// class Graph {
// int V, E;
// Edge edge[];

// Graph(int v, int e) {
// V = v;
// E = e;
// edge = new Edge[e];
// for (int i = 0; i < e; ++i)
// edge[i] = new Edge();
// }

// void BellmanFord(Graph graph, int src) {
// int V = graph.V, E = graph.E;
// int dist[] = new int[V];

// for (int i = 0; i < V; ++i)
// dist[i] = Integer.MAX_VALUE;
// dist[src] = 0;

// for (int i = 1; i < V; ++i) {
// for (int j = 0; j < E; ++j) {
// int u = graph.edge[j].src;
// int v = graph.edge[j].dest;
// int weight = graph.edge[j].weight;
// if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
// dist[v] = dist[u] + weight;
// }
// }

// for (int j = 0; j < E; ++j) {
// int u = graph.edge[j].src;
// int v = graph.edge[j].dest;
// int weight = graph.edge[j].weight;
// if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
// System.out.println("Graph contains negative weight cycle");
// return;
// }
// }
// printArr(dist, V);
// }

// void printArr(int dist[], int V) {
// System.out.println("Vertex Distance from Source");
// for (int i = 0; i < V; ++i)
// System.out.println(i + "\t\t" + dist[i]);
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter the number of vertices:");
// int V = scanner.nextInt();
// System.out.println("Enter the number of edges:");
// int E = scanner.nextInt();

// Graph graph = new Graph(V, E);

// System.out.println("Enter the edges (source vertex, destination vertex,
// weight):");
// for (int i = 0; i < E; ++i) {
// graph.edge[i].src = scanner.nextInt();
// graph.edge[i].dest = scanner.nextInt();
// graph.edge[i].weight = scanner.nextInt();
// }

// System.out.println("Enter the source vertex:");
// int src = scanner.nextInt();

// graph.BellmanFord(graph, src);
// }
// }
// Input Format:
// Enter the number of vertices:
// 5
// Enter the number of edges:
// 8
// Enter the edges:
// 0 1 -1
// 0 2 4
// 1 2 3
// 1 3 2
// 1 4 2
// 3 2 5
// 3 1 1
// 4 3 -3

// Output Format:
// Vertex Distance from Source
// 0 0
// 1 -1
// 2 2
// 3 -2
// 4 1

// 3.) Floyd Warshall Algorithm

// import java.util.Scanner;

// public class Graph {
//   final static int INF = 99999;

//   void floydWarshall(int graph[][]) {
//     int V = graph.length;
//     int dist[][] = new int[V][V];
//     int i, j, k;

//     for (i = 0; i < V; i++)
//       for (j = 0; j < V; j++)
//         dist[i][j] = (i == j) ? 0 : (graph[i][j] == 0 ? INF : graph[i][j]);

//     for (k = 0; k < V; k++) {
//       for (i = 0; i < V; i++) {
//         for (j = 0; j < V; j++) {
//           if (dist[i][k] + dist[k][j] < dist[i][j])
//             dist[i][j] = dist[i][k] + dist[k][j];
//         }
//       }
//     }

//     printSolution(dist);
//   }

//   void printSolution(int dist[][]) {
//     System.out.println("Following matrix shows the shortest " +
//         "distances between every pair of vertices");
//     for (int i = 0; i < dist.length; ++i) {
//       for (int j = 0; j < dist.length; ++j) {
//         if (dist[i][j] == INF)
//           System.out.print("INF ");
//         else
//           System.out.print(dist[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the number of vertices:");
//     int V = scanner.nextInt();

//     int graph[][] = new int[V][V];
//     System.out.println("Enter the graph matrix:");
//     for (int i = 0; i < V; ++i) {
//       for (int j = 0; j < V; ++j) {
//         graph[i][j] = scanner.nextInt();
//       }
//     }

//     Graph a = new Graph();
//     a.floydWarshall(graph);
//   }
// }

// Input Format:
// Enter the number of vertices:
// 4
// Enter the graph matrix:
// 0 5 0 10
// 0 0 3 0
// 0 0 0 1
// 0 0 0 0

// output format
// Following matrix shows the shortest distances bn every pair of vertices
// 0 5 8 9
// INF 0 3 4
// INF INF 0 1
// INF INF INF 0

// or

// import java.util.Scanner;

// public class Graph {
// final static int INF = 99999;

// void floydWarshall(int graph[][]) {
// int V = graph.length;
// int dist[][] = new int[V][V];
// int i, j, k;

// for (i = 0; i < V; i++)
// for (j = 0; j < V; j++)
// dist[i][j] = (i == j) ? 0 : graph[i][j];

// for (k = 0; k < V; k++) {
// for (i = 0; i < V; i++) {
// for (j = 0; j < V; j++) {
// if (dist[i][k] + dist[k][j] < dist[i][j])
// dist[i][j] = dist[i][k] + dist[k][j];
// }
// }
// }

// printSolution(dist);
// }

// void printSolution(int dist[][]) {
// System.out.println("Following matrix shows the shortest " +
// "distances between every pair of vertices");
// for (int i = 0; i < dist.length; ++i) {
// for (int j = 0; j < dist.length; ++j) {
// if (dist[i][j] == INF)
// System.out.print("INF ");
// else
// System.out.print(dist[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter the number of vertices:");
// int V = scanner.nextInt();

// int graph[][] = new int[V][V];
// System.out.println("Enter the graph matrix (use 'INF' for infinity):");
// for (int i = 0; i < V; ++i) {
// for (int j = 0; j < V; ++j) {
// String input = scanner.next();
// graph[i][j] = input.equals("INF") ? INF : Integer.parseInt(input);
// }
// }

// Graph a = new Graph();
// a.floydWarshall(graph);
// }
// }

// Input Format:
// Enter the number of vertices:
// 4
// Enter the graph matrix:
// 0 5 INF 10
// INF 0 3 INF
// INF INF 0 1
// INF INF INF 0

// output format
// Following matrix shows the shortest distances between every pair of vertices
// 0 5 8 9
// INF 0 3 4
// INF INF 0 1
// INF INF INF 0

// 4.) Johnson's Algorithm
// 5.) Travelling Salesman Problem (TSP)
// 6.) Prim's Algorithm
// 7.) Kruskal's Algorithm
// 8.) Kosaraju's Algorithm
// 9.) Tarjan's Algorithm
// 10.) Bridges in a Graph
// 11.) Articulation Points in a Graph
// 12.) Biconnected Components in a Graph
// 13.) Hamiltonian Cycle in a Graph
// 14.) Hamiltonian Path in a Graph
// 15.) Eulerian Path in a Graph
// 16.) Eulerian Circuit in a Graph
// 17.) Chinese Postman Problem
// 18.) Maximum Flow Problem
// 19.) Minimum Cost Maximum Flow Problem
// 20.) Maximum Bipartite Matching
// 21.) Minimum Vertex Cover
// 22.) Maximum Independent Set
// 23.) K-Cores of a Graph
// 24.) Graph Coloring
// 25.) Kabell's Algorithm , Karger's Algorithm , Karger-Stein Algorithm
// 26.) Bron-Kerbosch Algorithm
// 27.) Edmonds-Karp Algorithm
// 28.) Hopcroft-Karp Algorithm
// 29.) Dinic's Algorithm
// 30.) Hungarian Algorithm
// 31.) Gale-Shapley Algorithm
// 32.) Ford-Fulkerson Algorithm
// 33.) Push-Relabel Algorithm
// 34.) Boyer-Moore Algorithm
// 35.) Rabin-Karp Algorithm
// 36.) KMP Algorithm
// 37.) Aho-Corasick Algorithm
// 38.) Z Algorithm
// 39.) Manacher's Algorithm
// 40.) Suffix Array
// 41.) Suffix Tree
// 42.) Suffix Automaton
// 43.) Burrows-Wheeler Transform
// 44.) kabutomushi Algorithm
// 45.) Kartsuba's Algorithm