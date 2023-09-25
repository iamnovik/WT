import Lab1.Task2;
import org.junit.Assert;
import org.junit.Test;

public class testTask2 {
    @Test
    public void insideFigure(){
        int x = 0;
        int y = 0;
        Assert.assertTrue(Task2.checking(x,y));
    }
    @Test
    public void outsideFigure(){
        int x = 10;
        int y = 5;
        Assert.assertFalse(Task2.checking(x,y));
    }
    @Test
    public void boundFigure(){
        int x = 6;
        int y = 0;
        Assert.assertTrue(Task2.checking(x,y));
    }
}
