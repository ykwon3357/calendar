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
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("달을 입력하세요.");
		int i = sc.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다.", i, month[i - 1]);

	}

}
