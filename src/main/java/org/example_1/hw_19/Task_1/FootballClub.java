package org.example_1.hw_19.Task_1;



import java.util.Objects;

// когда класс сожержит данные об одном клубе, принято его именовать в единственном числе, переименуй плиз
public class FootballClub {

    private String club;
    private String country;
    private String city;

    public FootballClub(String club, String country, String city) {
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
        FootballClub that = (FootballClub) o;
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
