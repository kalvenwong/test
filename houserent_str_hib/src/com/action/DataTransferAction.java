package com.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

class DataTransferAction extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class clz) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		String dateStr=values[0];
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new TypeConversionException();
	}

	@Override
	public String convertToString(Map context, Object obj) {
		Date date=(Date) obj;
		return new SimpleDateFormat("MM/dd/yy").format(date);
	}

}
