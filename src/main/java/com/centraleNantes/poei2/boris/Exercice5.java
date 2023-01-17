package com.centraleNantes.poei2.boris;

import javax.management.RuntimeErrorException;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercice5 {

	static int dayIndex;
	static String[][] dayDictionnary;

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrer un numéro de jour!");
		dayIndex = scanner.nextInt();
		int languageIndex;
		System.out.println("Veuillez entrer l'index du language !");
		languageIndex = scanner.nextInt();

		dayDictionnary = new String[][]{
		{"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"},
		{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"},
		};

		try {
			System.out.println(getDayName(languageIndex, dayIndex));
		} catch (Exception e) {
			System.out.println("il y a une erreur");
		}


		try {
			System.out.println(getDayName(languageIndex, dayIndex));
		} catch (Exception e) {

			dayIndex = LocalDate.now().getDayOfWeek().getValue() - 1;
			try {
				System.out.println(getDayName(languageIndex, dayIndex));
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		}


	}

	static String getDayName(int languageIndex, int dayIndex) throws Exception, RuntimeErrorException {
		return dayDictionnary[languageIndex][dayIndex];
	}

}
