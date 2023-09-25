import Lab1.Task6;
import org.junit.Assert;
import org.junit.Test;

public class testTask6 {
    @Test
    public void oneelemMatrix(){
        double[] A = {1.0};
        double[][] B = {{1.0}};
        Assert.assertArrayEquals(B, Task6.buildMatrix(A));
    }
    @Test
    public void sometestMatrix(){
        double[] A = {1.0, 1.5, 0.7};
        double[][] B = {{1.0,1.5,0.7},{1.5,0.7,1.0},{0.7,1.0,1.5}};
        Assert.assertArrayEquals(B, Task6.buildMatrix(A));
    }
}
