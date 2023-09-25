import org.junit.Assert;
import org.junit.Test;
import Lab1.Task14.*;
public class testTask14 {
    @Test
    public void test1Clone() throws CloneNotSupportedException {
        Book book = new Book("ABCD","ABC",5);
        Book copybook = (Book) book.clone();
        Assert.assertEquals(book,copybook);

    }
    @Test
    public void test2Clone() throws CloneNotSupportedException {
        Book book = new Book("","D",5);
        Book copybook = (Book) book.clone();
        Assert.assertEquals(book,copybook);

    }
    @Test
    public void test3Clone() throws CloneNotSupportedException {
        Book book = new Book("","",1);
        Book copybook = (Book) book.clone();
        Assert.assertEquals(book,copybook);

    }
}
