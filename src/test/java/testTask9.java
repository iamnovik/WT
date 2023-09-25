import Lab1.Task9.Ball;
import Lab1.Task9.Bucket;
import org.junit.Assert;
import org.junit.Test;
import java.awt.*;

public class testTask9 {
    @Test
    public void zeroBlue(){
        Ball[] balls = {new Ball(1, Color.RED), new Ball(2,Color.GRAY), new Ball(3,Color.BLACK), new Ball(1,Color.WHITE)};
        Bucket bucket = new Bucket();
        for (Ball ball: balls) {
            bucket.addBall(ball);
        }
        Assert.assertEquals(0,bucket.countBlue());
        Assert.assertEquals(7,bucket.getWeight_bucket());
    }
    @Test
    public void zeroBalls(){
        Bucket bucket = new Bucket();
        Assert.assertEquals(0,bucket.countBlue());
        Assert.assertEquals(0,bucket.getWeight_bucket());
    }
    @Test
    public void testBalls(){
        Ball[] balls = {new Ball(4, Color.BLUE), new Ball(2,Color.BLUE), new Ball(3,Color.BLACK), new Ball(1,Color.WHITE)};
        Bucket bucket = new Bucket();
        for (Ball ball: balls) {
            bucket.addBall(ball);
        }
        Assert.assertEquals(2,bucket.countBlue());
        Assert.assertEquals(10,bucket.getWeight_bucket());
    }
}
