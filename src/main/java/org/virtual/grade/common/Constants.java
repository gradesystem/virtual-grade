package org.virtual.grade.common;

import static java.time.format.DateTimeFormatter.*;

import java.time.LocalDateTime;

import org.virtualrepository.Property;



public class Constants {
	
	public static final String config_property = "grade.config";
	public static final String config_filename = "grade-repositories.json";
	
	public static Property now(String name) {
		return new Property(name, LocalDateTime.now().format(ISO_DATE_TIME));
	}
	
}
