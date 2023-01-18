package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.time.LocalDate;
import java.util.List;

public class User {
	private String pseudo;
	private LocalDate birthdate;

	private List<Video> videoCreatedList;

	private List<Like> likeByUserList;

	public User() {
	}

	public User(String pseudo, LocalDate birthdate, List<Video> videoCreatedList, List<Like> likeByUserList) {
		this.pseudo = pseudo;
		this.birthdate = birthdate;
		this.videoCreatedList = videoCreatedList;
		this.likeByUserList = likeByUserList;
	}

	public List<Video> getVideoCreatedList() {
		return videoCreatedList;
	}

	public void setVideoCreatedList(List<Video> videoCreatedList) {
		this.videoCreatedList = videoCreatedList;
	}

	public List<Like> getLikeByUserList() {
		return likeByUserList;
	}

	public void setLikeByUserList(List<Like> likeByUserList) {
		this.likeByUserList = likeByUserList;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
}
