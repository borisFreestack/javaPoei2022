package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private String channelName;
	private User creator;
	private List<User> followers = new ArrayList<User>();
	private List<Video> videos = new ArrayList<Video>();

	public Channel(String nom, User user){
		this.channelName = nom;
		this.creator = user;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
}
