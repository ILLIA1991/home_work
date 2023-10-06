package org.example_1.hw_23.Task_1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example_1.hw_23.Task_2.OnlyDigits;

import java.util.Objects;

public class AccountInformation {


    private String name;

    private String Surname;

    @Email
    private String email;
    @JsonIgnore
    @OnlyDigits
    private int phoneNumber;

    public AccountInformation() {
    }

    public AccountInformation(String name, String surname, String email, Integer phoneNumber) {
        this.name = name;
        Surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInformation that = (AccountInformation) o;
        return phoneNumber == that.phoneNumber && Objects.equals(name, that.name) && Objects.equals(Surname, that.Surname) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "AccountInformation{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
