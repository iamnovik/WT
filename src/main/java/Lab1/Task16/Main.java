package Lab1.Task16;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("A",5, "GTR"),new Book("A",4,"GTR"),new Book("C",5,"QWW"),new Book("A",6,"ATRE"),new Book("E",2,"WASD")};

        Arrays.sort(books,Book.titleComparator);
        System.out.println(Arrays.toString(books));
        System.out.println();
        Arrays.sort(books,Book.titleComparator.thenComparing(Book.authorComparator));
        System.out.println(Arrays.toString(books));
        System.out.println();
        Arrays.sort(books,Book.titleComparator.thenComparing(Book.authorComparator).thenComparing(Book.priceComparator));
        System.out.println(Arrays.toString(books));

    }
}
