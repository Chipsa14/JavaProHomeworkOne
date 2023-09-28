package com.telran.org.Homework;

public class HomeworkOne {
    public static void main(String[] args) {
        Person me = new Person("Alex", "Rashevchenko", 24);

        Person myFrend = new Person();
        myFrend.setName("Vitalii");
        myFrend.setFullName("Rudenko");
        myFrend.setAge(26);


        myFrend.talk();
        me.move();
        System.out.println(me);
        System.out.println(myFrend);


    }
}
