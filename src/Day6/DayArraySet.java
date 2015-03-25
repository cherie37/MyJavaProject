package Day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DayArraySet {

	public static void main(String[] args) {

		Set<String> dayList = new HashSet<String>();

		dayList.add("วันจันทร์");
		dayList.add("วันอังคาร");
		dayList.add("วันพุธ");
		dayList.add("วันพฤหัส");
		dayList.add("วันศุกร์");
		dayList.add("วันเสาร์");
		dayList.add("วันอาทิตย์");

		System.out.println("All data is : ");

		/*Iterator<String> iterator = dayList.iterator();
		 * while (iterator.hasNext()) {
		 * 
		 * System.out.println(iterator.next()); }
		 */

		/*
		 * for(String str : dayList){ String element = (String) str;
		 * System.out.println(element);
		 * 
		 * }
		 */

		for (Iterator<String> it = dayList.iterator(); it.hasNext();) {

			System.out.println(it.next());

		}

	}

}
