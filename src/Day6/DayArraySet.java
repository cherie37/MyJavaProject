package Day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DayArraySet {

	public static void main(String[] args) {

		Set<String> dayList = new HashSet<String>();

		dayList.add("�ѹ�ѹ���");
		dayList.add("�ѹ�ѧ���");
		dayList.add("�ѹ�ظ");
		dayList.add("�ѹ�����");
		dayList.add("�ѹ�ء��");
		dayList.add("�ѹ�����");
		dayList.add("�ѹ�ҷԵ��");

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
