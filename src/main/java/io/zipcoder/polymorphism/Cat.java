package io.zipcoder.polymorphism;

public class Cat extends Pet{

    Cat(String name){
        super(name);
    }

    private String name;
    public String speak(){
        return "Meow!";
    }
}
