package com.centraleNantes.poei2.boris.bPoo.youtube.api;

import com.centraleNantes.poei2.boris.bPoo.youtube.User;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {

	static Map<String, User> users = new HashMap<>();

	public static User login(String identifiant, String password) throws LoginException {
		User user = users.get(identifiant);
		if(user == null){
			throw new LoginException("User " + identifiant + " does not exist");
		}
		if(!user.getPassword().equals(password)){
			throw new LoginException("Wrong password");
		}

		return user;

	}

	public static void register(User user) {
		users.put(user.getName(), user);
	}
}
