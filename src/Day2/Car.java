package Day2;
import java.util.Scanner;

public class Car {
	String carName;
	String carColor;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}


	String carBrand;
	String carBreak;
	int carWheel;
	

	public Car(String color,String brand,String break1,int wheel) {
		 carColor=color;
		 carBrand=brand;
		 carBreak=break1;
		 carWheel=wheel;
	}

	public Car(String carBrand) {
		this.carBrand = carBrand;
	}

	public void drive() {
		System.out.println("Driving");
	}

	public void carBreak() {
		System.out.println("Break");
	}

	public void addFuel(int oil) {// or fuel
		if (oil >= 30) {
			System.out.println("Fuel is Full");
		} else
			System.out.println("Fuel is Not Full");

	}

	public String getBrand() {
		//carBrand = brand;
		return carBrand;

	}

	
	 public void getCarDetail() {
		 
		System.out.println("carColor: "+carColor+'\n'+"carBrand "+carBrand+'\n'+"carBreak "+carBreak+'\n'+"carWheel "+carWheel+'\n');
			//return carColor;
	 }
	 
	  
	 
	public static void main(String[] args) {
		int oil;
		Scanner sc = new Scanner(System.in);
		Car car1 = new Car("Honda");
		System.out.println("Car1 brand : "+car1.carBrand);
		
		
		Car car2 = new Car("Red","Mazda","Break",4);
		System.out.println("How many oil : ");
		oil=sc.nextInt();
		car1.drive();
		car2.carBreak();
		car2.setCarName("CAR_77");
		System.out.println("Car (get)Name : "+car2.getCarName()); 
		car2.setCarName("CAR_88");//new name
		System.out.println("Car (get)Name : "+car2.getCarName());
		
		System.out.println("Car brand : "+car2.getBrand());
		car2.getCarDetail();
		
		car2.addFuel(oil);
		
		
	}
}
