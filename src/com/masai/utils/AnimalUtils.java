package com.masai.utils;

import com.masai.entity.Animal;
import com.masai.entity.Cat;
import com.masai.entity.Dog;

public class AnimalUtils {
    public void addanimal(Animal animal){
        System.out.println("com.masai.entity.Animal added: "+animal.getName());
        animal.makeNoise();

        if(animal instanceof Cat){
            Cat c = (Cat) animal;
            c.jump();
        } else if (animal instanceof Dog) {
            Dog d=(Dog) animal;
            d.play();
        }
    }
}
