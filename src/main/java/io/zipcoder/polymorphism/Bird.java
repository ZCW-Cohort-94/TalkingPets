package io.zipcoder.polymorphism;

public class Bird extends Pet{
    Bird(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "Squawk!";
    }

}
