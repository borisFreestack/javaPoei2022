package com.centraleNantes.poei2.boris.bPoo.youtube.api;


import com.centraleNantes.poei2.boris.bPoo.youtube.*;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        try {
            User visitor = new Visitor();

            visitor.setPseudo("identifiant@email.fr");
            visitor.setPassword("secretPassword");

            User creator = new Creator();
            creator.setPseudo("identifiantb@email.fr");
            creator.setPassword("secretPasswordb");

            /*
            user.setName("...")
            ...
             */

            UserApi.register(visitor);
            UserApi.register(creator);
            User userLogged = UserApi.login(visitor.getPseudo(), visitor.getPassword());

            Video aVideo = new Video();
            aVideo.setTitle("video title");
            Video bVideo = new Video();
            bVideo.setTitle("video title");

            /*
            uploadVideo.setTitle("...");
            ...
            */
            VideoApi.upload(aVideo, userLogged);

            userLogged.equals(aVideo);

            List<Video> videosOfUser = VideoApi.listByCreator(userLogged);
            System.out.println(videosOfUser.size() + " videos");

            LikeApi.like(userLogged, aVideo);
            LikeApi.like(creator, bVideo);
            LikeApi.like(creator, bVideo);

            System.out.println(LikeApi.list(aVideo).size() + " likes");

            LikeApi.dislike(userLogged, aVideo);

            System.out.println(LikeApi.list(aVideo).size() + " likes");

            Channel channel = ChannelStartApi.createChannel(creator, "channelName");
            System.out.println(channel.getChannelName());


            ChannelStartApi.upload(channel.getChannelName(), bVideo);
            ChannelStartApi.upload(channel.getChannelName(), aVideo);

            ChannelStartApi.subscribe(channel, visitor);
            ChannelStartApi.subscribe(channel, creator);

            List<Video> videosRecommended = ChannelStartApi.findRecommendations(creator);
            System.out.println("Liste des recommendations: ");
            videosRecommended.forEach(video-> System.out.println(video.getTitle()));

        } catch (LoginException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
