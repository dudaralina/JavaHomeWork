package com.pb.dudar.hw6;

import java.util.Objects;

public class Horse extends Animal {
    String kind;
    String allure;

    public Horse(){
        super("Лошадь", "овёс");
    }

    @Override
    public void makeNoise (){
        System.out.print(getAnimal());
        super.makeNoise();
        System.out.println(" иго-го");
    }

    @Override
    public void eat () {
        System.out.print(getAnimal());
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(kind, horse.kind) && Objects.equals(allure, horse.allure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, allure);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "kind='" + kind + '\'' +
                ", allure='" + allure + '\'' +
                '}';
    }
}
