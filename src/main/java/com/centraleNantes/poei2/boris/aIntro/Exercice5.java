package com.centraleNantes.poei2.boris.aIntro;

import com.centraleNantes.poei2.boris.aIntro.exceptions.WeekDayException;

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

		System.out.println(application1(languageIndex, dayIndex));
		System.out.println(application2(languageIndex, dayIndex));


	}

	/**
	 *
	 * Ce programme a absolument besoin du nom du jour, sinon il doit informer l’utilisateur qu’il y a eu un problème.
	 * si il y a un probleme , il renvoie alors le message porté par l'exception
	 *
	 * @param languageIndex
	 * @param dayIndex
	 * @return
	 */
	static String application1(int languageIndex, int dayIndex) {
		try {
			return getDayName(languageIndex,dayIndex);
		} catch (WeekDayException e) {
			return e.getMessage();
		}

	}

	/**
	 *
	 * Ce programme veut une valeur de jour lisible, quelle qu’elle soit, mais un jour, au pire le jour d’aujourd’hui.
     * on le renvoie alors en anglais par simplicité
	 *
	 * @param languageIndex
	 * @param dayIndex
	 * @return
	 */
	static String application2(int languageIndex, int dayIndex) {
		try {
			return getDayName(languageIndex,dayIndex);
		} catch (WeekDayException e) {
			return LocalDate.now().getDayOfWeek().toString().toLowerCase();
		}

	}


	static String getDayName(int languageIndex, int dayIndex) throws WeekDayException {
		try {
			return dayDictionnary[languageIndex][dayIndex];
		} catch (Exception e) {
			throw new WeekDayException("Invalid day or language value");
		}

	}

}
