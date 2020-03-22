package ykw.calendar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalendarManagement {
	static Scanner sc = new Scanner(System.in);

	public String putYear(String yearday, String command) {
		GetValue get = new GetValue();
		
			System.out.printf("[일정 %s] 날짜를 입력하세요.(2020-01-01)\n>", command.equals("1") ? "등록" : "검색");
			yearday = sc.nextLine();
			String[] yeardays = yearday.split("-");
			int year = Integer.parseInt(yeardays[0]);
			int month = Integer.parseInt(yeardays[1]);
			int day = Integer.parseInt(yeardays[2]);

			while (year < 2020 || month < 1 || month > 12 || day < 1 || day > get.MaxDaysOfMonth(year, month)) {

				System.out.printf("다시입력,\n[일정 %s] 날짜를 입력하세요.(2020-01-01)\n>", command.equals("1") ? "등록" : "검색");
				yearday = sc.nextLine();
				yeardays = yearday.split("-");
				year = Integer.parseInt(yeardays[0]);
				month = Integer.parseInt(yeardays[1]);
				day = Integer.parseInt(yeardays[2]);
			}
			return yearday;
	}

	public void todoList() {
		String command = "", yearday = "", content = "";
		Map<String, String> yc = new HashMap<String, String>();
		String[] contents = {};
		Prompt p = new Prompt();

		System.out.println("+------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| q.종료");
		// System.out.println("| h. 도움말 q.종료");
		System.out.println("+------------------+");

		do {
			System.out.printf("명령(1,2,3,q)\n>");
			command = sc.nextLine();

			while (!command.equals("1") && !command.equals("2") && !command.equals("3") && !command.equals("h")
					&& !command.equals("q")) {
				System.out.printf("%s명령(1,2,3,q)\n>", command.equals("-1") ? "" : "다시입력, ");
				command = sc.nextLine();
			}

			if (command.equals("1")) {

				yearday = putYear(yearday, command);

				System.out.println("일정을 입력하세요.");
				content = sc.nextLine();
				System.out.println("일정이 등록되었습니다.");
				if (yc.containsKey(yearday)) {
					content = yc.get(yearday) + "," + content;
				}
				yc.put(yearday, content);
			}

			if (command.equals("2")) {

				yearday = putYear(yearday, command);

				if (yc.containsKey(yearday)) {
					contents = yc.get(yearday).split(",");
					System.out.printf("%d개의 일정이 있습니다.\n", contents.length);
					for (int i = 0; i < contents.length; i++) {
						System.out.printf("%d. %s\n", i + 1, contents[i]);
					}
				} else {
					System.out.println("일정이 없습니다.");
				}
			}
			if (command.equals("3")) {
				p.runPrompt();
			}
		} while (!command.equals("q"));
		System.out.println("Bye");
	}

}
