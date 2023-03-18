package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
public class TestPet {

    @Test
    public void testConstructor(){
        Pet pet = new Pet(givenName);
        String name = "Jake";
        pet.setName(name);
        Assert.assertEquals(name, pet.getName);
    }
    @Test
    public void testSpeak(){
        Pet pet = new Pet();
        String speakExpected = "noise!";
        String speakActual = pet.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Pet pet = new Pet();
        this.name = pet.getname("James");

        Assert.assertEquals("James", getName);
    }
    public void testGetName(){
        String givenName = "Bob";
        Pet pet = new Pet(givenName);
        Assert.assertEquals(givenName, pet.getName());
    }
}
