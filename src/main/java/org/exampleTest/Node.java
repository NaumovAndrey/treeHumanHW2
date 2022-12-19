package org.exampleTest;

/**
 * Возможная реализация
 */
public class Node {
    private int id;
    private Node node;

    public Node(int id) {
        setId(id);
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", node=" + node +
                '}';
    }
}

//        Node parent = new Node(25);
//        Node parentNext = new Node(47);
//        parent.setNode(new Node(26));
//        parent.setNode(parentNext);

//        System.out.println(node.getId());
//        parent.setId(15);
//        System.out.println(node.getId());
//        System.out.println(node.getNode());
//        //System.out.println(node.getNode().getId());
//        int myId = node.getId();
//        System.out.println(myId);
//        Node myNode = node.getNode();
//        System.out.println(myNode);


//        System.out.println(parent.getId());   // 25
//        System.out.println(parent.getNode().getId());   // 47


//        System.out.println(parent.getNode().getId());   // 47
//        System.out.println(parent.getId()); // 25
//        System.out.println(parent.getNode());
//        System.out.println(parentNext.getNode());

