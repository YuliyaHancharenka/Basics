package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours;

public class Cruise extends RelaxPurpose {
    boolean isBusinessClass;

    public Cruise(int numberOfDays, Food food, Transport transport, boolean isBusinessClass) {
        super(numberOfDays, food, transport);
        this.isBusinessClass = isBusinessClass;
    }

}
