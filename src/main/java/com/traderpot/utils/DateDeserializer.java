package com.traderpot.utils;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime ldt = LocalDateTime.parse(json.getAsString(), formatter);
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("UTC")); 
		ZoneOffset offset = ZoneOffset.of("+05:30");
		ZonedDateTime istTime = zdt.withZoneSameInstant(offset);
		Date output = Date.from(istTime.toInstant());
		return output;
	}

}
