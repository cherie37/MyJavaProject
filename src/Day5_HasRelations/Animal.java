package Day5_HasRelations;

abstract class Animal {

	private String name;
	private String color;
	private String size;
	private String sex;

	Animal() {

	}

	Animal(String name, String color, String size, String sex) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public abstract void move();

	public abstract void eat();

	/*
	 * public Animal(String name, String color, String size, String sex) {
	 * this.name = name; this.color = color; this.size = size; this.sex = sex; }
	 */

}
