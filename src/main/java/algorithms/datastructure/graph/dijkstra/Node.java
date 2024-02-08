package algorithms.datastructure.graph.dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node implements  Comparable<Node>{
    private String name;
    private int distance = Integer.MAX_VALUE;

    private List<Node> shortestPath = new LinkedList<>();

    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addAdjacentNodes(Node node, int weight){
        adjacentNodes.put(node, weight);
    }

    public Node(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.distance, node.distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
}
