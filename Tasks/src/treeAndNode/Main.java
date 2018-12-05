package treeAndNode;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        Node<?> root = new Node(null,null,0);
        Node<?> finalLevels = new Node(new Node(new Node(null,null,5),null,4),new Node(null,null,4.1),3);
        root.setLeft(new Node(new Node(finalLevels,null,2),new Node(null,null,2.1),1));




        tree.root = root;

        tree.traverse(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

    }

}
