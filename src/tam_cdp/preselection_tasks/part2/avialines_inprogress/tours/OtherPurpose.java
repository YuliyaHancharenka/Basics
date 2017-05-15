package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;

public class OtherPurpose extends Tour {

	public OtherPurpose(int numberOfDays, Food food, Transport transport) {
		super(numberOfDays, food, transport);
	}

	@Override
	public void rest() {
		System.out.println("I rest with particular purpose.");
	}
}
