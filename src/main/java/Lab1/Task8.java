package Lab1;

import java.util.Arrays;

public class Task8 {
    public static int[] getPos(double[] from, double[] to){
        int n = from.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = binarySearch(to,from[i]);
        }
        return res;
    }
    static int binarySearch(double[] arr, double item){
        if (item <= arr[0]){
            return 0;
        }else if (item >= arr[arr.length - 1]){
            return arr.length;
        }
        int m = -1;
        int leftborder = 0;
        int rightborder = arr.length - 1;
        while (leftborder <= rightborder){
            m = (rightborder + leftborder) / 2;
            if (item >= arr[m] && item <= arr[m + 1]){
                return m + 1;
            }else if (item < arr[m]){
                rightborder = m ;
            }else {
                leftborder = m ;
            }
        }
        return m ;
    }
    public static void main(String[] args) {
        double[] B = {1,3,5,6};
        double[] A = {2,4,7,8};
        System.out.println(Arrays.toString(getPos(A,B)));
    }
}
