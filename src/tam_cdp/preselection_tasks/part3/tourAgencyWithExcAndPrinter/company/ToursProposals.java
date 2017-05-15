package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.JsonTourFactory;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.SQLiteTourFactory;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.TourFactory;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.XMLTourFactory;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.*;

import java.io.FileNotFoundException;
import java.util.List;

public class ToursProposals {

    List<Tour> tours;

    public ToursProposals() {

        /*Cruise cruise1 = new Cruise(5, Food.ALL_INCLUSIVE, Transport.SHIP, true);
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
        tours.add(therapy2);*/

        // for XML parser
        //TourFactory tourFactory = new XMLTourFactory("D:\\Install\\Java\\Projects\\Basics\\src\\tam_cdp\\preselection_tasks\\part3\\tourAgencyWithExcAndPrinter\\TourData.xml");

        // for DB parser
        TourFactory tourFactory = new SQLiteTourFactory("D:\\Install\\Java\\Projects\\Basics\\src\\tam_cdp\\preselection_tasks\\part3\\tourAgencyWithExcAndPrinter\\TourData.s3db");

       //TourFactory tourFactory = new JsonTourFactory("D:\\ideaprojects\\ideaprojects\\src\\tam_cdp\\preselection_tasks\\part3\\tourAgencyWithExcAndPrinter\\TourData_json.json");


        try {
            tours = tourFactory.buildTours();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (tours.size() < 0) {
            throw new NegativeArraySizeException("List's size can't be negative");
        }
    }

    public ToursProposals(List<Tour> customTours) {
        this();
        tours.addAll(customTours);
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }


}
