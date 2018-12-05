package treeAndNode;

import java.util.function.Consumer;

public class Node<T> {

    private Node left;
    private Node right;
    private T data; //double

    public Node(Node left, Node right, T data){
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

    public T getData() {
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
