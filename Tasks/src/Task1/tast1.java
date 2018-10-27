package Task1;

public class tast1 {
    public static void main(String[] args){


    tast1 tast1 = new tast1();
        System.out.println("zp человечка" + tast1.zp(20,60));

        tast1.equation(5,4,-2);


        System.out.println("сумма п" +  tast1.sum(521));

        System.out.println(323%10);


    }



// 1
    public double zp(double kyrc, double time){
        double zp = 0;
        if (time > 60){time = 60;}
        if (time > 40 && time <= 60){
            zp = 40*kyrc + (time - 40)*1.5*kyrc;
        }else {
            zp = time*kyrc;
        }
        return zp;
    }


//2
    public void equation(int a, int b, int c){

        double D = Math.sqrt(b*b - 4*a*c);
        if (D > 0) {
            double x1, x2;
            x1 = (-b - D) / (2 * a);
            x2 = (-b + D) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }else if (D == 0) {
            double x;
            x = (double) -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
//3
    public double sum(int n){
        if(n<100 || n>999){return 0;}
        double sum = 0;
        for (int i = 0; i < 3;i++){

            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}

