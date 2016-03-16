/**
 * Created by deepdoradla on 16/03/2016.
 */
public class EmployeeData {
    String firstName;
    String lastName;
    String age;
    Address address;

    @Override
    public String toString() {
        return "EmployeeData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }

    class Address{
        String streetAddress;
        String city;
        String state;
        String postalCode;

        @Override
        public String toString() {
            return "Address{" +
                    "streetAddress='" + streetAddress + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", postalCode='" + postalCode + '\'' +
                    '}';
        }
    }



}
