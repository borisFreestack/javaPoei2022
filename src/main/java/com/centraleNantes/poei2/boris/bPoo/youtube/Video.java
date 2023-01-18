package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.time.LocalDate;
import java.util.List;

public class Video {
	private String url;
	private String title;
	private int duration;
	private LocalDate publicationDate;
	private User creator;
	private List<Like> likeList;

	public Video(){
	}

	public Video(String url, String title, int duration, LocalDate publicationDate, User creator, List<Like> likeList) {
		this.url = url;
		this.title = title;
		this.duration = duration;
		this.publicationDate = publicationDate;
		this.creator = creator;
		this.likeList = likeList;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
}
