import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by deepdoradla on 15/03/2016.
 */
public class Main {


    static String file = "/Users/deepdoradla/Documents/Cloudwick/JsonParse/data.json";
    public static void main(String[] args)
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

        System.out.println(employeeData.toString());
        System.out.println(employeeData.address.toString());
    }
}
