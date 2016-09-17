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
		
		System.out.println("������ " + now +  "�Դϴ�.");
		System.out.println("1970�� 1�� 1�� ���� �ð����κ��� ");
		System.out.println(tmpElapsedMiliSeconds+ "ms ��� �Ǿ����ϴ�.");
		System.out.println(tmpElapsedSeconds+ "s ��� �Ǿ����ϴ�.");
		System.out.println(tmpElapsedMinutes+ "minutes ��� �Ǿ����ϴ�.");
		System.out.println(tmpElapsedHours+ "hours ��� �Ǿ����ϴ�.");
		System.out.println(tmpElapsedDays+ "days ��� �Ǿ����ϴ�.");
		System.out.println(tmpElapsedYears+ "years ��� �Ǿ����ϴ�.");
	}
}