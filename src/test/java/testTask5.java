import Lab1.Task5;
import org.junit.Assert;
import org.junit.Test;

public class testTask5 {
    @Test
    public void zeroSec(){
        int[] A = {9,8,7,6,5};
        Assert.assertEquals(4, Task5.incsec(A));
    }
    @Test
    public void maxSec(){
        int[] A = {5,6,7,8,9};
        Assert.assertEquals(0, Task5.incsec(A));
    }
    @Test
    public void someSec(){
        int[] A = {9,5,8,6,7};
        Assert.assertEquals(2, Task5.incsec(A));
    }
}
