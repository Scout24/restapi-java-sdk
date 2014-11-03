package de.is24.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class TimeUtil {

	public static long toSeconds(long ms) {
		return ms / 1000;
	}

	public static int toMinutes(int s) {
		return s / 60;
	}

	public static XMLGregorianCalendar stringToXMLGregorianCalendar(String s, Boolean withTime) {
		XMLGregorianCalendar result = null;
		Date date = null;
		SimpleDateFormat simpleDateFormat;
		GregorianCalendar gregorianCalendar;
		if (withTime) {
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		} else {
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		}
		try {
			date = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(date);
		try {
			if (withTime) {
				result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
			} else {
				result = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gregorianCalendar.get(Calendar.YEAR), gregorianCalendar.get(Calendar.MONTH) + 1,
						gregorianCalendar.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
			}
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
		return result;
	}
}
