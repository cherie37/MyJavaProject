package Day3;

public class Triangle extends GeometryArea {

	public Triangle(float w, float h) {
		super(w, h);
	}
	

	public void calArea(){ // override calArea() of GeometryClass
		this.setArea((this.getW() * this.getH())/2);
		
	}
	/*public Triangle(float w, float h) {

		
		//area = (w * h) / 2;
		//System.out.println("Triangle area : " + area);
	}
	
	public float calArea(float w,float h){
		area = (w*h)/2;
		return area;
	}*/


	@Override
	void abClass() {
		// TODO Auto-generated method stub
		
	}

	

}
