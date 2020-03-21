package ykw.calendar;

public class GetValue {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static GetValue get = new GetValue();

	// 윤년
	public boolean LeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int MaxDaysOfMonth(int year, int month) {
		if (get.LeapYear(year) && month == 2)
			return MAX_DAYS[month - 1] + 1;

		return MAX_DAYS[month - 1];
	}

	// 1년1월1일 월
	// 전체 일수%7이 0이면 월
	public int Weekday(int year, int month) {
		int allday = 0, day = 0;
		for (int i = 1; i <= year; i++) {
			allday += day;
			day = (get.LeapYear(i)) ? 366 : 365;
		}
		int monthday = 0;
		for (int i = 1; i <= month; i++) {
			allday += monthday;
			monthday = get.MaxDaysOfMonth(year, i);
		}
		return allday % 7;
	}

}
