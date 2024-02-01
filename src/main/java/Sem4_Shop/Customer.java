package Sem4_Shop;

import java.time.LocalDate;

public class Customer {
    private String FIO;
    private LocalDate dateOfBirth;
    private String phone;
    private Gender gender;

    public Customer(String FIO, LocalDate dateOfBirth, String phone, Gender gender) {
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
    }
    public String getFIO() {
        return FIO;
    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "FIO='" + FIO + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                '}';
    }

    enum Gender{
        MALE, FEMALE
    }
}
