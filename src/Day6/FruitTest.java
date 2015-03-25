package Day6;

import java.util.ArrayList;
import java.util.List;

public class FruitTest {

	public static void main(String[] args) {
 
		List<Fruit> fruitType = new ArrayList<Fruit>();
		
		fruitType.add(new Apple("Apple", "red"));
		fruitType.add(new Papaya("Papaya", "orange"));
		fruitType.add(new Apple("Banana", "yellow"));
		fruitType.add(new Apple("Orange", "orange"));

		/*
		 * ArrayList<String> fruitColor = new ArrayList<>();
		 * fruitColor.add("red"); fruitColor.add("orange");
		 * fruitColor.add("yellow"); fruitColor.add("orange");
		 * 
		 * Fruit fr1 = new Apple(fruitType.get(0), fruitColor.get(0)); Fruit fr2
		 * = new Papaya(fruitType.get(1), fruitColor.get(1));
		 * 
		 * Fruit(fr1); Fruit(new Banana(fruitType.get(2), fruitColor.get(2)));
		 * Fruit(new Orange(fruitType.get(3), fruitColor.get(3)));
		 */

		for (Fruit fr : fruitType) { // Fruit is type of fruitType --fruitType.size
			//Fruit(fr);
			System.out.println("Fruit name is "+fr.getName()+" And color is "+fr.getColor());
		}
	
	}

	/*private static void Fruit(Fruit Fru) {
		Fru.Fruit();

	}*/

}
