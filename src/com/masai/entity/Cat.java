package com.masai.entity;

public class Cat extends Animal implements Swimable{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {

    }

    public Cat(){}

    public void jump(){
        System.out.println(getName()+" Jumping");
    }

    public void makeNoise(){
        System.out.println(getName()+" meau meau");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" Sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }


    @Override
    public void swim() {
        System.out.println(getName()+"is swimming");
    }
}
