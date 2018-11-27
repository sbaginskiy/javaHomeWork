package treeAndNode;

import java.util.function.Consumer;

public class Tree {

    Node root;

    public void traverse(Consumer consumer){
        root.rec(root, consumer);
        consumer.accept(root.getData());
    }


}
