package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee{

    public Manager(String FIO, String position, String phone, BigDecimal salary, LocalDate birthDate) {
        super(FIO, position, phone, salary, birthDate);
    }

    public  void increaseSalary(int bonusValue){
        super.increaseSalary(bonusValue);

    }
    public static void  increaseSalary(List<Employee> employees, int forOverAge, int bonusValue){
        for (Employee employee : employees){
//            if(!(employee instanceof Manager)){
//                if(employee.getAge() > forOverAge){
//                    Manager manager = (Manager) employee;
//                    manager.increaseSalary(bonusValue);
//                }
//            }
            if(employee.getAge() > forOverAge && !(employee instanceof Manager)){
                employee.increaseSalary(bonusValue);
            }
        }

    }
}
