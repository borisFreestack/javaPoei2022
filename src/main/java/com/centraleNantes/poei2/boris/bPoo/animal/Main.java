package com.centraleNantes.poei2.boris.bPoo.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal loup = new Wolf();
		Dog chien = new Dog();
		Animal putty = (Animal) chien;
		Pet petty = (Pet) putty;
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(chien);
		animals.add(loup);

		animals.forEach(animal->{
			animal.makeNoise();
		});

	}
}
