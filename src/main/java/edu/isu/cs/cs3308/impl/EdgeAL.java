package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

public class EdgeAL<V, E> implements Edge<V, E> {

    private E element;
    private V start;
    private V end;
    private Vertex[] endpoints;

    public EdgeAL(V u, V v, E elem) {
        element = elem;
        start = u;
        end = v;
    }

    @Override
    public E getElement() {
        return null;
    }

    @Override
    public V getStart() {
        return start;
    }

    @Override
    public V getEnd() {
        return end;
    }


    @Override
    public <V> Vertex<V>[] getEndpoints() {
        return new Vertex[0];
    }
}
