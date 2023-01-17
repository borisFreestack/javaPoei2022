package com.centraleNantes.poei2.boris.bPoo;


public class Main {

	public static void main(String[] args) {


		Chapter chapter = new Chapter();
		chapter.setChapterTitle("First chapter");
		chapter.setStartPage(0);
		chapter.setEndPage(30);

		Chapter chapter2 = new Chapter();
		chapter2.setChapterTitle("Second chapter");
		chapter2.setStartPage(31);
		chapter2.setEndPage(60);

		Book firstBook = new Book("myBook", new Chapter[]{chapter, chapter2});

		System.out.println("Le titre du livre est : " + firstBook.getTitle());
		System.out.println("Le nombre de chapitre est : " + firstBook.getChapters().length);

		int pageNumber = 20;

		Chapter chapterFound = null;

		try {
			chapterFound = firstBook.getChapterByPage(pageNumber);
		} catch (ChapterNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Le chapitre trouvé est : " + chapterFound.getChapterTitle());

		/**
		 * Plutot que construire les strings dynamique en concatenant avec des +
		 * voici une alternative :
		 * -> System.out.printf
		 * printf nous permet d utiliser une syntaxe plus condensée afin de construire notre String
		 * les %s et %d définissent des variables (%s = string , %d = decimal)  qui prendront la valeur
		 * des paramètres suivants
		 * (%n est par contre juste un saut de ligne)
		 * Ainsi dans
		 * System.out.printf("Le chapitre trouvé à la page %d est : %s", pageNumber, chapterFound.getChapterTile());
		 * le %d sera remplacé par le premier paramètre, ici pageNumber et le %s par le second,
		 * ici chapterFound.getChapterTile()
		 */
		System.out.printf("Le chapitre trouvé à la page %d est : %s", pageNumber, chapterFound.getChapterTitle());
	}


}
