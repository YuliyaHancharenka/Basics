package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Tour;

import java.io.FileNotFoundException;
import java.util.List;


public interface TourFactory {

    List<Tour> buildTours() throws FileNotFoundException;

}
