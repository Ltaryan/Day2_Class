package com.masai.entity;

import java.util.SortedMap;

public class Parrot extends Bird implements Flyable{


    public Parrot() {
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void roam() {

    }

    @Override
    public void fly() {
        System.out.println(getName()+"is Flying");
    }






}
