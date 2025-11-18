package ZooManagementSystem;

public class InvalidFoodException extends Exception {
	private String animal;
	private String food;
	
	public InvalidFoodException(String animal, String food) {
		super("Error: " + animal + " cannot eat " + food + "");
		this.animal = animal;
		this.food = food;
	}

	public String getAnimal() {
		return animal;
	}

	public String getFood() {
		return food;
	}

}