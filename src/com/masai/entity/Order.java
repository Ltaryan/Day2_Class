package com.masai.entity;

public class Order {
    int orderId;
    OrderStatus status;

    public Order(int id, OrderStatus status){
        this.orderId=id;
        this.status=status;
    }
    public void printStatus(){
        System.out.println("Order Id: "+orderId+" is "+status);
    }
}
