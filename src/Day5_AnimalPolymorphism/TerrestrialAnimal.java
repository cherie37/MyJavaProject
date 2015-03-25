package Day5_AnimalPolymorphism;

public abstract class TerrestrialAnimal extends Animal {

	public void runable() {

	} 
	
	String catagory="TerrestrialAnimal";

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}


}
