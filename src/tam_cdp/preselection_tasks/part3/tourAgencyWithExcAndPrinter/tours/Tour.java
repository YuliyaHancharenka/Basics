package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours;

public abstract class Tour implements Rest {

	protected int numberOfDays;
	protected Food food;
	protected Transport transport;

	public Tour(int numberOfDays, Food food, Transport transport) {
		if (numberOfDays < 1) throw new IllegalArgumentException("Number of Days can't be less than 1");
		if (food == null) throw new NullPointerException("Food pointer can't be null");
		if (transport == null) throw new NullPointerException("Transport pointer can't be null");

		this.numberOfDays = numberOfDays;
		this.food = food;
		this.transport = transport;
	}
	public Tour(){

	}


	public String getTourName(){
		String name = "";
		name = this.getClass().getSimpleName();
		return name;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
}
