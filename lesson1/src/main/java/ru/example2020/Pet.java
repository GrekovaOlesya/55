package ru.example2020;

public class Pet {
    private int age;
    private String name;
    private int weight;

    public Pet(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String voice (){
        return "unknown";

    }
    public String ration (){
        return "unknown";

    }
    public String skill() {
        return "unknown";
    }
    public boolean canRun() {
        return false;
    }
    public boolean toclimbtrees() {
        return false;
    }
    public void aboutMe(){
        System.out.println("The name: "+ getName());
        System.out.println("Years old: "+ getAge());
        System.out.println("How mach weight: "+ getWeight());
        System.out.println("What he says: "+ voice());
        System.out.println("Like eating:"+ ration());
        System.out.println("Have skill: "+ skill());
        System.out.println();

    }


}
