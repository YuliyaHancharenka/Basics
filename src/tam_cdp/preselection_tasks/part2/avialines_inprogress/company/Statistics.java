package tam_cdp.preselection_tasks.part2.avialines_inprogress.company;

import tam_cdp.preselection_tasks.part2.avialines_inprogress.tours.OtherPurpose;
import tam_cdp.preselection_tasks.part2.avialines_inprogress.tours.RelaxPurpose;
import tam_cdp.preselection_tasks.part2.avialines_inprogress.tours.Tour;

import java.util.NavigableMap;
import java.util.TreeMap;


public class Statistics {
    ToursProposals toursProp = new ToursProposals();

    public ToursProposals getToursProp() {
        return toursProp;
    }

    public void setToursProp(ToursProposals toursProp) {
        this.toursProp = toursProp;
    }

    protected String getRelaxToursProposals() {
        String result = "";
        for (Tour t : toursProp.getTours()) {
            if (t instanceof RelaxPurpose) {
                result += t.getTourName() + ", ";
            }
        }
        return result;
    }

    protected String getOtherPurposeProposals() {
        String result = "";
        for (Tour t : toursProp.getTours()) {
            if (t instanceof OtherPurpose) {
                result += t.getTourName() + ", ";
            }
        }
        return result;
    }

    protected TreeMap<Integer, String> sortByNumberOfDaysAsc() {
        TreeMap<Integer, String> sortedToursAsc = new TreeMap<>();
        for (Tour t : toursProp.getTours()) {
            sortedToursAsc.put(t.getNumberOfDays(), t.getTourName());
        }
        return sortedToursAsc;
    }

    protected NavigableMap<Integer, String> sortByNumberOfDaysDesc() {
        TreeMap<Integer, String> sortedTours = new TreeMap<>();
        NavigableMap<Integer, String> sortedToursDesc = null;
        for (Tour t : toursProp.getTours()) {
            sortedTours.put(t.getNumberOfDays(), t.getTourName());
            sortedToursDesc = sortedTours.descendingMap();
        }
        return sortedToursDesc;
    }
}
