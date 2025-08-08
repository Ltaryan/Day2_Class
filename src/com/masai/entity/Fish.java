package com.masai.entity;

public class Fish extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println(getName()+"Eating");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+"Make noise");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"bird is eating");
    }

    @Override
    public void roam() {
        System.out.println(getName()+"bird is roaming");
    }

    public Fish(String name) {
        super(name);
    }

    public Fish() {
    }

    @Override
    public void fly() {
        System.out.println(getName()+"is Flying");
    }
}
