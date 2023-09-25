import Lab1.Task15.Book;
import org.junit.Assert;
import org.junit.Test;

public class testTask15 {
    @Test
    public void test1(){
        Book[] books = {new Book("a",5, "a",5),new Book("str",2,"b",5),new Book("fraud",9,"c",5),new Book("qport",4,"c",5)};
        Lab1.Task15.Main.sort(books);
        Book[] booksSorted = {new Book("str",2,"b",5), new Book("qport",4,"c",5),new Book("a",5,"a",5), new Book("fraud",9,"c",5)};
        Assert.assertArrayEquals(booksSorted,books);
    }
    @Test
    public void test2(){
        Book[] books = {new Book("a",5, "a",5),new Book("str",5,"b",5),new Book("fraud",5,"c",5),new Book("qport",5,"c",5)};
        Lab1.Task15.Main.sort(books);
        Book[] booksSorted = {new Book("a",5,"a",5), new Book("str",5,"b",5),new Book("fraud",5,"c",5), new Book("qport",5,"c",5)};
        Assert.assertArrayEquals(booksSorted,books);
    }
    @Test
    public void test3(){
        Book[] books = {new Book("PR",1, "PR",5),new Book("PR",4,"PR",5),new Book("PR",3,"PR",5),new Book("PR",2,"PR",5)};
        Lab1.Task15.Main.sort(books);
        Book[] booksSorted = {new Book("PR",1,"PR",5), new Book("PR",2,"PR",5),new Book("PR",3,"PR",5), new Book("PR",4,"PR",5)};
        Assert.assertArrayEquals(booksSorted,books);
    }
}
