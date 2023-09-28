package com.telran.org.Homework;

public class Person {
    private String name;
    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(name + " идет");
    }

    public void talk() {
        System.out.println(name + " говорит");
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", fullName='" + fullName + '\'' + ", age=" + age + '}';
    }
}
