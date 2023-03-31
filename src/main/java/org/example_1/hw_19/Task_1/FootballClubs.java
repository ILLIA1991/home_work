package org.example_1.hw_19.Task_1;

/* Task 1
Создайте класс для описания футбольного клуба, в нем должны содержаться название клуба, страна, и город.
В классе Application создайте список клубов из разных стран.
Имея этот список клубов, в консоль в алфавитном порядке их страны. Страны не должны повторяться.
 */

import java.util.Objects;

public class FootballClubs {

    private String club;
    private String country;
    private String city;

    public FootballClubs(String club, String country, String city) {
        this.club = club;
        this.country = country;
        this.city = city;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClubs that = (FootballClubs) o;
        return Objects.equals(club, that.club) && Objects.equals(country, that.country) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club, country, city);
    }

    @Override
    public String toString() {
        return "FootballClubs{" +
                "club='" + club + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
