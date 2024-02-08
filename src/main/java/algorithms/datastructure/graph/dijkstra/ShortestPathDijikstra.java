package algorithms.datastructure.graph.dijkstra;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortestPathDijikstra {

    public void shortestPath(Node node){
        node.setDistance(0);
        Set<Node> visitedNodes = new HashSet<>();
        Queue<Node> unvisitedNodes = new PriorityQueue<>(Collections.singleton(node));
        while(!unvisitedNodes.isEmpty()){
            Node currentNode = unvisitedNodes.poll();
            currentNode.getAdjacentNodes().entrySet().stream()
                    .filter(entry -> !visitedNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unvisitedNodes.add(entry.getKey());

                    });
            visitedNodes.add(currentNode);
        }
    }

    public void evaluateDistanceAndPath(Node adjacentNode, int weight, Node currentNode){
       Integer newDistance  = currentNode.getDistance() + weight;
       if(newDistance < adjacentNode.getDistance() ){
           adjacentNode.setDistance(newDistance);
           adjacentNode.setShortestPath(
                   Stream.concat(currentNode.getShortestPath().stream(), Stream.of(currentNode)).collect(Collectors.toList()));
       }
    }

    public void printPaths(List<Node> nodes){
        nodes.stream().forEach(node -> {
            String path = node.getShortestPath().stream().map(Node::getName).collect(Collectors.joining("->"));
           // System.out.println("path "+path);
         System.out.println(path.isEmpty() ?
                 String.format("%s : %s", node.getName(), node.getDistance())
                 :String.format("%s -> %s : %s", path, node.getName(), node.getDistance())
            );
        });
    }

    public static void main(String[] args){
        ShortestPathDijikstra shortestPathDijikstra = new ShortestPathDijikstra();
       Node nodeA = new Node("A");
       Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addAdjacentNodes(nodeB, 2);
        nodeA.addAdjacentNodes(nodeC, 4);

        nodeB.addAdjacentNodes(nodeC,3);
        nodeB.addAdjacentNodes(nodeD,1);
        nodeB.addAdjacentNodes(nodeE,5);

        nodeC.addAdjacentNodes(nodeD,2);

        nodeD.addAdjacentNodes(nodeE,1);
        nodeD.addAdjacentNodes(nodeF,4);

        nodeE.addAdjacentNodes(nodeF,2);

        shortestPathDijikstra.shortestPath(nodeA);
        shortestPathDijikstra.printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));




    }




}
