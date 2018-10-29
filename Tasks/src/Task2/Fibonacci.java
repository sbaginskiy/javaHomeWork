package Task2;

public class Fibonacci {

    int count = 0;

    int next = 1;

    int i = 0;

    public int next(){

        i = count + next;
        count = next;
            next = i;

        return i;
    }

}
