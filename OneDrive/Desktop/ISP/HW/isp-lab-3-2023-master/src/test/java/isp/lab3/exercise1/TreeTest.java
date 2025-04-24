package isp.lab3.exercise1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class TreeTest {

    @Test
    public void testGrow() {
        Tree tree = new Tree();
        Assert.assertEquals(15, tree.grow(-1));
        Assert.assertEquals(15, tree.grow(0));
        Assert.assertEquals(16, tree.grow(1));
        Assert.assertEquals(20, tree.grow(4));
    }

    @Test
    public void testToString(){
        Tree tree= new Tree();
        tree.grow(-1);
        Assert.assertEquals("Tree{height=15}",tree.toString());
        tree.grow(0);
        Assert.assertEquals("Tree{height=15}",tree.toString());
        tree.grow(1);
        Assert.assertEquals("Tree{height=16}",tree.toString());
        tree.grow(4);
        Assert.assertEquals("Tree{height=20}",tree.toString());
    }
}
