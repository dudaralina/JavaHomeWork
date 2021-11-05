package com.pb.dudar.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String fur;
    private String breed;


    public Dog(){
        super("Пёс", "мясо");
    }


    @Override
    public void makeNoise (){
        System.out.print(getAnimal());
        super.makeNoise();
        System.out.println(" гав");
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
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(fur, dog.fur) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fur, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "fur='" + fur + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
