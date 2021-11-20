package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import pets.Mouse;
import pets.Pet;

public class MouseTest {

    @Test
    public void testInstanceOfMouse() {
        Mouse mouse = new Mouse("Simon");
        Assert.assertTrue(mouse instanceof Pet);
    }

    @Test
    public void testGetNameOfMouse() {
        Mouse mouse = new Mouse("Simon");
        String actual = mouse.getName();

        Assert.assertEquals("Simon", actual);
    }

    @Test
    public void testSetMouseName() {
        Mouse mouse = new Mouse("Simon");
        mouse.setName("Larry");
        String actual = mouse.getName();

        Assert.assertEquals("Larry", actual);
    }

    @Test
    public void testMouseSpeak() {
        Mouse mouse = new Mouse("Simon");
        String actual = mouse.speak();

        Assert.assertEquals("squeek", actual);
    }
}
