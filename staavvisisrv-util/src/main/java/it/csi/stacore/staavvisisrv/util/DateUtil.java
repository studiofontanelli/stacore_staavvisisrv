package it.csi.stacore.staavvisisrv.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;


public class DateUtil {

	public static final String SIMPLE_FORMAT = "dd/MM/yyyy";
	public static final String YEAR = "YYYY";
	public static final String YEAR_MONTH_NO_SEPARATOR = "yyyyMM";
	public static final String YEAR_MONTH = "yyyy-MM";
	public static final String MONTH_YEAR = "MM/yyyy";

	public static final String RFC_FORMAT = "dd-MM-yyyy";
	public static final String RFC_NO_SEPARATOR_FORMAT = "yyyyMMdd";

	public static String format(Date d, String format) throws ParseException{
		String data = null;
		if(d == null)
			return null;
		if(StringUtils.isBlank(format)) {
			throw new ParseException("Formato data non valorizzato", 0);
		}
		try {

			Instant instant = d.toInstant();
			ZonedDateTime zdt = instant.atZone( ZoneId.systemDefault() );
			LocalDate localDate = zdt.toLocalDate();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			data = localDate.format(formatter);

		} catch (Exception e) {
			throw new ParseException("Formato data non non corretto", 0);
		}
		return data;


	}

	public static Date parse(String d, String format) throws ParseException {
		Date date = null;
		if(StringUtils.isBlank(d)) {
			return null;
		}
		try {	
			
			
			SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.ITALIAN);

			date = formatter.parse(d);
			
			
		

		} catch (Exception e) {
			throw new ParseException("Formato data non corretto", 0);
		}
		return date;
	}

	public static Date parse(String d) throws ParseException{
		return parse(d, SIMPLE_FORMAT);
	}

	public static String format(Date d) throws ParseException{
		return format(d, SIMPLE_FORMAT);
	}

	public static Date getCurrentDate() {
		return Calendar.getInstance().getTime();
	}


}