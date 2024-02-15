import java.util.*;

class Node implements Comparator<Node> {
    int node, weight;

    public Node() {
    }

    public Node(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public int compare(Node node1, Node node2) {
        if (node1.weight < node2.weight) return -1;
        if (node1.weight > node2.weight) return 1;
        return 0;
    }
}

class Graph {
    private int V;
    private LinkedList<Node> adj[];

    public Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<Node>();
    }

    public void addEdge(int v, int w, int weight) {
        adj[v].add(new Node(w, weight));
        adj[w].add(new Node(v, weight)); // Add this line for undirected graph
    }

    public void dijkstra(int src) {
        PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());
        int[] dist = new int[V];
        int[] parent = new int[V];
        boolean[] vis = new boolean[V];

        // Initialize distance array with maximum values and set all vertices as unvisited
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            vis[i] = false;
        }

        // Set distance of source vertex to itself as 0 and add it to the priority queue
        dist[src] = 0;
        parent[src] = -1;
        pq.add(new Node(src, 0));

        // Dijkstra's algorithm
        while (!pq.isEmpty()) {
            int u = pq.poll().node; // Extract vertex with minimum distance from priority queue
            vis[u] = true; // Mark vertex as visited

            // Traverse adjacent vertices of the current vertex
            for (Node node : adj[u]) {
                int v = node.node;
                int weight = node.weight;

                // Update distance if the current path is shorter than the previously known distance
                if (!vis[v] && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v])); // Add updated vertex to priority queue
                    parent[v] = u; // Update parent of the vertex
                }
            }
        }

        // Print vertex distances from the source vertex
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        System.out.println("Enter the number of edges:");
        int E = sc.nextInt();
        Graph graph = new Graph(V);
        System.out.println("Enter the edges:");
        for (int i = 0; i < E; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            int weight = sc.nextInt();
            graph.addEdge(src, des, weight);
        }
        graph.dijkstra(0); // Assuming source vertex is 0
    }
}
