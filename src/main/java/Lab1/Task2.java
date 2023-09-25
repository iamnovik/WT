package Lab1;

import java.util.Scanner;

public class Task2 {
    public static boolean checking(int x ,int y){
        if (Math.abs(x) <= 6){
            if (Math.abs(x) <= 4){
                return y < 6 && y > -4;
            }else{
                return y < 1 && y > -4;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(checking(x,y));
    }
}
