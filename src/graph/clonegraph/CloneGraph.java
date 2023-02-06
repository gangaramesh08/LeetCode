package graph.clonegraph;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List<Node> n1 = List.of(node2,node4);
        List<Node> n2 = List.of(node1,node3);
        List<Node> n3 = List.of(node2,node4);
        List<Node> n4 = List.of(node1,node3);
        node1.setNeighbors(n1);
        node2.setNeighbors(n2);
        node3.setNeighbors(n3);
        node4.setNeighbors(n4);
        Node head = cloneGraph(node1);

    }


    public static Node cloneGraph( Node node) {
        Set<Node> visited = new HashSet<>();
        Node headNode = new Node();
        StringBuffer sbf = new StringBuffer();
        sbf.append("[");
        cloneG(sbf, headNode, node, visited);
        sbf.replace(sbf.length()-1, sbf.length(), "");
        sbf.append("]");
        System.out.println(sbf.toString());
        return headNode;
    }

    private static Node cloneG(StringBuffer sbf, Node headNode, Node node, Set<Node> visited) {
        if(!visited.contains(node)){

            Node newNode = new Node(node.val, node.neighbors);
            if(visited.isEmpty()){
                headNode = newNode;
            }
            visited.add(node);
            for (Node n : node.neighbors) {
                cloneG(sbf,headNode, n, visited);
            }
            sbf.append("[");
            for(Node n: node.neighbors) {
                sbf.append(n.val+",");
            }
            sbf.replace(sbf.length()-1, sbf.length(), "");
            sbf.append("],");
        }
        return headNode;
    }
}

