package Day6;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayArrayMap {

	public static void main(String[] args) {
		String day;
		Scanner sc = new Scanner(System.in);
		Map<String, String> dayList = new HashMap();
				

		dayList.put("mon", "วันจันทร์");
		dayList.put("tru", "วันอังคาร");
		dayList.put("wed", "วันพุธ");
		dayList.put("thu", "วันพฤหัส");
		dayList.put("fri", "วันศุกร์");
		dayList.put("sat", "วันเสาร์");
		dayList.put("sun", "วันอาทิตย์");

		System.out.print("Enter Key : ");
		day = sc.next();

		System.out.print("-"+dayList.get(day));
		
		
		
		
		/*for (String str : dayList) {
			String element = (String) str;
			System.out.println(element);

		}*/

	}

}
