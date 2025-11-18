package ZooManagementSystem;

public class Zoo {
	private Animal[] animals;
	private int animalCount;
	
	public Zoo() {
		animals = new Animal[10];
		animalCount = 0;
	}
	
	public void addAnimal(Animal animal) {
		animals[animalCount] = animal;
		animalCount ++;
	}
	
	public void feedAllAnimals(String foodType) throws InvalidFoodException {
		for (int i=0; i<animalCount; i++) {
			try {
				animals[i].feed(foodType);
				System.out.println("Feeding " + animals[i].getName() + " with " + foodType + "... Success! Energy: " + animals[i].getEnergyLevel());
			}
			catch (InvalidFoodException e) {
				System.out.println(e.getMessage() + "!");
			}
		}
	}
	
	public void makeAllSoundsIfEnergetic() throws LowEnergyException{
		for (int i=0; i<animalCount; i++) {
			try {
				animals[i].makeSound();
				System.out.println(animals[i].getName() + " says: " + animals[i].makeSound());
			}
			catch (LowEnergyException e) {
				System.out.println(e.getMessage());
			}
		}
	}	
}
