package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.*;


abstract class AbstractTourFactory implements TourFactory {


    Tour buildTourByOptions(String tourName, Integer numberOfDays, Food food, Transport transport, boolean customOption) {

        Tour newTour = null;

        if (tourName != null && numberOfDays != null && food != null && transport != null) {
            switch (tourName) {
                case "Cruise":
                    newTour = new Cruise(numberOfDays, food, transport, customOption);
                    break;
                case "Seaside":
                    newTour = new Seaside(numberOfDays, food, transport, customOption);
                    break;
                case "Shopping":
                    newTour = new Shopping(numberOfDays, food, transport, customOption);
                    break;
                case "Therapy":
                    newTour = new Therapy(numberOfDays, food, transport, customOption);
                    break;
            }
        }
        return newTour;
    }
}
