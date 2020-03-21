package ykw.calendar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
	static Scanner sc = new Scanner(System.in);
	public void todoList() {
		String command = "", yearday="",content="",search="";
		Map<String, String> yc = new HashMap<String, String>();
		String[] contents= {};
		int year, month, day;
		System.out.println("+------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q.종료");
		System.out.println("+------------------+");
		
		do {
		System.out.printf("명령(1,2,3,h,q)\n>");
		command=sc.nextLine();
		
		if(command.equals("1")) {
			System.out.printf("[일정 등록] 날짜를 입력하세요.(2020-01-01)\n>");
			yearday= sc.nextLine();
	
			/*String[] s=yearday.split("-");
			year=Integer.parseInt(s[0]);
			month=Integer.parseInt(s[1]);
			day=Integer.parseInt(s[2]);
			*/
			
			System.out.println("일정을 입력하세요.");
			content=sc.nextLine();
			System.out.println("일정이 등록되었습니다.");
			if(yc.containsKey(yearday)) {
				content=yc.get(yearday)+","+content;
			}
			yc.put(yearday, content);
			
		}
		if(command.equals("2")) {
			System.out.printf("[일정 검색] 날짜를 입력하세요.(2020-01-01)\n>");
			search= sc.nextLine();
			
			if(yearday.equals(search)) {
				contents=content.split(",");
				System.out.printf("%d개의 일정이 있습니다.\n",contents.length);
				for(int i=0;i<contents.length;i++) {
					System.out.printf("%d. %s\n",i+1,contents[i]);
				}
			}
			
			
			
			
		}
		
			
		
		
		
		}while(!command.equals("q"));
		
		System.out.println("Bye");
		
	}

	public void runPrompt() {
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
//		p.runPrompt();
		
		p.todoList();
	}
}
