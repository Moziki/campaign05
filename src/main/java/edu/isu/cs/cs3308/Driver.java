package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.impl.EdgeAL;
import edu.isu.cs.cs3308.impl.GraphAL;
import edu.isu.cs.cs3308.impl.VertexAL;
import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.LinkedList;


public class Driver {
    public static void main(String[] args) {
        GraphAL<Vertex, Edge> myGraph = new GraphAL<>();
        char mine = 'a';
        for (int i = 0; i < 20; i++) {

            Vertex vert = new VertexAL<>(i);
            Vertex vert2 = new VertexAL<>(mine);
            EdgeAL edge = new EdgeAL<>(vert, vert2, i);
            mine += 1;
        }
        LinkedList<Vertex> test = myGraph.vertices();
        for (int i = 0; i < myGraph.numVertices(); i++)
            System.out.println(myGraph.vertices().)
        }
    }
}
