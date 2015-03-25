package Day8;

public class EnumDemo {

	public static void main(String[] args) {

		String day = getDay("1");
		//System.out.println(getDay(day));

		/*for (Day objDay : Day.values()) {
			System.out.println(objDay.toString());
		}*/
		
		/*Day dayEnum = Day.FRIDAY;		
		System.out.println(Day.FRIDAY);
		System.out.println(dayEnum);
		System.out.println(dayEnum.getValue());*/
		
		
		Day[] days = Day.values();		
		for(Day dayList : days){
			System.out.println(dayList);
		}
		
	}

	public static String getDay(String day) {
		if (day.equals("1")) {
			return "Sunday";
		} else if (day.equals("2")) {
			return "Monday";
		} else if (day.equals("3")) {
			return "Tuesday";
		} else if (day.equals("4")) {
			return "Wednesday";
		} else if (day.equals("5")) {
			return "Thursday";
		} else if (day.equals("6")) {
			return "Friday";
		} else if (day.equals("7")) {
			return "Saturday";
		} else {
			return "Don't know";
		}
	}
		
	public static String getDay(Day day) {
		if (day == day.SUNDAY) {
			return "Today is Sunday";
		} else if (day == day.MONDAY) {
			return "Today is Monday";
		} else if (day == day.TUESDAY) {
			return "Today is Tuesday";
		} else if (day == day.WEDNESDAY) {
			return "Today is Wednesday";
		} else if (day == day.THURSDAY) {
			return "Today is Thursday";
		} else if (day == day.FRIDAY) {
			return "Today is Friday";
		} else if (day == day.SATURDAY) {
			return "Today is Saturday";
		} else {
			return "Don't know";
		}
	

	}
	
	
}

enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	private int value;

	private Day(Integer value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
