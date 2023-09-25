import Lab1.Task4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testTask4 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setOutContent(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void zeroPrimeNumbers(){
        int[] A = {4,6,8,9};
        Task4.displayTable(Task4.checkArray(A));
        Assert.assertEquals("",outContent.toString());
    }
    @Test
    public void allPrimeNumbers(){
        int[] A = {2,3,5,7};
        Task4.displayTable(Task4.checkArray(A));
        Assert.assertEquals("0 1 2 3 ",outContent.toString());
    }
    @Test
    public void somePrimeNumbers(){
        int[] A = {2,4,5,8};
        Task4.displayTable(Task4.checkArray(A));
        Assert.assertEquals("0 2 ",outContent.toString());
    }
}
