package ac.tellu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class AdjacencyList {
    HashMap<String, LinkedList<String>> graph = new HashMap<String, LinkedList<String>>();

    AdjacencyList(String... vertices) {
        for (String vertex : vertices) {
            this.graph.put(vertex, new LinkedList<String>());
        }
    }

    public void addEdge(String src, String... dst) {
        this.graph.put(src, new LinkedList<String>(Arrays.asList(dst)));
    }

    public void printGraph() {
        for (String vertex : this.graph.keySet()) {
            LinkedList<String> dests = this.graph.get(vertex);

            System.out.print("Vertex: " + vertex + ": ");
            if (dests.size() < 1) {
                System.out.println("KOSONG");
                continue;
            }

            for (int i = 0; i < dests.size() - 1; i++) {
                System.out.print(dests.get(i) + " --> ");

            }
            System.out.print(dests.get(dests.size() - 1));
            System.out.println();
        }
    }
}
