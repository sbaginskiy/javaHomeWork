package treeAndNode;

import java.util.function.Consumer;

public class Node {

    private Node left;
    private Node right;
    private double data;

    public Node(Node left, Node right, double data){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public double getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void rec(Node node, Consumer consumer){

       if (node.getLeft() != null){
           consumer.accept(node.getLeft().getData());
           rec(node.getLeft(), consumer);
       }

       if (node.getRight() != null){
           consumer.accept(node.getRight().getData());
           rec(node.getRight(), consumer);
       }

    }

}
