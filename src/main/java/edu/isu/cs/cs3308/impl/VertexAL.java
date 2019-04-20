package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.List;

public class VertexAL<V> implements Vertex<V> {
    @Override
    public V getElement() {
        return null;
    }

    @Override
    public <E> List<Edge<E>> getOutgoing() {
        return null;
    }

    @Override
    public <E> List<Edge<E>> getIncoming() {
        return null;
    }
}
