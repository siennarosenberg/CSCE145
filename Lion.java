package ZooManagementSystem;

public class Lion extends Animal implements Feedable {

	public Lion(String name, int age, int energyLevel) {
		super(name, age, energyLevel);
	}

	@Override
	public void feed(String foodType) throws InvalidFoodException {
		if (!foodType.equalsIgnoreCase("meat")) {
			throw new InvalidFoodException(getName(),foodType);
		}
		else {
			setEnergyLevel(getEnergyLevel()+20);
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
			return "ROAR!";
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
