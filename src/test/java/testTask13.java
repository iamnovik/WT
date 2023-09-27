import Lab1.Task12;
import Lab1.Task13;
import org.junit.Assert;
import org.junit.Test;

public class testTask13 {
    @Test
    public void testbook(){
        Task13 book = new Task13("a","b",5,"C#",3);
        Task13 copybook = book;
        Assert.assertEquals(book,copybook);
        Assert.assertEquals(775445333,book.hashCode());
        Assert.assertEquals("Programming boook \nTitle: a\nAuthor: b\nEdition: 5 price: 5\nLanguage: C# level: 3",book.toString());
    }
    @Test
    public void testbook2(){
        Task13 book = new Task13("Java from India","A.B.CDE",120,"Java",2);
        Task13 copybook = book;
        Assert.assertEquals(book,copybook);
        Assert.assertEquals(-1444829910,book.hashCode());
        Assert.assertEquals("Programming boook \nTitle: Java from India\nAuthor: A.B.CDE\nEdition: 5 price: 120\nLanguage: Java level: 2",book.toString());
    }
    @Test
    public void testNotEquals(){
        Task13 book = new Task13("Java","A.B.CDE",120,"Java",2);
        Task13 book2 = new Task13("C#","A.B.CDE",120,"C#",2);
        Assert.assertNotEquals(book,book2);
        Assert.assertEquals(-1359578489,book.hashCode());
        Assert.assertEquals("Programming boook \nTitle: Java\nAuthor: A.B.CDE\nEdition: 5 price: 120\nLanguage: Java level: 2",book.toString());
    }
}

