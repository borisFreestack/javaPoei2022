package com.centraleNantes.poei2.boris.cCollection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStreamCorrection {


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
		exercice4(words);
		//exercice5(words);

	}


	public static void exercice1(List<String> words) {
		System.out.println("Exercice 1");
		words.sort(Comparator.naturalOrder());
		words.forEach(toto-> System.out.println(toto));
	}

	public static Consumer<String> printWord = (String word) -> System.out.println(word);

	public static void exercice2(List<String> words) {
		System.out.println("Exercice 2");
		words.stream()
		.filter(word-> word.length()>=2)
		.forEach(printWord);
	}

	public static void exercice3(List<String> words) {
		System.out.println("Exercice 3");
		words.stream()
		.filter(word-> word.length()>=2)
		.distinct()
		.sorted()
		.forEach(printWord);

		words.stream()
		.filter(word-> word.length()>=2)
		.collect(Collectors.toSet())
		.stream()
		.sorted()
		.forEach(printWord);

	}

	public static void exercice4(List<String> words) {
		System.out.println("Exercice 4");
		words.stream()
		.filter(word-> word.length()>=2)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((entry, count) -> System.out.println(entry + " " + count));
		// System.out.println(map);
		// .entrySet().stream().forEach(entry -> System.out.println(" " entry.getKey() ));
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

}
