package trenning.treesetcomparator;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        Address address = new Address("Minsk", "Uborevicha", 44, 2);
        Address address1 = new Address("Vitebsk", "Centralnaja", 34, 12);
        Address address2 = new Address("Wroclaw", "Hallera", 99, 13);
        Address address3 = new Address("Olesnica", "Wilenska", 12, 1);
        Address address4 = new Address("Opole", "Warshawska", 74, 13);

        //Помещаю все эти адреса в List
        List<Address> addresses = new ArrayList<>(List.of(address, address1, address2, address3, address4));


        Collections.sort(addresses);

        //System.out.println(addresses);

        Comparator<Address> addressComparator = Comparator.comparing(Address::getCity)
                .thenComparing(Address::getStreet)
                .thenComparing(Address::getHouse)
                .thenComparing(Address::getApartment);

        //Еще один способ создать компоратор
        Comparator<Address> lyambdaComparator = (ad1, ad2) -> ad1.getCity().compareTo(ad2.getCity());
        addresses.sort(lyambdaComparator);

        //Collections.sort(addresses, addressComparator);
        System.out.println(addresses);

        Set<Address> addressSet = new TreeSet<>(addressComparator);

    }
}
