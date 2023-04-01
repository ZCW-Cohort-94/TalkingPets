package io.zipcoder.polymorphism;

public class Pet implements Animal{

    Pet(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String speak() {
        return "noise!";
    }
}
