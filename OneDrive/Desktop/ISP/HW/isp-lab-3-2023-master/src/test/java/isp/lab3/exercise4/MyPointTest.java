package isp.lab3.exercise4;

import org.junit.Assert;
import org.junit.Test;

public class MyPointTest {

    @Test
    public void testDistance()
    {
        MyPoint point=new MyPoint(5,6,7);
        MyPoint point1=new MyPoint(8,9,10);
        Assert.assertEquals(5.196152422706632, point.distance(8,9,10),0.01);
        Assert.assertEquals(5.196152422706632, point.distance(point1), 0.01);
    }
}
