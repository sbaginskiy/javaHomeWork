package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Block {
    int first;
    int end;




    @Override
    public String toString() {
        return "Block{}";
    }



    public Block(int first, int end){
        this.first = first;
        this.end = end;
    }

    public void metod(List sub, List block, List delete){

          List saveSub = new ArrayList();
          saveSub.addAll(sub);
          List saveBlock = new ArrayList();
          saveSub.addAll(block);
          List saveDelete = new ArrayList();
          saveSub.addAll(delete);

        List delSubNumber = sub.stream().flatMap(Subscriber::getNumber)

          sub.removeAll(delete);





//          block.removeAll(delete);

        System.out.println(sub);
        System.out.println(delete);
//        System.out.println(block);
    }
}
