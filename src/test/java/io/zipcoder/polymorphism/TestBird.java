package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestBird {
    @Test
    public void testConstructor(){
        Bird bird = new Bird(givenName);
        String name = "Jake";
        bird.setName(name);
        Assert.assertEquals(name, bird.getName);
    }
    @Test
    public void testSpeak(){
        Bird bird = new Bird();
        String speakExpected = "Squawk!";
        String speakActual = bird.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Bird bird = new Bird();
        this.name = bird.getname("James");

        Assert.assertEquals("Max", getName);
    }
    public void testGetName(){
        String givenName = "Bob";
        Bird bird = new Bird(givenName);
        Assert.assertEquals(givenName, bird.getName());
    }
}
