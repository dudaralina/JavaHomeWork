package com.pb.dudar.hw6;


import java.util.Objects;

public class Cat extends Animal {
    private String breed;
    private String color;
    private String character;

    public Cat() {
        super("Кот", "рыбу");
    }



    @Override
    public void makeNoise (){
        System.out.print(getAnimal());
        super.makeNoise();
        System.out.println(" мяу");
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
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed) && Objects.equals(color, cat.color) && Objects.equals(character, cat.character);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color, character);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", character='" + character + '\'' +
                '}';
    }
}
