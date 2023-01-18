package com.centraleNantes.poei2.boris.bPoo.youtube;

public class Main {

	public static void main(String[] args) {
		Video video1 = new Video();
		new Video();
		new Video();
		System.out.println(Video.getCounter());


		VideoTransformer.clone(video1);
		System.out.println(Video.getCounter());

	}
}
