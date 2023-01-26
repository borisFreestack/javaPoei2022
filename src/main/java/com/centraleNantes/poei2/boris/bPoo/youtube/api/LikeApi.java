package com.centraleNantes.poei2.boris.bPoo.youtube.api;

import com.centraleNantes.poei2.boris.bPoo.youtube.Like;
import com.centraleNantes.poei2.boris.bPoo.youtube.User;
import com.centraleNantes.poei2.boris.bPoo.youtube.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LikeApi {

	static Map<Video, List<Like>> likesByVideo = new HashMap<Video, List<Like>>();

	public static void like(User user, Video video) {
		if(!likesByVideo.containsKey(video)){
			likesByVideo.put(video, new ArrayList<Like>());
		}
		likesByVideo.get(video).add(new Like(video, user));
	}
	public static void dislike(User user, Video video) {
		likesByVideo.get(video).removeIf(like -> like.getUserLiking().equals(user));
	}
	public static List<Like> list(Video video) {
		return likesByVideo.get(video);
	}
}
