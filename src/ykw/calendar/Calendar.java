package ykw.calendar;

public class Calendar {

	public void printCalendar(int year, int month) {
		GetValue get = new GetValue();
		int max = get.MaxDaysOfMonth(year, month);

		// 제목
		System.out.printf("    <<%3d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		// 달력찍기
		int num = 0;
		for (int i = 0; i <= get.Weekday(year, month); i++) {
			if (get.Weekday(year, month) == 6)
				break;

			System.out.printf("   ");
			num++;
		}

		for (int i = 1; i <= max; i++) {
			if ((i + num) % 7 == 0)
				System.out.printf("%3d\n", i);
			else
				System.out.printf("%3d", i);
		}
		System.out.println();
	}

}
