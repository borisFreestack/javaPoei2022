package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Video {
	private String url;
	private String title;
	private int duration;
	private LocalDate publicationDate;
	private User creator;
	private List<Like> likeList;
	private List<CategoryEnum> categories;

	public static int getCounter() {
		return counter;
	}

	private static int counter;

	public Video(){
		counter++;
	}

	public Video(String title){
		this.title = title;
	}

	public Video(String url, String title, int duration, LocalDate publicationDate, User creator, List<Like> likeList) {
		this.url = url;
		this.title = title;
		this.duration = duration;
		this.publicationDate = publicationDate;
		this.creator = creator;
		this.likeList = likeList;
		counter++;
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

	public List<CategoryEnum> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryEnum> categories) {
		this.categories = categories;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Video video = (Video) o;
		return duration == video.duration && Objects.equals(url, video.url) && Objects.equals(
		title,
		video.title
		) && Objects.equals(publicationDate, video.publicationDate) && Objects.equals(
		creator,
		video.creator
		) && Objects.equals(likeList, video.likeList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
}
