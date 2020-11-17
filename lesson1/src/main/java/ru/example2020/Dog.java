package ru.example2020;

public class Dog extends Pet{

    public Dog(int age, String name, int weight) {
        super(age, name, weight);

    }
    @Override
    public String voice () {
        return "Гав";
    }
    @Override
    public String ration () {
        return "bone";
    }
    @Override
    public String skill () {
        return "swim";
    }
    @Override
    public boolean canRun() {
        return true;
    }
    @Override
    public boolean toclimbtrees(){
        return false;
    }
}
