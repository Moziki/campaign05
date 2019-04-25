package edu.isu.cs.cs3308.structures;

/**
 * Interface defining the basic operations for a type representing an edge in a graph.
 */
public interface Edge<V, E> {

    /**
     * Returns the element associated with the edge
     */
    E getElement();

    V getStart();
    V getEnd();

    /**
     * Returns an array of the two endpoints of the edge.
     */
    <V> Vertex<V>[] getEndpoints();
}
