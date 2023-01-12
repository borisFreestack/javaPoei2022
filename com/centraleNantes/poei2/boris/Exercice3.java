package com.centraleNantes.poei2.boris;

import java.util.Scanner;

public class Exercice3 {


	public static void main(String[] args) {

		int dayIndex;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrer un numéro de jour!");
		dayIndex = scanner.nextInt();

		switch (dayIndex) {
			case 1:
				System.out.println("Lundi");
				break;
			case 2:
				System.out.println("Mardi");
				break;
			case 3:
				System.out.println("Mercredi");
				break;
			case 4:
				System.out.println("Jeudi");
				break;
			case 5:
				System.out.println("Vendredi");
				break;
			case 6:
				System.out.println("Samedi");
				break;
			case 7:
				System.out.println("Dimanche");
				break;
			default:
				System.out.println("Mauvaise valeur");
		}


	}
}

