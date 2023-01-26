package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.util.*;
import java.util.function.Consumer;

public class Main {

	Integer printAndSum(Integer x, Integer y){
		System.out.println(x);
		System.out.println(y);
		return x + y;
	}

	public static void main(String[] args) {


		//création et utilisation "à la volée"
		ArrayList<User> userList = new ArrayList<>();
		userList.forEach((user)-> System.out.println(user.getName()));

		//création d'un consumer pour réutilisation ou facilité de lecture
		Consumer<User> printNameConsumer = (User user) -> System.out.println(user.getName());
		userList.forEach(printNameConsumer);

		// utilisation dans une API
		Collections.sort(userList, (User u1, User u2) -> u1.getLikeByUserList().size() - u2.getLikeByUserList().size());

	}
}
