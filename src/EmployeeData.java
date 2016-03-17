import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepdoradla on 16/03/2016.
 */
public class EmployeeData {
    private String firstName;
    private String lastName;
    private String age;
    Address address;
    List<PhoneNumbers> phoneNumbers = new ArrayList<PhoneNumbers>();

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public EmployeeData() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public EmployeeData(String firstName, String lastName, String age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

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

    class PhoneNumbers{
        String type;
        String number;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }


}


