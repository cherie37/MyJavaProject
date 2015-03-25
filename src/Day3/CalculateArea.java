package Day3;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		float w, h;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input width and height : ");
			w = sc.nextFloat();
			h = sc.nextFloat();

			Rectangle rec = new Rectangle(w, h);
			Triangle tri = new Triangle(w, h);
			rec.calArea();
			tri.calArea();

			System.out.println("w  : " + rec.getW());
			System.out.println("h  : " + rec.getH());
			System.out.println("Area Rec : " + rec.getArea());
			System.out.println("Area Tri : " + tri.getArea());
		}
		/*
		 * Triangle tri = new Triangle(w,h);
		 * System.out.println("Area2 printBycalAreaClass : "+tri.calArea(w, h));
		 * 
		 * System.out.println("width and height : "+rec.getW()+" "+rec.getH());
		 */
	}

}
