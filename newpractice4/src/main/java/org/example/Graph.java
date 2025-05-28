package org.example;

import java.util.*;

public class Graph<V> {
    private Map<V, List<V>> adjacencyList = new HashMap<>();
    public boolean addVertex(V vertex) {
        if (adjacencyList.containsKey(vertex)) {
            return false;
        }
        adjacencyList.put(vertex, new ArrayList<>());
        return true;
    }
    public boolean addEdge(V v1, V v2) {
        addVertex(v1);
        addVertex(v2);
        if (!adjacencyList.get(v1).contains(v2)) {
            adjacencyList.get(v1).add(v2);
            return true;
        }
        return false;
    }
    public List<V> getAdjacents(V vertex) throws Exception {
        if (!adjacencyList.containsKey(vertex)) {
            throw new Exception("Vertex not found: " + vertex);
        }
        return adjacencyList.get(vertex);
    }

    public boolean containsVertex(V vertex) {
        return adjacencyList.containsKey(vertex);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (V vertex : adjacencyList.keySet()) {
            sb.append(vertex).append(" => ").append(adjacencyList.get(vertex)).append("\n");
        }
        return sb.toString();
    }
    public List<V> shortestPath(V start, V end) {
        if (!containsVertex(start) || !containsVertex(end)) {
            return null;
        }
        Map<V, V> prev = new HashMap<>();
        Set<V> visited = new HashSet<>();
        Queue<V> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        prev.put(start, null);
        while (!queue.isEmpty()) {
            V current = queue.poll();
            if (current.equals(end)) {
                break;
            }
            for (V neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    prev.put(neighbor, current);
                }
            }
        }
        if (!prev.containsKey(end)) {
            return null;
        }
        List<V> path = new LinkedList<>();
        for (V at = end; at != null; at = prev.get(at)) {
            path.add(0, at);
        }
        return path;
    }
}
