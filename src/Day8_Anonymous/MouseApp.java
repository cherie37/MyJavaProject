package Day8_Anonymous;

import java.awt.List;

public class MouseApp {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		mouse.click();

		Mouse mouseAnonymous = new Mouse() { // this is inner class
			public void click() {
				System.out.println("Anonymous click mouse...");
			}
		};
		mouseAnonymous.click();
		
		DoubleClick doubleClick = new DoubleClick() {
			
			@Override
			public void doubleClick() {
				System.out.println("DoubleClick : Click Click...");

			}
		};

		//interface can not new class Abstract too
		//But 
		
		doubleClick.doubleClick();
		DoubleClickImplement dc = new DoubleClickImplement(); // delete
		dc.doubleClick(); // delete
		//DoubleClick doubleClick = new DoubleClick() { // class DoubleClickImplemet implements DoubleClick

			/*@Override
			public void doubleClick() {
				System.out.println("DoubleClick : Click Click...");

			}
		};*/
 
		//doubleClick.doubleClick();
		
		

	}
}

interface DoubleClick {
	public void doubleClick();
	
	//public void aa() ;
}

class DoubleClickImplement implements DoubleClick{
	@Override
	public void doubleClick() {
		System.out.println("DoubleClick : Click Click...");

	}
}
