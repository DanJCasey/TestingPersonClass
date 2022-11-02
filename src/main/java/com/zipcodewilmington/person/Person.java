package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;

    private double weight;
    private String hairColor;
    private double shoeSize;
    private boolean isAlive;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public double getShoeSize() {
        return shoeSize;
    }
}
