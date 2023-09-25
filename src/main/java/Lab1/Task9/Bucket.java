package Lab1.Task9;

import java.awt.*;
import java.util.ArrayList;

public class Bucket {
    private ArrayList<Ball> balls = new ArrayList<>();
    private int weight_bucket;
    public void addBall(Ball ball){
        if (ball != null){
            balls.add(ball);
            weight_bucket += ball.weight;
        }
    }
    public Bucket(){
        balls = new ArrayList<>();
    }
    public int countBlue(){
        int k = 0;
        for(Ball ball : balls){
            if (ball.color == Color.BLUE){
                k++;
            }
        }
        return k;
    }
    public int getWeight_bucket(){
        return weight_bucket;
    }
}
