package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class XMLTourFactory extends AbstractTourFactory {

    private String sourcePath;

    public XMLTourFactory(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    @Override
    public List<Tour> buildTours() {

        List<Tour> toursList = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(sourcePath);
            doc.getDocumentElement().normalize();
            NodeList tourNodes = doc.getElementsByTagName("tour");

            for (int i = 0; i < tourNodes.getLength(); i++) {
                Node tourNode = tourNodes.item(i);
                Element tourElement = (Element) tourNode;

                if (tourNode.getNodeType() == Node.ELEMENT_NODE) {

                    NodeList tourDetailsNodes = tourElement.getChildNodes();

                    Tour newTour = null;
                    Integer numberOfDays = null;
                    Food food = null;
                    Transport transport = null;
                    Boolean customOption = false;

                    for (int j = 0; j < tourDetailsNodes.getLength(); j++) {
                        Node tourDetailsNode = tourDetailsNodes.item(j);

                        if (tourDetailsNode.getNodeType() == Node.ELEMENT_NODE) {
                            if (tourDetailsNode.getNodeName().equals("numberOfDays")) {
                                numberOfDays = Integer.parseInt(tourDetailsNode.getTextContent());
                            } else if (tourDetailsNode.getNodeName().equals("food")) {
                                food = Food.valueOf(tourDetailsNode.getTextContent());
                            } else if (tourDetailsNode.getNodeName().equals("transport")) {
                                transport = Transport.valueOf(tourDetailsNode.getTextContent());
                            } else if (tourDetailsNode.getNodeName().equals("customOption")) {
                                customOption = Boolean.parseBoolean(tourDetailsNode.getTextContent());
                            }

                            String tourName = tourElement.getAttribute("tourName");
                            if (tourName != null && numberOfDays != null && food != null && transport != null) {
                                newTour = buildTourByOptions(tourName, numberOfDays, food, transport, customOption);
                            }
                        }
                    }
                    if (newTour != null) {
                        toursList.add(newTour);
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return toursList;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
}
