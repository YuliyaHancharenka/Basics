package tam_cdp.preselection_tasks.part2.avialines_inprogress.company;

import java.util.ArrayList;
import java.util.List;

import tam_cdp.preselection_tasks.part2.avialines_inprogress.tours.*;

public class ToursProposals{

    ArrayList<Tour> tours;

    public ToursProposals() {

        Cruise cruise1 = new Cruise(5, Food.ALL_INCLUSIVE, Transport.SHIP, true);
        Cruise cruise2 = new Cruise(10, Food.ONLY_BED, Transport.SHIP, false);
        Seaside seaside1 = new Seaside(7, Food.BEDAND_BREAKFAST, Transport.BUS, false);
        Seaside seaside2 = new Seaside(14, Food.ALL_INCLUSIVE, Transport.PLANE, true);
        Shopping shopping1 = new Shopping(3, Food.BEDAND_BREAKFAST, Transport.BUS, false);
        Shopping shopping2 = new Shopping(2, Food.ONLY_BED, Transport.TRAIN, true);
        Therapy therapy1 = new Therapy(20, Food.ALL_INCLUSIVE, Transport.PLANE, false);
        Therapy therapy2 = new Therapy(30, Food.BEDAND_BREAKFAST, Transport.BUS, true);

        tours = new ArrayList<>();

        tours.add(cruise1);
        tours.add(cruise2);
        tours.add(seaside1);
        tours.add(seaside2);
        tours.add(shopping1);
        tours.add(shopping2);
        tours.add(therapy1);
        tours.add(therapy2);
    }

    public ToursProposals(List<Tour> customTours) {
        this();
        tours.addAll(customTours);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }


}
