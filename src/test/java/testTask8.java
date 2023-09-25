import Lab1.Task8;
import org.junit.Assert;
import org.junit.Test;

public class testTask8 {
    @Test
    public void preSec(){
        double[] A = {0,1,2,3};
        double[] B = {4,5,6,7};
        int[] C = {0,0,0,0};
        Assert.assertArrayEquals(C, Task8.getPos(A,B));
    }
    @Test
    public void aboveSec(){
        double[] B = {0,1,2,3};
        double[] A = {4,5,6,7};
        int[] C = {4,4,4,4};
        Assert.assertArrayEquals(C, Task8.getPos(A,B));
    }
    @Test
    public void testSec(){
        double[] B = {0,3,4,8};
        double[] A = {1,2,6,7};
        int[] C = {1,1,3,3};
        Assert.assertArrayEquals(C, Task8.getPos(A,B));
    }
}
