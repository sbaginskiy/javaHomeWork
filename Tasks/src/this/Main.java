package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // first task
        Subscriber subscriber1 = new Subscriber(45);
        Subscriber subscriber2 = new Subscriber(10);
        Subscriber subscriber3 = new Subscriber(33);
        Subscriber subscriber4 = new Subscriber(10);

        /*List<Subscriber> list1 = new ArrayList<>();

        list1.add(subscriber1);
        list1.add(subscriber2);

        List<Subscriber> list2 = new ArrayList<>();

        list2.add(subscriber3);
        list2.add(subscriber4);

        subscriber1.symmetricDifference(list1,list2);*/

        Block block1 = new Block(1,7);
        Block block2 = new Block(8,20);
        Block block3 = new Block(10,40);


        List<Subscriber> sub = new ArrayList<>();

        sub.add(subscriber1);
        sub.add(subscriber2);
        sub.add(subscriber3);
        sub.add(subscriber4);

        List<Block> block = new ArrayList<>();

        block.add(block1);
        block.add(block2);
        block.add(block3);

        List<Integer> delete = new ArrayList<>();
        delete.add(5);
        delete.add(11);
        delete.add(16);
        delete.add(33);

        block1.metod(sub,block,delete);

    }
}
