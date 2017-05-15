package tam_cdp.preselection_tasks.part2.avialines_orig.plains;

public abstract class Plane {
	
	protected int cargoCapacity;
	protected int passengerCapacity;
	protected int flightRange;

	protected abstract void fly();
	
	public String getPlaneName(){
		String name = "";
		name = this.getClass().getSimpleName();
		return name;
	};

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public int getFlightRange() {
		return flightRange;
	}

	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}

	
}
