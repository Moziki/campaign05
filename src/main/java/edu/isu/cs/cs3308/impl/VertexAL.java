package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.LinkedList;
import java.util.List;

public class VertexAL<V> implements Vertex<V> {
    protected V element;
    public LinkedList<Edge<E>> outgoing, incoming = new LinkedList<>();

    public VertexAL(V elem) {
        element = elem;
    }
    @Override
    public V getElement() {
        return element;
    }

    @Override
    public <E> LinkedList<Edge<E>> getOutgoing() {
        return outgoing;
    }

    @Override
    public <E> List<Edge<E>> getIncoming() {
        LinkedList<Edge<E>> mlist = new LinkedList<>();
        incoming.forEach((k, v) -> mlist.add(v));
        return mlist;
    }
}
