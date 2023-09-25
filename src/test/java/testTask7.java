import Lab1.Task7;
import org.junit.Assert;
import org.junit.Test;

public class testTask7
{
    @Test
    public void sortedArray(){
        double[] A = {1,2,3,5,7,8,10};
        Assert.assertArrayEquals(A,Task7.sort(A),0.0);
    }
    @Test
    public void reverseArray(){
        double[] A = {10,8,7,5,3,2,1};
        double[] B = {1,2,3,5,7,8,10};
        Assert.assertArrayEquals(B,Task7.sort(A),0.0);
    }
    @Test
    public void sometestArray(){
        double[] A = {5,1,4,5,8,15};
        double[] B = {1,4,5,5,8,15};
        Assert.assertArrayEquals(B,Task7.sort(A),0.0);
    }
}
