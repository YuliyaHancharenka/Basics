package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours;

public class Therapy extends OtherPurpose {
	boolean massageIncluded;

	public Therapy(int numberOfDays, Food food, Transport transport, boolean massageIncluded) {
		super(numberOfDays, food, transport);
		this.massageIncluded = massageIncluded;
	}
}
