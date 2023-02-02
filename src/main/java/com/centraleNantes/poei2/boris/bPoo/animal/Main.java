package com.centraleNantes.poei2.boris.bPoo.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal loup = new Wolf();
		Animal chien = new Dog();


		List<Animal> animals = new ArrayList<Animal>();
		animals.add(chien);
		animals.add(loup);

		animals.forEach(animal->{
			animal.makeNoise();
		});

	}
}
