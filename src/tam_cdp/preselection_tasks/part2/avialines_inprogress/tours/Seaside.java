package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;

public class Seaside extends RelaxPurpose {

	boolean isDivingIncluded;

	public Seaside(int numberOfDays, Food food, Transport transport, boolean isDivingIncluded) {
		super(numberOfDays, food, transport);
		this.isDivingIncluded = isDivingIncluded;
	}
}
