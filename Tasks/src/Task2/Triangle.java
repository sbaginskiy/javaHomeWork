
package Task2;
public class Triangle {

    final Point  z;
    final Point  x;
    final Point  y;


    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double CountEdgeLength(Point a, Point b){
        return Math.sqrt(( a.x - b.x )*( a.x - b.x )+( a.y - b.y )*( a.y - b.y ));
    }

    public double CountPerimeter(double first, double second, double third){
        return first + second + third;
    }

    public double CountSquare(double perimeter, double first, double second, double third){

        return Math.sqrt(perimeter*(perimeter-first)*(perimeter-second)*(perimeter-third));
    }
//    public Point Moving(Point newPoint, Point a, Point b, Point c){
//double mas[] = new double[2];
//        int i = 0;
//        if (a.x<0){
//            mas[i] = a.y;
//            i++;
//        }else { mas[i]=0; }
//        if (b.x<0){
//            mas[i] = b.y;
//            i++;
//        }else { mas[i]=0; }
//        if (c.x<0){
//            mas[i] = c.y;
//            i++;
//        }else { mas[i]=0; }
//
//        double min = mas[0];
//        for (int j = 0; j <= i)
//        return null;
//
//    }



}
