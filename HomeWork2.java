package com.telran.org.Homework;

public class HomeWork2 {
    public static void main(String[] args) {
     Phone phone1 =new Phone("+380988363633","iphone 12",0.1);
     Phone phone2 =new Phone("+380966451634","iphone 14 ProMax",0.2);
     Phone phone3 =new Phone("+380666454455","iphone 6",0.150);

     phone1.receiveCall("Alex");
     phone1.gettNumber();
     phone2.receiveCall("Vitalii");
     phone2.gettNumber();
     phone3.receiveCall("Anastasiya");
     phone3.gettNumber();

        System.out.println("Number from person1 "+ phone1.getNumber());
        System.out.println("Model "+ phone1.getModel());
        System.out.println("Weight " + phone1.getWeight());

        System.out.println("Number from person2 "+ phone2.getNumber());
        System.out.println("Model "+ phone2.getModel());
        System.out.println("Weight " + phone2.getWeight());


        System.out.println("Number from person3 "+ phone3.getNumber());
        System.out.println("Model "+ phone3.getModel());
        System.out.println("Weight " + phone3.getWeight());
    }
}
