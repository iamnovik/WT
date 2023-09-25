package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static class data{
        double a;
        double res;
        public data(double a, double res){
            this.a = a;
            this.res = res;
        }
    }
    public static ArrayList<data> create_table(double a, double b, double h){
        ArrayList<data> arr = new ArrayList<>();
        while (!(a > b)){
            data temp = new data(a,Math.tan(a));
            temp.a = a;
            temp.res = Math.tan(a);
            arr.add(temp);
            a += h;
        }
        return arr;
    }
    public static void display_table(ArrayList<data> list){
        for(data item : list){
            System.out.print(item.a + " " + item.res+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        ArrayList<data> table = create_table(a,b,h);
        display_table(table);
    }
}
