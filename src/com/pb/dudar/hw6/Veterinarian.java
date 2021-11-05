package com.pb.dudar.hw6;


public class Veterinarian {
    private String name;

    public Veterinarian (String name){
        this.name = name;
    }
    public void veterinar() {
        System.out.println("Ветеринар: " + name);
    }

    public static void treatAnimal (Animal animal){
        System.out.println("Животное: " + animal.getAnimal() +"\nлокация: " + animal.getLocation());
        System.out.println("Для питания нужно: " + animal.getFood());
        System.out.println("--------------------------");
    }

}
