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
	private static final int[] MAX_DAYS ={ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month-1];
	}
	public static void month(){
		

		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		
		
		System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
		

	}

}
