package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Food;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Tour;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Transport;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLiteTourFactory extends AbstractTourFactory {

    String databaseName;

    public SQLiteTourFactory(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public List<Tour> buildTours() {

        List<Tour> toursList = new ArrayList<>();

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + databaseName);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from TourData");

            while (rs.next()) {

                Tour newTour = null;

                String tourName = null;
                Integer numberOfDays = null;
                Food food = null;
                Transport transport = null;
                Boolean customOption = false;

                tourName = rs.getString("tourName");
                numberOfDays = rs.getInt("numberOfDays");
                food = Food.valueOf(rs.getString("food"));
                transport = Transport.valueOf(rs.getString("transport"));
                customOption = rs.getBoolean("customOption");

                if (tourName != null && numberOfDays != null && food != null && transport != null) {
                    newTour = buildTourByOptions(tourName, numberOfDays, food, transport, customOption);

                    if (newTour != null) {
                        toursList.add(newTour);
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return toursList;
    }
}
