package ac.tellu;

public class Main {

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList("A", "B", "C", "D", "E", "F", "G", "H", "I");

        graph.addEdge("A", "B", "D", "E");
        graph.addEdge("B", "E");
        graph.addEdge("C", "B");
        graph.addEdge("D", "G");
        graph.addEdge("E", "F", "H");
        graph.addEdge("F", "C", "H");
        graph.addEdge("G", "H");
        graph.addEdge("H", "I");
        graph.addEdge("I", "F");

        // print GRAPH BABY!!!
        graph.printGraph();
    }
}
