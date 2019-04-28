package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.impl.EdgeAL;
import edu.isu.cs.cs3308.impl.GraphAL;
import edu.isu.cs.cs3308.impl.VertexAL;
import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author Dan Walker
 * Campaign05
 *
 */
public class Driver {
    public static void main(String[] args) {
        GraphAL<Vertex, Edge> myGraph = new GraphAL<>();
        char mine = 'a';
        for (int i = 0; i < 20; i++) {

            Vertex vert = new VertexAL<>(i);
            Vertex vert2 = new VertexAL<>(mine);
            EdgeAL edge = new EdgeAL<>(vert, vert2, i);
            myGraph.insertVertex(vert);
            myGraph.insertVertex(vert2);
            myGraph.insertEdge(vert, vert2, edge);
            mine += 1;
        }
        for (Iterator<Vertex<Vertex>> it = myGraph.vertices(); it.hasNext(); ) {
            Vertex e = it.next();

            System.out.println();
        }
    }
}

