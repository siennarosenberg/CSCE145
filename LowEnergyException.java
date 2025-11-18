package ZooManagementSystem;

public class LowEnergyException extends Exception {
	private String animal;
	
	public LowEnergyException(String animal) {
		super("Warning: " + animal + " is too tired to make a sound!");
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

}