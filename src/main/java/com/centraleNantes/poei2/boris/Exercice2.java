package com.centraleNantes.poei2.boris;

import java.util.Scanner;

public class Exercice2 {


	public static void main(String[] args) {

		int dayIndex;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrer un numéro de jour!");
		dayIndex = scanner.nextInt();

		if (dayIndex == 1) {
			System.out.println("Lundi");
		} else if (dayIndex == 2) {
			System.out.println("Mardi");
		} else if (dayIndex == 3) {
			System.out.println("Mercredi");
		} else if (dayIndex == 4) {
			System.out.println("Jeudi");
		} else if (dayIndex == 5) {
			System.out.println("Vendredi");
		} else if (dayIndex == 6) {
			System.out.println("Samedi");
		} else if (dayIndex == 7) {
			System.out.println("Dimanche");
		} else {
			System.out.println("Erreur");
		}


	}
}

