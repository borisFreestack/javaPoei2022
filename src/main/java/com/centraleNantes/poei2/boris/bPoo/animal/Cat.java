package com.centraleNantes.poei2.boris.bPoo.animal;

public class Cat extends Feline implements Pet {

    @Override
    public void beNice() {
        System.out.println("ronronne");
    }

    public void eat() {
        Dog dog = new Dog();
        Animal animal = (Animal) dog;
        Dog dogToo = (Dog) animal;
    }

    public void makeNoise() {
        System.out.println("miaou!");
    }


    public static void main(String[] args){
        Pet pettyCat = new Cat();
        pettyCat.beNice();
        Cat otherCat = new Cat();
        otherCat.beNice();
    }


}
