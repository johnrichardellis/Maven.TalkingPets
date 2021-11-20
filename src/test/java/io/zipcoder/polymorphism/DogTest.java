package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import pets.Dog;
import pets.Mouse;
import pets.Pet;

public class DogTest {

    @Test
    public void testInstanceOfDog() {
        Dog dog = new Dog("Rex");
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void testGetNameOfDog() {
        Dog dog = new Dog("Rex");
        String actual = dog.getName();

        Assert.assertEquals("Rex", actual);
    }

    @Test
    public void testSetDogName() {
        Dog dog = new Dog("Rex");
        dog.setName("Lance");
        String actual = dog.getName();

        Assert.assertEquals("Lance", actual);
    }

    @Test
    public void testDogSpeak() {
        Dog dog = new Dog("Rex");
        String actual = dog.speak();

        Assert.assertEquals("bark", actual);
    }
}
