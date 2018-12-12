package collections;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    int number;

    public Subscriber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Integer){
            Integer someNumber = (Integer) o;
            return this.number == someNumber;
        }
        final Subscriber other = (Subscriber) o;
        return this.number == other.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "number=" + number +
                '}';
    }

    public List<Subscriber> intersection(List list1, List list2) {
        list1.retainAll(list2);
        System.out.println(list1);
        return list1;
    }

    public List<Subscriber> union(List list1, List list2) {

        list1.addAll(list2);
        System.out.println(list1);
        return list1;
    }

    public List<Subscriber> differemce(List list1, List list2){

        list1.removeAll(list2);
        System.out.println(list1);
        return list1;

    }
    public List<Subscriber> symmetricDifference(List list1, List list2) {

        List<Subscriber> list = new ArrayList<>();
        list.addAll(list1);
        list1.retainAll(list2);
        list.addAll(list2);
        list.removeAll(list1);
        System.out.println(list);
        return list;
    }

}
