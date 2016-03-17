import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by deepdoradla on 17/03/2016.
 */
public class MainTest {

    @Test
    public void testLoadFile()
    {
        String fileToTest = "/Users/deepdoradla/Documents/Cloudwick/JsonParse/data.xml";
        String fileLoaded = Main.loadFile();
        TestCase.assertEquals(fileToTest,fileLoaded);
    }

    @Test
    public void testFileNotNull()
    {
        String fileLoaded = Main.loadFile();
        TestCase.assertNotNull(fileLoaded);
    }

    /*@Test
    public void testEmployeeData()
    {

        //Load test data
        String fileLoaded = Main.loadFile();
        EmployeeData employeeData = Main.extractJsonData(fileLoaded);
        String firstName = "John";
        String lastName = "Smith";
        String age = "25";
        TestCase.assertEquals(firstName, employeeData.getFirstName());
        TestCase.assertEquals(lastName, employeeData.getLastName());
        TestCase.assertEquals(age, employeeData.getAge());

    }*/
}
