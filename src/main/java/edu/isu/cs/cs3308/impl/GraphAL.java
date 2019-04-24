package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Graph;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphAL<V, E> implements Graph<V, E> {


    private LinkedList<Vertex<V>> vertices = new LinkedList<>();
    private LinkedList<Edge<E>> edges = new LinkedList<>();
    @Override
    public int numVertices() {
        return vertices.size();
    }

    @Override
    public Iterator<Vertex<V>> vertices() {
        return vertices.iterator();
    }

    @Override
    public int numEdges() {
        return edges.size();
    }

    @Override
    public Iterator<Edge<E>> edges() {
        return edges.iterator();
    }

    @Override
    public Edge<E> getEdge(V u, V v) {
        Vertex<V> start = (Vertex<V>) u;
        start.getOutgoing();
        return null;
    }

    @Override
    public Vertex<V>[] endVertices(Edge<E> e) {
        return new Vertex[0];
    }

    @Override
    public V opposite(Vertex<V> v, Edge<E> e) {
        return null;
    }

    @Override
    public int outDegree(Vertex<V> v) {
        return 0;
    }

    @Override
    public int inDegree(Vertex<V> v) {
        return 0;
    }

    @Override
    public Iterator<Edge<E>> outgoingEdges(Vertex<V> v) {
        Vertex<V> ver = v;
        return (Iterator<Edge<E>>) ver.getOutgoing();
    }

    @Override
    public Iterator<Edge<E>> incomingEdges(Vertex<V> v) {
        return (Iterator<Edge<E>>) v.getIncoming();
    }

    @Override
    public Vertex<V> insertVertex(V v) {
        return null;
    }

    @Override
    public void insertEdge(Vertex<V> u, Vertex<V> v, E e) {

    }

    @Override
    public V removeVertex(Vertex<V> v) {
        return null;
    }

    @Override
    public E removeEdge(Edge<E> e) {
        return null;
    }
}
