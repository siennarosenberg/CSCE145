package ZooManagementSystem;

public abstract class Animal implements Feedable {
	private String name;
	private int age;
	private int energyLevel;
	
	public Animal(String name, int age, int energyLevel) {
		this.name = name;
		this.age = age;
		this.energyLevel = energyLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public abstract String makeSound() throws LowEnergyException;
	
	public String toString() {
		return name + " is " + age + " years old and has " + energyLevel + " energy";
	}
	
}
