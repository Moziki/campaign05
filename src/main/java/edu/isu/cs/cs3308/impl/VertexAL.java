package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Dan Walker
 * @param <V>
 */
public class VertexAL<V> implements Vertex<V> {
    protected V element;
    public LinkedList outgoing, incoming;

    public VertexAL(V elem) {
        element = elem;
        incoming = new LinkedList<>();
        outgoing = new LinkedList<>();
    }



    @Override
    public V getElement() {
        return element;
    }

    @Override
    public <E> LinkedList<Edge<V, E>> getOutgoing() {
        return outgoing;
    }

    @Override
    public <E> List<Edge<V, E>> getIncoming() {
        return incoming;
    }

    public <E> void addOutgoing(Edge<V, E> e) { outgoing.add(e); }
    public <E> void addIncoming(Edge<V, E> e) {
        incoming.add(e);
    }
}
