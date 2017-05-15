package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;

public class Shopping extends OtherPurpose {

boolean taxFreeReturnIncluded;

	public Shopping(int numberOfDays, Food food, Transport transport, boolean taxFreeReturnIncluded) {
		super(numberOfDays, food, transport);
		this.taxFreeReturnIncluded = taxFreeReturnIncluded;
	}

}
