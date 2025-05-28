package org.example;
import java.util.List;
class GraphTest {
    @Test
    void shortestPath() {
        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(1, 5);
        g.addEdge(5, 4);
        g.addEdge(4, 6);
        g.addEdge(5, 6);
        List<Integer> expectedPathTo4 = List.of(1, 5, 4);
        List<Integer> expectedPathTo6 = List.of(1, 5, 6);
        assertEquals(expectedPathTo4, g.shortestPath(1, 4));
        assertEquals(expectedPathTo6, g.shortestPath(1, 6));
        assertNull(g.shortestPath(1, 7));
    }
}