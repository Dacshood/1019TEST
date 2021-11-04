package com.yedam.java.ch11.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//Data 클래스
		long time = System.currentTimeMillis();
		Date now = new Date(time);
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		System.out.println();
		
		//Calendar 클래스
		Calendar now2 = Calendar.getInstance();
		System.out.println(now2.toString());
		
		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) + 1; // MONTH 리턴되는 값이 0~11 이기에 +1
		int day = now2.get(Calendar.DAY_OF_MONTH);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
			
		}
		
		int amPm = now2.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm ="오전";
		}else {
			strAmPm ="오후";
		}
		
		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		int second = now2.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		System.out.printf("%s요일 %s\n", strWeek, strAmPm);
		System.out.printf("%d시 %d분 %d초", hour,minute,second);
		
	
	}

}
