package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;


import com.google.gson.Gson;

import com.google.gson.internal.Primitives;
import com.google.gson.stream.JsonReader;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Cruise;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Tour;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonTourFactory extends AbstractTourFactory {
    private String sourcePath;

    public JsonTourFactory(String sourcePath) {
        this.sourcePath = sourcePath;
    }
  /*  static String json = "[\n" +
            "      {\n" +
            "        \"tourName\": \"Cruise\",\n" +
            "        \"numberOfDays\": 5,\n" +
            "        \"food\": \"ALL_INCLUSIVE\",\n" +
            "        \"transport\": \"SHIP\",\n" +
            "        \"isBusinessClass\": \"true\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Cruise\",\n" +
            "        \"numberOfDays\": 10,\n" +
            "        \"food\": \"ONLY_BED\",\n" +
            "        \"transport\": \"SHIP\",\n" +
            "        \"isBusinessClass\": \"false\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Seaside\",\n" +
            "        \"numberOfDays\": 7,\n" +
            "        \"food\": \"BEDAND_BREAKFAST\",\n" +
            "        \"transport\": \"BUS\",\n" +
            "        \"isDivingIncluded\": \"false\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Seaside\",\n" +
            "        \"numberOfDays\": 14,\n" +
            "        \"food\": \"ALL_INCLUSIVE\",\n" +
            "        \"transport\": \"PLANE\",\n" +
            "        \"isDivingIncluded\": \"true\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Shopping\",\n" +
            "        \"numberOfDays\": 3,\n" +
            "        \"food\": \"BEDAND_BREAKFAST\",\n" +
            "        \"transport\": \"BUS\",\n" +
            "        \"taxFreeReturnIncluded\": \"true\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Shopping\",\n" +
            "        \"numberOfDays\": 2,\n" +
            "        \"food\": \"ONLY_BED\",\n" +
            "        \"transport\": \"TRAIN\",\n" +
            "        \"taxFreeReturnIncluded\": \"false\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Therapy\",\n" +
            "        \"numberOfDays\": 20,\n" +
            "        \"food\": \"ALL_INCLUSIVE\",\n" +
            "        \"transport\": \"PLANE\",\n" +
            "        \"massageIncluded\": \"true\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"tourName\": \"Therapy\",\n" +
            "        \"numberOfDays\": 30,\n" +
            "        \"food\": \"BEDAND_BREAKFAST\",\n" +
            "        \"transport\": \"BUS\",\n" +
            "        \"massageIncluded\": \"false\"\n" +
            "      }\n" +
            "    ]";*/



    @Override
    public List<Tour> buildTours() throws FileNotFoundException {
        Gson gson = new Gson();
        List<Tour> toursList = new ArrayList<>();

        JsonReader reader = new JsonReader(new FileReader("D:\\ideaprojects\\ideaprojects\\src\\tam_cdp\\preselection_tasks\\part3\\tourAgencyWithExcAndPrinter\\TourData_json.json"));
        Cruise[] tours = gson.fromJson(reader, Cruise[].class);

        for (int i = 0; i < tours.length; i++) {
            toursList.add(tours[i]);
        }
        return toursList;
    }
}

