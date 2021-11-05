package com.pb.dudar.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {

    private static Object obj;

    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Horse horse1 = new Horse();
        dog1.setLocation("будка");
        cat1.setLocation("6-ая палата");
        horse1.setLocation("конюшня");

        System.out.println("Методы класов Dog, Cat, Horse:\n");
        dog1.makeNoise();
        dog1.eat();
        System.out.println("");
        cat1.makeNoise();
        cat1.eat();
        System.out.println("");
        horse1.makeNoise();
        horse1.eat();
        System.out.println("");

        dog1.sleep();
        System.out.println("======================\n");
        System.out.println("Отправляем животных к ветеринару:");
        Animal[] animals = new Animal[]{dog1, cat1, horse1};
        for (Animal a : animals) {
            Veterinarian.treatAnimal(a);
        }

        Class clazz = Class.forName("com.pb.dudar.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{String.class});
        obj = constr.newInstance("Зубков");
        if (obj instanceof Veterinarian) {
            Veterinarian vet = (Veterinarian) obj;
            System.out.println("Объект класса Veterinarian: ");
            ((Veterinarian) obj).veterinar();

        }

    }
}

