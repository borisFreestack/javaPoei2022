package com.centraleNantes.poei2.boris.bPoo.youtube;

import java.time.LocalDate;

public class VideoTransformer {

	public static Video clone(Video source){
		Video clone = new Video();

		clone.setCreator(source.getCreator());
		clone.setDuration(source.getDuration());
		clone.setUrl(source.getUrl());
		clone.setTitle(source.getTitle());

		clone.setPublicationDate(LocalDate.now());
		return clone;
	}
}
