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
				

		dayList.put("mon", "�ѹ�ѹ���");
		dayList.put("tru", "�ѹ�ѧ���");
		dayList.put("wed", "�ѹ�ظ");
		dayList.put("thu", "�ѹ�����");
		dayList.put("fri", "�ѹ�ء��");
		dayList.put("sat", "�ѹ�����");
		dayList.put("sun", "�ѹ�ҷԵ��");

		System.out.print("Enter Key : ");
		day = sc.next();

		System.out.print("-"+dayList.get(day));
		
		
		
		
		/*for (String str : dayList) {
			String element = (String) str;
			System.out.println(element);

		}*/

	}

}
