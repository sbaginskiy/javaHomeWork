package coolList;

import java.util.Iterator;

public class MyCoolList<T> implements Iterable{

    T[] value = new Object[2];

    public void add(Object object){
          T[] value1 = new T[value.length + 1];
          for (int i = 0; i < value1.length;) {

          value1[i] = value[i];

    }
        value1[value.length] = object;
          value = value1;
   }
    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                for (int i = 0; i < value.length; i++) {
                    return value[i];
                }
            }

            @Override
            public T[] next() {
                for (int i = 0; i < value.length; i++) {
                    return value[i];
                }
            }
        };
    }
}
