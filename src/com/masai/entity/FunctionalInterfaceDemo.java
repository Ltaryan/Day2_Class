package com.masai.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        MatOperations multiplication=new MatOperations() {
//            @Override
//            public int operate(int a, int b) {
//                return a*b;
//            }
//        };
//
//        MatOperations mul =(a,b)->a*b;
//
//        MatOperations add =(a,b)->a+b;
//
//        System.out.println("Addtion: "+add.operate(10,20));
//        System.out.println("Multiplication: "+mul.operate(2,10));
//
//        Consumer<String> printerr=(String s)-> System.out.println(s);
//        printerr.accept("Heloooooooo");
//
//        Predicate<Integer> isEven=(n )->n%2==0;
//        System.out.println(isEven.test(4));
//        System.out.println(isEven.test(5));
//
//        Function<Integer, String> concatInt=(n)->"Number- "+n;
//        System.out.println(concatInt.apply(120));
//
//        Supplier<Double> getRandomGenratedvalue=()->Math.random();
//        System.out.println(getRandomGenratedvalue.get());
//
//        List<Integer>numbers= Arrays.asList(1,2,3,4,5);
//        List<Integer>evenNumber=numbers.stream()
//                .filter(n->n%2==0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumber);

        List<Employees> employees = Arrays.asList(
                new Employees("Alice", "Developer","20k"),
                new Employees("Bob", "Manager","30k"),
                new Employees("Charlie", "Developer","10k")
        );
//
//        List<String> developers = employees.stream()
//                .filter(e -> e.getRole().equals("Developer"))
//                .map(Employees::getName)
//                .collect(Collectors.toList());
//
//        System.out.println("Developers: " + developers);


        List<Employees> sorted=employees.stream()
                .sorted(Comparator.comparing(Employees::getSalary))
                .collect(Collectors.toList());

        System.out.println(( " "+sorted));
        System.out.println();






    }
}
