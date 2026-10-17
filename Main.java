
import java.util.LinkedList;
import java.util.HashSet;

class Vertex {
    private String name;
    private LinkedList<Edge> edgeList;

    public Vertex(String name) {
        this.name = name;
        edgeList = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Edge> getEdges() {
        return edgeList;
    }
}

class Edge {
    private int weight;
    private Vertex destVertex;

    public Edge(Vertex dest, int w) {
        this.destVertex = dest;
        this.weight = w;
    }

    public Edge(Vertex dest) {
        this.destVertex = dest;
        this.weight = 1;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getDestVertex() {
        return destVertex;
    }
}

class Graph {
    private HashSet<Vertex> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight) {
        return v1.getEdges().add(new Edge(v2, weight));
    }

    public boolean AddVertex(Vertex v) {
        return nodes.add(v);
    }

    public void printGraph() {
        for (Vertex v : nodes) {
            System.out.print("vertex name: " + v.getName() + ": ");
            for (Edge e : v.getEdges()) {
                System.out.print("destVertex: "
                        + e.getDestVertex().getName()
                        + " weight: " + e.getWeight() + " | ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph ourGraph = new Graph();

        // vertices
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");

        ourGraph.AddVertex(v0);
        ourGraph.AddVertex(v1);
        ourGraph.AddVertex(v2);
        ourGraph.AddVertex(v3);

        // edges
        ourGraph.AddEdge(v0, v1, 2);
        ourGraph.AddEdge(v1, v2, 3);
        ourGraph.AddEdge(v2, v0, 1);
        ourGraph.AddEdge(v2, v3, 1);
        ourGraph.AddEdge(v3, v2, 4);

        ourGraph.printGraph();
    }
}
