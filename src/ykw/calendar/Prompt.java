package ykw.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2020, month = 1;
		while (true) {
			System.out.println("년을 입력하세요.(exit: -1)");
			System.out.print("YEAR>");
			year = sc.nextInt();

			if (year == -1) {
				System.out.println("Have a nice day!");
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>");
			month = sc.nextInt();

			// 유효성 체크
			while (month < 1 || month > 12) {
				System.out.println("범위(1~12) 초과, 다시 입력하세요.");
				System.out.print("MONTH>");
				month = sc.nextInt();
			}

			cal.printCalendar(year, month);
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
