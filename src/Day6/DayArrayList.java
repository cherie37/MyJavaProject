package Day6;

import java.util.*;


public class DayArrayList {

	public static void main(String[] args) {

		List<String> dayList = new ArrayList<String>();

		dayList.add("วันจันทร์");
		dayList.add("วันอังคาร");
		dayList.add("วันพุธ");
		dayList.add("วันพฤหัส");
		dayList.add("วันศุกร์");
		dayList.add("วันเสาร์");
		dayList.add("วันอาทิตย์");

		System.out.println("All data is : ");

		for(int i=0;i<dayList.size();i++){
			System.out.println(dayList.get(i));
		}
	}

}
