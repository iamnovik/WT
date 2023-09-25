import Lab1.Task3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class testTask3 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setOutContent(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void samePoints(){
        double a = 0;
        double b = 0;
        double h = 0.5;
        //ArrayList<Lab1.Task3.data> table = new ArrayList<>();
        //table.add(new Task3.data(2,0));
        Task3.display_table(Task3.create_table(a,b,h));
        Assert.assertEquals("0.0 0.0\n",outContent.toString());
    }
    @Test
    public void defaultPoints(){
        double a = 0;
        double b = 1;
        double h = 0.5;
        //ArrayList<Lab1.Task3.data> table = new ArrayList<>();
        //table.add(new Task3.data(2,0));
        Task3.display_table(Task3.create_table(a,b,h));
        Assert.assertEquals("0.0 "+Math.tan(a)+"\n"+"0.5 "+Math.tan(0.5)+"\n"+"1.0 "+Math.tan(1)+"\n",outContent.toString());
    }
}
