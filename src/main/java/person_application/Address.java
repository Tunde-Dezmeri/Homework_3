package person_application;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String location;
    private String streetName;
    private int streetNumber;
    private int apartmentNumber;


    public Address(String location, String streetName, int streetNumber, int apartmentNumber) {
        this.location = location;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public String toString() {
        return (getLocation() + " " + getStreetName() + " " + getStreetNumber() + " " + getApartmentNumber());
    }

    //just an example to iterate in the list
    public static void main(String... args) {
        Address firstAddress = new Address("Cluj-Napoca", "Anina", 10, 20);
        Address secondAddress = new Address("Cluj-Napoca", "Ciresilor", 11, 12);
        List<Address> addressList = new ArrayList<>();
        addressList.add(firstAddress);
        addressList.add(secondAddress);

        for (Address address : addressList) {
            System.out.println(address);
        }
    }
}
