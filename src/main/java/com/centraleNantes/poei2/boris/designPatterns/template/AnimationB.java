package com.centraleNantes.poei2.boris.designPatterns.template;

import java.awt.*;

public class AnimationB extends SubTemplateBlue{
	@Override
	public String getFrameName() {
		return "frame name animation B de sub template ";
	}

	@Override
	public Canvas getCanvas() {
		return this;
	}

	@Override
	public String getName() {
		return "animation B de sub template ";
	}

}
