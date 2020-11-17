package ru.example2020;

public class Cat extends Pet {

    public Cat(int age, String name, int weight) {
        super(age, name, weight);

    }
    @Override
    public String voice () {
        return "Мяу";
    }
    @Override
    public String ration () {
        return "Fish";
    }
    @Override
    public String skill () {
        return "Catch mouse";
    }
    @Override
    public boolean canRun() {
        return true;
    }
    @Override
    public boolean toclimbtrees(){
        return true;
    }
}



