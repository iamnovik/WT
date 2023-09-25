package Lab1;

import java.util.Random;

public class Task5 {
    public static int incsec(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int maxincsec = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxincsec = Math.max(maxincsec, dp[i]);
        }
        return n - maxincsec;
    }
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = new Random().nextInt(0,100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" +incsec(arr));
    }
}
