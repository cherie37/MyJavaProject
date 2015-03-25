package Day3;

abstract class GeometryArea {

	private float w; // width
	private float h; // height
	private float area;


	public GeometryArea(float w,float h) {
		this.w=w;
		this.h=h;
	}
	
	/*abstract void calArea(){ // abstarct must not body
		setArea(getW() * getH());
		
	}*/
	
	abstract void abClass();
	
	public void calArea(){ 
		setArea(getW() * getH());
		
	}
	
	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getArea() {
		return area;
	}


	public void setArea(float area) {
		this.area = area;
	}
	
	

}
