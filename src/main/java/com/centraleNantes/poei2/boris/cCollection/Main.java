package com.centraleNantes.poei2.boris.cCollection;

import java.util.*;

public class Main {


	public static void main(String[] args) {

		String prologue = "Friar Laurence: Two households, both alike in dignityIn fair Verona, where we lay our scene " +
		                  "From ancient grudge break to new mutiny. Where civil blood makes civil hands unclean." +
		                  "From forth the fatal loins of these two foes. A pair of star-crossed lovers take their life" +
		                  "Whose misadventured piteous overthrows. Do with their death bury their parents strife " +
		                  "The fearful passage of their death marked love. And the continuance of their parents’s rage " +
		                  "Which but their childrens? end, nought could remove. Is now the two hours traffic of our stage " +
		                  "The which if you with patient ears attend What here shall miss, our toil shall strive to mend.";

		String[] items = prologue.split(" ");
		List<String> words = new ArrayList<>();
		for (String item : items) {
			words.add(item.toLowerCase());
		}
		exercice1(words);
		exercice2(words);
		exercice3(words);
		exercice3bis(words);
		exercice4(words);
		exercice4Correction(words);
		exercice5(words);
		exercice6(words);

	}

	public static void exercice4Correction(List<String> words) {
		Map<String, Integer> mapOfWord = new HashMap<>();
		for (String word : words) {
			if (mapOfWord.containsKey(word)) {
				Integer count = mapOfWord.get(word);
				mapOfWord.put(word, count + 1);
			} else {
				mapOfWord.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> word: mapOfWord.entrySet()){
			System.out.println("le mot " + word.getKey() + " est présent " + word.getValue());
		}
	}


	public static void exercice1(List<String> words) {
		System.out.println("Exercice 1");
		words.sort(Comparator.naturalOrder());
		for (String word : words) {
			System.out.println(word);
		}

	}

	public static void exercice2(List<String> words) {
		System.out.println("Exercice 2");
		ArrayList<String> filteredWords = new ArrayList<>();
		for (String word : words) {
			if (word.length() >= 2) {
				filteredWords.add(word);
			}
		}
		for (String word : filteredWords) {
			System.out.println(word);
		}

	}

	public static void exercice3(List<String> words) {
		System.out.println("Exercice 3");
		TreeSet<String> filteredWords = new TreeSet<>();
		for (String word : words) {
			if (word.length() >= 2) {
				filteredWords.add(word);
			}
		}
		for (String word : filteredWords) {
			System.out.println(word);
		}

	}

	public static void exercice3bis(List<String> words) {
		System.out.println("Exercice 3'");
		TreeSet<String> filteredWords = new TreeSet<>(words);

		for (String word : filteredWords) {
			System.out.println(word);
		}
	}

	public static void exercice4(List<String> words) {
		System.out.println("Exercice 4");
		HashMap<String, Integer> mapOfWords = new HashMap<>();
		for (String word : words) {
			if (word.length() >= 2) {
				if (mapOfWords.containsKey(word)) {
					Integer count = mapOfWords.get(word);
					mapOfWords.put(word, ++count);
				} else {
					mapOfWords.put(word, 1);
				}
			}
		}
		for (Map.Entry<String, Integer> word : mapOfWords.entrySet()) {
			System.out.printf("Le mot %s est présent %d %n", word.getKey(), word.getValue());
		}
	}

	public static void exercice5(List<String> words) {
		System.out.println("Exercice 5");
		HashMap<String, Integer> mapOfWords = new HashMap<>();
		for (String word : words) {
			if (word.length() >= 2) {
				if (mapOfWords.containsKey(word)) {
					Integer count = mapOfWords.get(word);
					mapOfWords.put(word, ++count);
				} else {
					mapOfWords.put(word, 1);
				}
			}
		}

		List<Map.Entry<String, Integer>> list = new ArrayList<>(mapOfWords.entrySet());
		list.sort(Map.Entry.comparingByValue());

		Map<String, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		for (Map.Entry<String, Integer> word : result.entrySet()) {
			System.out.printf("Le mot %s est présent %d %n", word.getKey(), word.getValue());
		}
	}

	public static void exercice6(List<String> words) {
		System.out.println("Exercice 6");

		HashMap<String, List<Integer>> indicesOfWords = new HashMap<>();
		int position = 0;
		for (String word : words) {
			int length = word.length();
			if (indicesOfWords.containsKey(word)) {
				indicesOfWords.get(word).add(position);
			} else {
				List<Integer> indices = new ArrayList<>();
				indices.add(position);
				indicesOfWords.put(word, indices);
			}
			if (position == 0) {
				position += length;
			} else {
				position += length + 1; // on ajoute l'espace
			}
		}

		for (Map.Entry<String, List<Integer>> entry : indicesOfWords.entrySet()) {

			System.out.printf("Le mot %s est présent à : ", entry.getKey());

			for (Integer indice : entry.getValue()) {
				System.out.printf(" %s ", indice);
			}
			System.out.println("");
		}
	}
}
