package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Graph;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author Dan Walker
 * @param <V>
 * @param <E>
 */
public class GraphAL<V, E> implements Graph<V, E> {


    private LinkedList<Vertex<V>> vertices = new LinkedList<>();
    private LinkedList<Edge<V, E>> edges = new LinkedList<>();
    @Override
    public int numVertices() {
        return vertices.size();
    }

    @Override
    public Iterator<Vertex<V>> vertices() { return vertices.iterator(); }


    @Override
    public int numEdges() {
        return edges.size();
    }

    @Override
    public Iterator<Edge<V, E>> edges() {
        return edges.iterator();
    }

    @Override
    public Edge<V, E> getEdge(Vertex<V> u, Vertex<V> v) {
        if (u == null || v == null) {
            return null;
        }
        if (vertices.contains(u)) {
            for (Edge<V, E> e : edges) {
                if (e.getStart() == u && e.getEnd() == v) {
                    return e;
                }
            }
        }
        return null;
    }

    @Override
    public Vertex<V>[] endVertices(Edge<V, E> e) {
         return new Vertex[]{(Vertex<V>) e.getStart(), (Vertex<V>) e.getEnd()};
    }

    @Override
    public Vertex<V> opposite(Vertex<V> v, Edge<V, E> e) {
        if (e.getStart() == v) {
            return (Vertex<V>) e.getEnd();
        }
        if (e.getEnd() == v) {
            return (Vertex<V>) e.getStart();
        }
        else return null;
    }

    @Override
    public int outDegree(Vertex<V> v) {
        return v.getOutgoing().size();
    }

    @Override
    public int inDegree(Vertex<V> v) {
        return v.getIncoming().size();
    }

    @Override
    public Iterator<Edge<V, E>> outgoingEdges(Vertex<V> v) {
        Vertex<V> ver = v;
        return (Iterator<Edge<V, E>>) ver.getOutgoing();
    }

    @Override
    public Iterator<Edge<V, E>> incomingEdges(Vertex<V> v) {
        return (Iterator<Edge<V, E>>) v.getIncoming();
    }

    @Override
    public Vertex<V> insertVertex(V v) {
        Vertex<V> newOne = new VertexAL<>(v);
        vertices.add(newOne);
        return newOne;
    }

    @Override
    public void insertEdge(V u, V v, E e) {
        Edge<V, E> newEdge = new EdgeAL<>(u, v, e);
        edges.add(newEdge);
        for (Vertex<V> vert : vertices) {

            if (vert.getElement() == u) {
                ((VertexAL<V>) vert).addOutgoing(newEdge);
            }
            if (vert.getElement() == v) {
                ((VertexAL<V>) vert).addIncoming(newEdge);
            }
        }
    }

    @Override
    public V removeVertex(Vertex<V> v) {
        vertices.remove(v);
        for (Edge e : v.getOutgoing()) {
            removeEdge(e);
        }
        for (Edge e : v.getIncoming()) {
            removeEdge(e);
        }
        V elem = v.getElement();
        return elem;
    }

    @Override
    public E removeEdge(Edge<V, E> e) {
        edges.remove(e);
        VertexAL<V> start = (VertexAL<V>)e.getStart();
        start.getOutgoing().remove(e);
        VertexAL<V> end = (VertexAL<V>)e.getEnd();
        end.getIncoming().remove(e);
        E elem = e.getElement();
        return elem;
    }
}
