package io.zipcoder.polymorphism;

public class Dog extends Pet{

    private String name;
    Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
