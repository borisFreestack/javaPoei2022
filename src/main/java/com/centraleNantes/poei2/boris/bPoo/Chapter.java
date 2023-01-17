package com.centraleNantes.poei2.boris.bPoo;

public class Chapter {
	private String chapterTitle;
	private int startPage;
	private int endPage;


	public String getChapterTitle() {
		return chapterTitle;
	}

	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean hasPage(int page){
		return this.getStartPage() <= page && page <= this.getEndPage();
	}
}
