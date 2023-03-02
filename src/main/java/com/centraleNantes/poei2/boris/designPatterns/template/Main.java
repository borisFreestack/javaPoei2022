package com.centraleNantes.poei2.boris.designPatterns.template;

public class Main {

	public static void main(String[] args) {
		DrawingTemplate drawing = new AnimationA();
		drawing.createFrame();
	}
}
