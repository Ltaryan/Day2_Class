package com.masai.main;

import com.masai.entity.*;
import com.masai.utils.AnimalUtils;

import java.lang.management.MonitorInfo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import com.masai.entity.Employees;  // Import your class


import static com.masai.entity.Day.FRIDAY;
import static com.masai.entity.Day.MONDAY;
import static com.masai.entity.Role.ADMIN;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int sum(int... numbers){
        int total=0;
        for (int number : numbers) {
            total+=number;
        }
        return total;
    }

    public static void main(String[] args) {
//        com.masai.entity.Address obj3=new com.masai.entity.Address(" Mumbai "," Maha ",400021);
//        com.masai.entity.Address obj4=new com.masai.entity.Address(" Bokaro ","J harkhand ",827013);
//
//        com.masai.entity.Employee employee=new com.masai.entity.Employee(" Aryan ",22,obj3,279980,"GET ",62000);
//        com.masai.entity.Student student=new com.masai.entity.Student(" Akshat ",17,obj4,5,"90");
//
//        employee.displayInfo();
//        employee.applyForleave();
//        student.displayInfo();

//        int sum=0;
//        for (String arg : args) {
//            sum+= Integer.parseInt(arg);
//        }
////        System.out.println("sum: "+sum);
//        com.masai.entity.Animal animal=new com.masai.entity.Animal("name....");
//
//        animal.makeNoise();
//
//        cat an = new cat();
//        an.makeNoise();
//
//        com.masai.entity.Animal a= new cat();
//        a.makeNoise();
//
//        cat c = (cat)a;
//        c.jump();
//        Dog d = new Dog("Tisson");
//        Cat c =new Cat("Sweetuu");
//        Bat b=new Bat("com.masai.entity.Bat");
//        Fish f=new Fish("fishi");
//        Parrot p=new Parrot("totta");
//        Ostrich o=new Ostrich("Cilly");
//
//        AnimalUtils animalutils=new AnimalUtils();
//         animalutils.addanimal(d);
//         animalutils.addanimal(c);
//
//        Animal[] animals = { d, c, b, f, o, p };
//
//        for (Animal animal : animals) {
//            animal.makeNoise();
//            animal.roam();
//            animal.eat();
//            animal.sleep();
//            System.out.println();
//        }

//        Parrot parrot=new Parrot("pikku ");
//        parrot.fly();
//
//        Dog dog=new Dog("Doggesh ");
//        dog.fly();
//
//        Cat cat=new Cat("Sweetuuuuuuuu ");
//        cat.swim();

//        int a=new Main().sum();
//        System.out.println(a);

//        Day day= MONDAY;
//        switch (today){
//            case MONDAY:
//                System.out.println("Start the weekday");
//                break;
//
//            case FRIDAY:
//                System.out.println("End of the weekday");
//                break;
//
//            default:
//                System.out.println("Enjoy your day");
//        }


//        Order o1 = new Order(1, OrderStatus.DELIVERED);
//        Order o2 = new Order(2, OrderStatus.PENDING);
//        Order o3 = new Order(3, OrderStatus.SHIPPED);
//        Order o4 = new Order(4, OrderStatus.CANCELLED);
//        Order o5 = new Order(5, OrderStatus.PROCESSING);
//
//        o1.printStatus();
//        o2.printStatus();
//        o3.printStatus();;
//        o4.printStatus();
//        o5.printStatus();

//        Role role= ADMIN;
//        switch (role){
//            case ADMIN:
//                System.out.println("ADMIN aagaya");
//                break;
//
//            case USER:
//                System.out.println("USER aagaya");
//                break;
//
//            case GUEST:
//                System.out.println("GUEST aagaya");
//                break;
//
//            default:
//                System.out.println("SAB aagaey");
//        }
//
//        Status s=Status.SUCCESS;
//        System.out.println("Status: "+s);
//        System.out.println("Code: "+s.getCode() );
        MatOperations add=(a,b)->a+b;
        MatOperations multiply=(a,b)->a*b;

        System.out.println(add.operate(2,3));
        System.out.println(multiply.operate(2,3));
        }



    }
