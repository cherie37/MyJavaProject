package Day6;

import java.util.*;


public class DayArrayList {

	public static void main(String[] args) {

		List<String> dayList = new ArrayList<String>();

		dayList.add("�ѹ�ѹ���");
		dayList.add("�ѹ�ѧ���");
		dayList.add("�ѹ�ظ");
		dayList.add("�ѹ�����");
		dayList.add("�ѹ�ء��");
		dayList.add("�ѹ�����");
		dayList.add("�ѹ�ҷԵ��");

		System.out.println("All data is : ");

		for(int i=0;i<dayList.size();i++){
			System.out.println(dayList.get(i));
		}
	}

}
