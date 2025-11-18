package ZooManagementSystem;

public class Main {
	public static void main(String[] args) {	
		Zoo zooList = new Zoo();
		
		Lion Leo = new Lion("Leo", 7, 40);
		Elephant Eli = new Elephant("Eli", 3, 0);
		Penguin Penny = new Penguin("Penny", 1, 50);

		zooList.addAnimal(Leo);
		zooList.addAnimal(Eli);
		zooList.addAnimal(Penny);

		System.out.println(Leo.toString());
		System.out.println(Eli.toString());
		System.out.println(Penny.toString());

		try {
			zooList.feedAllAnimals("meat");
		}
		catch (InvalidFoodException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			zooList.feedAllAnimals("fish");
		}
		catch (InvalidFoodException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			zooList.makeAllSoundsIfEnergetic();
		} catch (LowEnergyException e) {
			System.out.println(e.getMessage());
		}	
	}
}
