package coolList;

import java.util.Iterator;

public class MyCoolList implements Iterable{

    Object[] value = new Object[2];

    public void add(Object object){
          Object[] value1 = new Object[value.length + 1];
          for (int i = 0; i < value1.length;) {

          value1[i] = value[i];

          value1[value.length] = object;
    }
   }
    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                for (int i = 0; i < value.length; i++) {
                    return true;
                }
                return false;
            }

            @Override
            public Object[] next() {


                return null;
            }
        };
    }
}
