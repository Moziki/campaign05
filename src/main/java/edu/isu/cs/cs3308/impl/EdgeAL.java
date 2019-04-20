package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

public class EdgeAL<E> implements Edge<E> {
    @Override
    public E getElement() {
        return null;
    }

    @Override
    public <V> Vertex<V>[] getEndpoints() {
        return new Vertex[0];
    }
}
