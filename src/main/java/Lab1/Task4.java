package Lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static boolean isPrimeNumber(int n)
    {
        var result = true;

        if (n > 1)
        {
            for (var i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    result = false;
                    break;
                }
            }
        }
        else
        {
            result = false;
        }

        return result;
    }
    public static ArrayList<Integer> checkArray(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(isPrimeNumber(arr[i])){
                res.add(i);
            }
        }
        return res;
    }
    public static void displayTable(ArrayList<Integer> arr){
        for(int item : arr){
            System.out.print(item+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = new Random().nextInt(0,15);
            System.out.println(arr[i] + " ");
        }
        displayTable(checkArray(arr));
    }
}
