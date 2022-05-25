package ac.tellu;

public class Main {

    public static void main(String[] args) {
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        AdjacencyList graph = new AdjacencyList(vertices);

        graph.addEdge("A", new String[]{"B", "D", "E"});
        graph.addEdge("B", new String[]{"E"});
        graph.addEdge("C", new String[]{"B"});
        graph.addEdge("D", new String[]{"G"});
        graph.addEdge("E", new String[]{"F", "H"});
        graph.addEdge("F", new String[]{"C", "H"});
        graph.addEdge("G", new String[]{"H"});
        graph.addEdge("H", new String[]{"I"});
        graph.addEdge("I", new String[]{"F"});

        // print GRAPH BABY!!!
        graph.printGraph();
    }
}
