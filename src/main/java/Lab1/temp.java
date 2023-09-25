package Lab1;

import java.util.Scanner;

public class temp {
    public static class book{
        int a = 100;
        int b = 100;
        String ab = "abcde";
        int c = 100;
        int d = 100;
        String ac = "abcde";
        int tdsa = 1000000000;

        int tdsb = 1000000000;

        int tdsc = 1000000000;

        int tdsd = 1000000000;
        public book(){

        }
    }

    public static void main(String[] args) {
        book t = new book();
        System.out.println(t.hashCode());
    }
}
