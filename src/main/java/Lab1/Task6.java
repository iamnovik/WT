package Lab1;

import java.util.Random;

public class Task6 {
    public static double[][] buildMatrix(double[] arr){
        int n = arr.length;
        double[][] res = new double[n][n];
        for(int i = 0; i < n; i++){
            int j = 0;
            for(int k = i; k < n; k++){
                res[i][j] = arr[k];
                j++;
            }
            for(int k = 0; k < i; k++){
                res[i][j] = arr[k];
                j++;
            }
        }
        return res;
    }
    public static void dispMatrix(double[][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%.3f",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        double[] arr = new double[N];
        for(int i = 0; i < N; i++){
            arr[i] = Math.round(new Random().nextDouble());
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        dispMatrix(buildMatrix(arr));
    }
}
