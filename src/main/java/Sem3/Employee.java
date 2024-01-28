package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;

    public Employee(String FIO, String position, String phone, BigDecimal salary, LocalDate birthDate) {
        this.FIO = FIO;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getFIO() {
        return FIO;
    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    @Override
    public String toString() {

        return String.format("%s - %s, phone - %s, salary - %s, age - %s", FIO, position,phone, salary, this.getAge());
    }

    public void printInfo(){
        System.out.println(toString());
    }

    public void increaseSalary(int value){
        this.salary = salary.add(BigDecimal.valueOf(value));

    }

    public int compare(LocalDate date){
        return birthDate.compareTo(date);
    }
}
