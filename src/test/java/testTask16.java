import Lab1.Task16.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testTask16 {
    @Test
    public void test1(){
        Book[] books = {new Book("A",5, "GTR"),new Book("A",4,"GTR"),new Book("C",5,"QWW"),new Book("A",6,"ATRE"),new Book("E",2,"WASD")};
        Book[] booksTitSorted = {new Book("A",5,"GTR"),new Book("A",4,"GTR"), new Book("A",6,"ATRE"), new Book("C",5,"QWW"), new Book("E",2,"WASD")};
        Arrays.sort(books,Book.titleComparator);
        Assert.assertArrayEquals(books,booksTitSorted);
        Book[] booksTitAutSorted = {new Book("A",6,"ATRE"), new Book("A",5,"GTR"),new Book("A",4,"GTR"), new Book("C",5,"QWW"),new Book("E",2,"WASD")};
        Arrays.sort(books,Book.titleComparator.thenComparing(Book.authorComparator));
        Assert.assertArrayEquals(booksTitAutSorted,books);
        Book[] booksTitAutPrSorted = {new Book("A",6,"ATRE"), new Book("A",4,"GTR"), new Book("A",5,"GTR"),new Book("C",5,"QWW"),new Book("E",2,"WASD")};
        Arrays.sort(books,Book.titleComparator.thenComparing(Book.authorComparator).thenComparing(Book.priceComparator));
        Assert.assertArrayEquals(booksTitAutPrSorted,books);
    }
}
