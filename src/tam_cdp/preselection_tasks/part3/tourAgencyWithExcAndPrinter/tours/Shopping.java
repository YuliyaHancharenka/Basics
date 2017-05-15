package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours;

public class Shopping extends OtherPurpose {

boolean taxFreeReturnIncluded;

	public Shopping(int numberOfDays, Food food, Transport transport, boolean taxFreeReturnIncluded) {
		super(numberOfDays, food, transport);
		this.taxFreeReturnIncluded = taxFreeReturnIncluded;
	}

}
