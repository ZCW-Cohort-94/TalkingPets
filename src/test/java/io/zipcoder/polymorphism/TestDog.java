package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void testConstructor(){
        Dog dog = new Dog(givenName);
        String name = "Jake";
        dog.setName(name);
        Assert.assertEquals(name, dog.getName);
    }
    @Test
    public void testSpeak(){
        Dog dog = new Dog();
        String speakExpected = "Woof!";
        String speakActual = dog.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Dog dog = new Dog();
        this.name = dog.getname("James");

        Assert.assertEquals("Max", getName);
    }
    public void testGetName(){
        String givenName = "Bob";
        Dog dog = new Dog(givenName);
        Assert.assertEquals(givenName, dog.getName());
    }
}
