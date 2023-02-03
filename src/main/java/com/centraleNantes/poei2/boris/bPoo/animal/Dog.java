package com.centraleNantes.poei2.boris.bPoo.animal;

public class Dog extends Canine implements Pet {

    public void eat() {
        System.out.println("mange des croquettes");
    }

    public void makeNoise() {
        System.out.println("aboie");
    }

    @Override
    public void beNice() {
        System.out.println("saute de joie");
    }
}
