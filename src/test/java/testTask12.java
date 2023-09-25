import Lab1.Task12;
import org.junit.Assert;
import org.junit.Test;

public class testTask12 {
    @Test
    public void testbook(){
        Task12 book = new Task12("a","b",5);
        Task12 copybook = book;
        Assert.assertEquals(book,copybook);
        Assert.assertEquals(18683922,book.hashCode());
        Assert.assertEquals("Title: a\nAuthor: b\nEdition: 5 price: 5",book.toString());
    }
    @Test
    public void testbook2(){
        Task12 book = new Task12("Harry Potter","J.K.Rowling",120);
        Task12 copybook = book;
        Assert.assertEquals(book,copybook);
        Assert.assertEquals(1112519259,book.hashCode());
        Assert.assertEquals("Title: Harry Potter\nAuthor: J.K.Rowling\nEdition: 5 price: 120",book.toString());
    }
    @Test
    public void testNotEquals(){
        Task12 book = new Task12("Harry Potter","J.K.Rowling",120);
        Task12 book2 = new Task12("Harry Potter","V.D.Novik",120);
        Assert.assertNotEquals(book,book2);
        Assert.assertEquals(1112519259,book.hashCode());
        Assert.assertEquals("Title: Harry Potter\nAuthor: J.K.Rowling\nEdition: 5 price: 120",book.toString());
    }
}
