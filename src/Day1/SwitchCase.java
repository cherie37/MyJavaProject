package Day1;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String args[]) {
		int score;
		String Grade = null;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		

		switch (score/10) {
		case 10 :
		    Grade = "A";
			break;
		case 9 :
			Grade = "A";
			break;
		case 8:
			Grade = "B";
			break;
		case 7:
			Grade = "C";
			break;
		case 6:
			Grade = "D";
			break;
		case 5:
			Grade = "F";
			break;
		default:
		    Grade = "F";
			break;
		}

		/*
		if(score>=90 && score<=100){
			Grade = "A";		
		}
		else if(score<=80 && score>=79){
			Grade = "B";		
		}
		else if(score<=70 && score>=69){
			Grade = "C";		
		}
		else if(score<=60 && score>=59){
			Grade = "D";		
		}
		else if(score<=50){
			Grade = "F";		
		}
		*/
		System.out.println(Grade);

	}

}
