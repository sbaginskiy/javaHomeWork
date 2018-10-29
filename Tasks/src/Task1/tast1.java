package Task1;

public class tast1 {




//1
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
//4
    public double ten(double n, double m){
        double ten = 0;
        double n1=0;
        double m1=0;
        if (n==m){return n;}
        if (n>10){n1 = n-10;}else{n1 = 10-n;}
        if (m<10){m1 = 10-n;}else{m1 = n-10;}
        if (m1<n1){return m;}
        if (m1>n1){return n;}
        return 1;
    }
//5
    public int fff(int n){
        if(n<100 || n>999){return 0;}
        int fff[] = new int[10];
        for (int i = 0; i < 3;i++){

            fff[i] = n%10;
            n = n/10;

        }
        int max = fff[0];
        for (int i = 1; i<3; i++){
            if (max<fff[i]){
                max = fff[i];
            }
        }
        return max;
    }

}

