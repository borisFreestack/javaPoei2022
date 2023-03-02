package com.centraleNantes.poei2.boris.designPatterns.template;

import com.centraleNantes.poei2.boris.designPatterns.template.correction.DrawingTemplate;

import java.awt.*;

public abstract class SubTemplateBlue extends DrawingTemplate {

	@Override
	public Color getCircleColor() {
		return Color.BLUE;
	}

	public Color getColor() {
		return Color.CYAN;
	}
}
