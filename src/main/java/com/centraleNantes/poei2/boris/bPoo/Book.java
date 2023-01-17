package com.centraleNantes.poei2.boris.bPoo;

public class Book {

	private String title;
	private Chapter[] chapters;

	public Book() {
	}

	public Book(String title, Chapter[] chapters) {
		this.title = title;
		this.chapters = chapters;
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	public Chapter getChapterByPage(int pageNumber) throws ChapterNotFoundException {
		for (Chapter chapter : this.chapters) {
			if (chapter.hasPage(pageNumber)) {
				return chapter;
			}
		}
		throw new ChapterNotFoundException("Aucun chapitre ne correspond");
	}
}
