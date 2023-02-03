package com.centraleNantes.poei2.boris.bPoo.youtube.api;

import com.centraleNantes.poei2.boris.bPoo.youtube.Channel;
import com.centraleNantes.poei2.boris.bPoo.youtube.User;
import com.centraleNantes.poei2.boris.bPoo.youtube.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChannelStartApi {

	static List<Channel> channels = new ArrayList<>();

	public static Channel createChannel(User owner, String channelName) throws Exception {
		if (owner.canCreate()) {
			Channel channel = new Channel(channelName, owner);
			channels.add(channel);
			return channel;
		}
		throw new Exception("Only creator can create channel");
	}

	public static List<Channel> getChannelsByName(String channelName) {
		return channels.stream()
		.filter(chan -> chan.getChannelName().equals(channelName))
		.collect(Collectors.toList());
	}

	public static void upload(String channelName, Video video) {
		List<Channel> channelsWithSameName = channels.stream()
		.filter(chan -> chan.getChannelName().equals(channelName))
		.collect(Collectors.toList());

		Optional<Channel> theChannel = channelsWithSameName.stream().findFirst();
		if (theChannel.isPresent()) {
			theChannel.get().getVideos().add(video);
		}

	}

	public static void subscribe(Channel channel, User user) {
		List<Channel> channelsWithSameName = channels.stream()
		.filter(chan -> chan.getChannelName().equals(channel.getChannelName()))
		.collect(Collectors.toList());

		Optional<Channel> theChannel = channelsWithSameName.stream().findFirst();
		if (theChannel.isPresent()) {
			theChannel.get().getFollowers().add(user);
		}
	}

	public static List<Video> findRecommendations(User user) {
		List<Video> recommendations = new ArrayList<Video>();
		channels.stream()
		.filter(channel -> channel.getFollowers().contains(user))
		.forEach(channelFollowedyUser -> {
			recommendations.addAll(channelFollowedyUser.getVideos());
		});
		return recommendations;
	}
}
