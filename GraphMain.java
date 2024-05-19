package Tugas12;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        System.out.println("Latihan 5");
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,4);

        graph.adjacencyMatrix();
        System.out.println();
        
        
        System.out.println("Latihan 6");

        graph = new Graph(4);
        graph.addVertex('A'); 
        graph.addVertex('B'); 
        graph.addVertex('C'); 
        graph.addVertex('D'); 

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);

        graph.adjacencyMatrix();
    }
}