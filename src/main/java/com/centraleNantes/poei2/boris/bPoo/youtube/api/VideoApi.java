package com.centraleNantes.poei2.boris.bPoo.youtube.api;

import com.centraleNantes.poei2.boris.bPoo.youtube.User;
import com.centraleNantes.poei2.boris.bPoo.youtube.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoApi {

	public static Map<User, List<Video>> videosByUser = new HashMap();

	public static List<Video> listByCreator(User user) {
		if(videosByUser.containsKey(user)){
			return videosByUser.get(user);
		}
		return new ArrayList<Video>();
	}

	public static void upload(Video video, User creator) {
		if(!videosByUser.containsKey(creator)){
			videosByUser.put(creator, new ArrayList());
		}
		videosByUser.get(creator).add(video);
	}
}
