package trenning.treesetcomparator;


import org.apache.commons.math3.distribution.IntegerDistribution;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Address implements Comparable<Address>  {

    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(String city, String street, int house, int apartment) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return house == address.house && apartment == address.apartment && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, apartment);
    }
//Если мы считаем что обьект больше чем о, мы возвращаем единицу. Если обьект меньше чем этот адрес то мы возвращаем единицу. Иесли эти обьекты равны то мы возвращаем ноль
    @Override
    public int compareTo(@NotNull Address address) {
        int result = this.city.compareTo(address.getCity());
        if(result != 0) {
            return result;
        }
        result = this.street.compareTo(address.getStreet());
        if (result != 0) {
            return result;
        }
        result = Integer.compare(this.house, address.getHouse());
        if (result != 0) {
            return result;
        }
        return this.city.compareTo(address.getCity());
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", apartment=" + apartment +
                '}';
    }
}
