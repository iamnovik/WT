package Lab1;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static double[] sort(double[] arr){
        int n = arr.length - 1;
        for(int i = 0; i < n; i++){
            if (arr[i] > arr[i + 1]){
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if(i != 0){
                    i -= 2;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int N = 5;
        double[] arr = new double[N];
        for(int i = 0; i < N; i++){
            arr[i] = new Random().nextDouble();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(sort(arr)));
    }
}
