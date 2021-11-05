package com.pb.dudar.hw6;

public class Animal {
    private String food;
    private String location;
    private String animal;

    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}

    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}

    public String getAnimal() {return animal;}
    public void setAnimal(String animal) {this.animal = animal;}

    public Animal(String animal, String food) {
        this.animal = animal;
        this.food = food;
    }

    public void makeNoise() {
        System.out.print( " издает звук: ");
    }

    public void eat(){
        System.out.print( " ест " );
    }

    public void sleep(){
        System.out.println( getAnimal() + " спит...zZzZzZ....");
    }


}
