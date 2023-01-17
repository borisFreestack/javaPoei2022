package com.centraleNantes.poei2.boris.exceptions;

/**
 *
 * Une classe d'exception spécifique à notre problème de jour de la semaine
 *
 */
public class WeekDayException extends Exception {

	public WeekDayException(String message) {
		super(message);
	}
}
