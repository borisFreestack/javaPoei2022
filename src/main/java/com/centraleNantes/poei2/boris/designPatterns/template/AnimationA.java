package com.centraleNantes.poei2.boris.designPatterns.template;

import java.awt.*;

public class AnimationA extends DrawingTemplate {

	@Override
	public String getFrameTitle() {
		return "Le titre de l animation A";
	}

	@Override
	public Color getCircleColor() {
		return Color.BLUE;
	}

	@Override
	public Color getSquareColor() {
		return Color.CYAN;
	}

	@Override
	public String getTitle() {
		return "titre anitmation A";
	}
}
