import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by deepdoradla on 15/03/2016.
 */
public class Main {



    public static void main(String[] args)
    {   //Load file
        String file = Main.loadFile();

        //Extract Json data
        EmployeeData employeeData = Main.extractJsonData(file);

        //Print the json data constructed from Employee data structure
        System.out.println(employeeData.toString());
        System.out.println(employeeData.address.toString());
        System.out.println(employeeData.getPhoneNumbers());
    }

    public static EmployeeData extractJsonData(String file)
    {
        BufferedReader reader = null;
        //Load the data
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Gson gson = new GsonBuilder().create();
        EmployeeData employeeData = gson.fromJson(reader, EmployeeData.class);

        return employeeData;
    }


    public static String loadFile(){
        String file = "/Users/deepdoradla/Documents/Cloudwick/JsonParse/data.json";

        return file;
    }
}
