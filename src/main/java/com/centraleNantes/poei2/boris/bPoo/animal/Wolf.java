package com.centraleNantes.poei2.boris.bPoo.animal;

public class Wolf extends Canine {

    @Override
    public void eat() {
        System.out.println("chasse et mange des sangliers");
    }

    @Override
    public void makeNoise() {
        System.out.println("hurle");
    }
}
