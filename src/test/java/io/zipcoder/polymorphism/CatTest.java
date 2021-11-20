package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import pets.Cat;
import pets.Mouse;
import pets.Pet;

public class CatTest {

    @Test
    public void testInstanceOfCat() {
        Cat cat = new Cat("Lala");
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void testGetNameOfCat() {
        Cat cat = new Cat("Lala");
        String actual = cat.getName();

        Assert.assertEquals("Lala", actual);
    }

    @Test
    public void testSetCatName() {
        Cat cat = new Cat("Lala");
        cat.setName("Hubba");
        String actual = cat.getName();

        Assert.assertEquals("Hubba", actual);
    }

    @Test
    public void testCatSpeak() {
        Cat cat = new Cat("Lala");
        String actual = cat.speak();

        Assert.assertEquals("meow", actual);
    }

}
