import Task2.Fibonacci;
import Task2.Point;
import Task2.Triangle;
import Task2.task2;
import Task1.tast1;


public class Main {

    public static void main(String[] args){

task2 task2 = new task2();
        System.out.println(task2.fact(4));

        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i<5; i++){
            System.out.println("fibonacci "+ fibonacci.next());
        }


        tast1 tast1 = new tast1();
        System.out.println("zp"+ tast1.zp(4,61));


        Point x = new Point(1,5);
        Point y = new Point(4,0);
        Point z = new Point(3,-4);

        Triangle triangle = new Triangle(x,y,z);

        triangle.CountPerimeter(triangle.CountEdgeLength(x,y),triangle.CountEdgeLength(x,z),triangle.CountEdgeLength(y,z));



    }
}
