package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplicationTest {
    @Test
    public void testArrayListName(){
        Dog dog = new Dog ("Fido");
        Bird bird = new Bird("Birdie");
        Cat cat = new Cat("Cato");
        ArrayList<Pet> pets = new ArrayList<Pet>(Arrays.asList(dog, bird, cat));
        String[] names = {"Fido", "Birdie", "Cato"};

        Assert.assertEquals(speak, MainApplication.getUserPetNames(pets));
    }
    @Test
    public void testArrayListSpeak(){
        Dog dog = new Dog ("Fido");
        Bird bird = new Bird("Birdie");
        Cat cat = new Cat("Cato");
        ArrayList<Pet> pets = new ArrayList<Pet>(Arrays.asList(dog, bird, cat));
        String[] speak = {"Woof!", "Squawk!", "Meow!"};

        Assert.assertEquals(name, MainApplication.getUserPetSpeak(pets));
    }
}
