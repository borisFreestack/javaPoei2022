package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class User {
	private String pseudo;
	private LocalDate birthdate;
	private String password;

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

	public String getName() {
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

	public String getPseudo() {
		return pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return pseudo.equals(user.pseudo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pseudo);
	}
}
