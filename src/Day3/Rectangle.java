package Day3;

public class Rectangle extends GeometryArea {
	public Rectangle(float w, float h) {
		super(w, h);
	}
	
	
	public void calArea(){ // override calArea() of GeometryClass
		setArea(getW() * getH());
		
	}


	@Override
	void abClass() {
		// TODO Auto-generated method stub
		
	}

	

}
