package Day1;
import java.util.Scanner;

public class ContinueStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str1 = new String("A");
		String str2 = new String("A");		
		// a = sc.nextInt();
		int[] Num1 = new int[100];
		float Sum = 0;
		float SumEven = 0;
		float SumOod = 0;
		float AvgEven =0;
		float AvgOod =0;

		/*for (int value : Num1) {
		if (value == 5)
			return;
		System.out.println(value);
	}*/
		
		for(int i=0;i<100;i++){
			Num1[i]=i+1;				
		}
		
		for(int Number:Num1){
			if(Number%2==0){
				SumEven=SumEven+Number;
				System.out.println("SumEven : "+SumEven);
				AvgEven=SumEven/(Num1.length/2);
			}
			else{
				SumOod=SumOod+Number;
				System.out.println("SumOod : "+SumOod);
				AvgOod=SumOod/(Num1.length/2);
			}
			
			/*for(int Number1:Num1){
			if(Number%2==1){
				SumOod=SumOod+Number;
				System.out.println("SumOod : "+SumOod);
			}
			//Sum2=Sum2+Number;
			}*/
			
			//Avg=Sum2/Num1.length;
			//System.out.println("Sum2 : "+Sum2);
			
		}
		
		
		/*for(int i=1;i<=100;i++){
			Sum=Sum+i;
			Avg=Sum/100;
			System.out.println("Sum : "+Sum);
			
		
		}*/
		System.out.println("AvgEven :"+AvgEven);
		System.out.println("AvgOod :"+AvgOod);

	}
}
