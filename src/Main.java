import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepdoradla on 15/03/2016.
 */
public class Main {



    public static void main(String[] args)
    {   //Load file
        String file = Main.loadFile();

        //Extract Json data
        Main.extractJsonData(file);

        //Print the json data constructed from Employee data structure
        //System.out.println(employeeData.toString());
        //System.out.println(employeeData.address.toString());
        //System.out.println(employeeData.getPhoneNumbers());
    }

    public static void extractJsonData(String file)
    {
        BufferedReader reader = null;
        DocumentBuilder builder = null;

        List<EmployeeData> employeeDataList = new ArrayList<EmployeeData>();
        EmployeeData employeeData;

        //Load the data
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
            //Pase XML data using DOM parser
            Document document = builder.parse(file);
            NodeList nodeList = document.getDocumentElement().getChildNodes();


            System.out.println("Node element" + nodeList.getLength());
            for(int i=0; i<nodeList.getLength();i++)
            {
                Node node = nodeList.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) node;
                    String firstName = element.getElementsByTagName("Firstname")
                            .item(0).getChildNodes().item(0).getNodeValue();
                    String lastName = element.getElementsByTagName("Lastname")
                            .item(0).getChildNodes().item(0).getNodeValue();
                    String age = element.getElementsByTagName("Age")
                            .item(0).getChildNodes().item(0).getNodeValue();

                    System.out.println("First name is " + firstName);

                    employeeDataList.add(new EmployeeData(firstName, lastName, age));

                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        EmployeeData employeeData1 = new EmployeeData();
        //return employeeData;
        System.out.println(employeeData1.toString());
        //return employeeData;

        for(int j=0; j<employeeDataList.size(); j++)
        {
            System.out.println("Employee firstname " + employeeDataList.toString());
        }
    }




    public static String loadFile(){
        String file = "/Users/deepdoradla/Documents/Cloudwick/JsonParse/data.xml";

        return file;
    }
}
