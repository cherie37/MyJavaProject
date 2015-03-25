package Day8_Anonymous;

public class People {

	DoubleClick doubleClick;

	public DoubleClick getDoubleClick() {
		return doubleClick;
	}

	public void setDoubleClick(DoubleClick doubleClick) {
		this.doubleClick = doubleClick;
	}
	
	public void doSomething() {
		doubleClick.doubleClick();
	}
	
	public static void main(String[] args) {
		People people  = new People();
		people.setDoubleClick(new DoubleClick() {
			
			@Override
			public void doubleClick() {
				System.out.println("People double click..");
				
			}
		});
		people.doSomething();
	}
	
}
