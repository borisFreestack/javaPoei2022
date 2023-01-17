package com.centraleNantes.poei2.boris;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {

		int dayIndex;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrer un numéro de jour!");
		dayIndex = scanner.nextInt();
		int languageIndex;
		System.out.println("Veuillez entrer l'index du language !");
		languageIndex = scanner.nextInt();

		String[][] dayDictionnary = {
		{"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"},
		{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"},
		};

		System.out.println(dayDictionnary[languageIndex][dayIndex]);

	}
}
