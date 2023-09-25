package Lab1.Task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.addBall(new Ball(5, Color.BLUE));
        bucket.addBall(new Ball(4, Color.RED));
        bucket.addBall(new Ball(3, Color.BLUE));
        bucket.addBall(new Ball(7, Color.GRAY));
        bucket.addBall(new Ball(5, Color.BLUE));
        System.out.println(bucket.countBlue());
        System.out.println(bucket.getWeight_bucket());
    }
}
