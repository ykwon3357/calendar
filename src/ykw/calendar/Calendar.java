package ykw.calendar;

import java.util.Scanner;

public class Calendar {
	// 31 29 31 30 31 30 31 31 30 31 30 31
	// 4년 마다 2월 29일
	// if 배열
	/*
	 * 달을 입력하세요.
	3 (엔터)
	3월은 31일까지 있습니다.
	 */
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int year, int month) {
		if (year % 4 == 0 && month == 2) {
			MAX_DAYS[month - 1] = 29;
			return MAX_DAYS[month - 1];
		}
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("년도,달 입력하세요.");
		String num = sc.nextLine();

		String[] numlist = num.split(",");
		int year = Integer.parseInt(numlist[0]);
		int month = Integer.parseInt(numlist[1]);

		System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, cal.getMaxDaysOfMonth(year, month));

	}

}
