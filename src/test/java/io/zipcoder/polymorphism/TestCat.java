package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void testConstructor(){
        Cat cat = new Cat(givenName);
        String name = "Jake";
        cat.setName(name);
        Assert.assertEquals(name, cat.getName);
    }
    @Test
    public void testSpeak(){
        Cat cat = new Cat();
        String speakExpected = "Meow!";
        String speakActual = cat.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Cat cat = new Cat();
        this.name = cat.getname("James");

        Assert.assertEquals("Max", getName);
    }
    public void testGetName(){
        String givenName = "Bob";
        Cat cat = new Cat(givenName);
        Assert.assertEquals(givenName, cat.getName());
    }
}
