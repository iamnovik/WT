package Lab1;

import java.util.Scanner;

public class Task1 {

    public static double div(double x, double y){
        double temp =  (x + y);
        return 1 + Math.pow(Math.sin(temp),2);
    }
    public static double den(double x, double y){
        double temp = 1 + Math.pow(x*y,2);
        temp = 2 * x / temp;
        temp = Math.abs(x - temp);
        return 2 + temp;
    }
    public static double func (double x, double y){
        double res;
        res = div(x, y) / den(x, y) + x;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(func(x,y));

    }
}
