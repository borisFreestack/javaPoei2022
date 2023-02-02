package com.centraleNantes.poei2.boris.bPoo.youtube;

public enum CategoryEnum {
	SPORT("sports"), MUSIC("music"), SCIENCE("science");
	private String label;

	CategoryEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
