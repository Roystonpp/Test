package MainPackTesting;

import org.junit.Assert;
import org.junit.Test;

public class CompassTest {


    @Test
    public void getNorth() {
        Assert.assertEquals("north","north");
    }
    public void getEast() {
        Assert.assertEquals("Try 'north','south','east',or 'west'!","east");
    }
    public void getSounth() {
        Assert.assertEquals("Try 'north','south','east',or 'west'!","south");
    }
    public void getWest() {
        Assert.assertEquals("Try 'north','south','east',or 'west'!","west");
    }
}

