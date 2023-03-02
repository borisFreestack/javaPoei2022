package com.centraleNantes.poei2.boris.designPatterns.template;

import java.awt.*;

public class AnimationA extends DrawingTemplate {
	@Override
	public Canvas getCanvas() {
		return this;
	}

	@Override
	public String getFrameTitle() {
		return "Le titre de l animation A";
	}
}
