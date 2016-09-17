package net.zerocoding.tutorials.java.date.examples;

import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		Long tmpElapsedMiliSeconds = now.getTime();
		Long tmpElapsedSeconds = tmpElapsedMiliSeconds / 1000;
		Long tmpElapsedMinutes = tmpElapsedSeconds / 60;
		Long tmpElapsedHours = tmpElapsedMinutes / 60;
		Long tmpElapsedDays = tmpElapsedHours / 24;
		Long tmpElapsedYears = tmpElapsedDays / 365;
		
		System.out.println("오늘은 " + now +  "입니다.");
		System.out.println("1970년 1월 1일 기준 시간으로부터 ");
		System.out.println(tmpElapsedMiliSeconds+ "ms 경과 되었습니다.");
		System.out.println(tmpElapsedSeconds+ "s 경과 되었습니다.");
		System.out.println(tmpElapsedMinutes+ "minutes 경과 되었습니다.");
		System.out.println(tmpElapsedHours+ "hours 경과 되었습니다.");
		System.out.println(tmpElapsedDays+ "days 경과 되었습니다.");
		System.out.println(tmpElapsedYears+ "years 경과 되었습니다.");
	}
}