package ZooManagementSystem;

public class Penguin extends Animal implements Feedable {

	public Penguin(String name, int age, int energyLevel) {
		super(name, age, energyLevel);
	}

	public void swim(){
		setEnergyLevel(getEnergyLevel()+10);
	}

	@Override
	public void feed(String foodType) throws InvalidFoodException {
		if (!foodType.equalsIgnoreCase("fish")) {
			throw new InvalidFoodException(getName(),foodType);
		}
		else {
			setEnergyLevel(getEnergyLevel()+12);
			if (getEnergyLevel() > 100) {
				setEnergyLevel(100);
			}
		}
	}

	@Override
	public String makeSound() throws LowEnergyException {
		if (getEnergyLevel() < 20) {
			throw new LowEnergyException(getName());
		}
		else {
			return "SQUAWK!";
		}
	}
	
	@Override
	public boolean isHungry() {
		if (getEnergyLevel()<50){
			return true;
		}
		else{
			return false;
		}
	}

}
