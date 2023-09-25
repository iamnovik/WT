import Lab1.Task1;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testTask1 {
    @Test
    public void positiveValue() {

        double x = 3.5;
        double y = 2.5;

        double expected = 3.7;

        double actual = Task1.func(x,y);

        double epsilon = 0.1;
        Assert.assertEquals(expected, actual, epsilon);
    }
    @Test
    public void zeroValue() {

        double x = 0;
        double y = 0;

        double expected = 0.5;

        double actual = Task1.func(x,y);

        double epsilon = 0.1;
        Assert.assertEquals(expected, actual, epsilon);
    }
    @Test
    public void negativeValue() {

        double x = -3.5;
        double y = -2.5;

        double expected = -3.3;

        double actual = Task1.func(x,y);

        double epsilon = 0.1;
        Assert.assertEquals(expected, actual, epsilon);
    }


}
