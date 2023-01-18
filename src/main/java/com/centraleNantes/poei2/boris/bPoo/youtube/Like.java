package com.centraleNantes.poei2.boris.bPoo.youtube;

public class Like {

	Video videoLiked;
	User userLiking;

	public Like() {
	}

	public Like(Video videoLiked, User userLiking) {
		this.videoLiked = videoLiked;
		this.userLiking = userLiking;
	}

	public Video getVideoLiked() {
		return videoLiked;
	}

	public void setVideoLiked(Video videoLiked) {
		this.videoLiked = videoLiked;
	}

	public User getUserLiking() {
		return userLiking;
	}

	public void setUserLiking(User userLiking) {
		this.userLiking = userLiking;
	}


}
