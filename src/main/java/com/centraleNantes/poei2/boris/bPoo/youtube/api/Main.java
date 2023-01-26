package com.centraleNantes.poei2.boris.bPoo.youtube.api;


import com.centraleNantes.poei2.boris.bPoo.youtube.Like;
import com.centraleNantes.poei2.boris.bPoo.youtube.User;
import com.centraleNantes.poei2.boris.bPoo.youtube.Video;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        try {
            User user = new User();
            user.setPseudo("identifiant@email.fr");
            user.setPassword("secretPassword");

            /*
            user.setName("...")
            ...
             */

            UserApi.register(user);
            String identifiant = "identifiant@email.fr";
            String password = "secretPassword";
            User userLogged = UserApi.login(identifiant, password);

            Video aVideo = new Video();
            aVideo.setTitle("video title");

            /*
            uploadVideo.setTitle("...");
            ...
            */
            VideoApi.upload(aVideo, userLogged);
            List<Video> videosOfUser = VideoApi.listByCreator(userLogged);
            System.out.println(videosOfUser.size() + " videos");
            List<Video> videosOfNewUser = VideoApi.listByCreator(new User());
            System.out.println(videosOfNewUser.size() + " videos");

            LikeApi.like(userLogged, aVideo);

            System.out.println(LikeApi.list(aVideo).size() + " likes");

            LikeApi.dislike(userLogged, aVideo);

            System.out.println(LikeApi.list(aVideo).size() + " likes");

        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }

}
