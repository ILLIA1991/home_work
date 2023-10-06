package org.example_1.hw_27.Task_1;

import java.time.LocalDate;
import java.util.Objects;

public class Abonent {

    private String name;
    private String surname;
    private String contractId;
    private LocalDate dateOfBirth;
    private LocalDate contractDate;
    private Boolean isVip;
    private String city;

    public Abonent(String name, String surname, String contractId, LocalDate dateOfBirth, LocalDate contractDate, Boolean isVip, String city) {
        this.name = name;
        this.surname = surname;
        this.contractId = contractId;
        this.dateOfBirth = dateOfBirth;
        this.contractDate = contractDate;
        this.isVip = isVip;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Boolean getVip() {
        return isVip;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
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
        Abonent abonent = (Abonent) o;
        return Objects.equals(name, abonent.name) && Objects.equals(surname, abonent.surname) && Objects.equals(contractId, abonent.contractId) && Objects.equals(dateOfBirth, abonent.dateOfBirth) && Objects.equals(contractDate, abonent.contractDate) && Objects.equals(isVip, abonent.isVip) && Objects.equals(city, abonent.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, contractId, dateOfBirth, contractDate, isVip, city);
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractId='" + contractId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contractDate=" + contractDate +
                ", isVip=" + isVip +
                ", city='" + city + '\'' +
                '}';
    }
}
