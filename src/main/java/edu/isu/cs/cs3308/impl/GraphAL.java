package edu.isu.cs.cs3308.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Graph;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.Iterator;

public class GraphAL<V, E> implements Graph<V, E> {
    @Override
    public int numVertices() {
        return 0;
    }

    @Override
    public Iterator<Vertex<V>> vertices() {
        return null;
    }

    @Override
    public int numEdges() {
        return 0;
    }

    @Override
    public Iterator<Edge<E>> edges() {
        return null;
    }

    @Override
    public Edge<E> getEdge(V u, V v) {
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
        return null;
    }

    @Override
    public Iterator<Edge<E>> incomingEdges(Vertex<V> v) {
        return null;
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
