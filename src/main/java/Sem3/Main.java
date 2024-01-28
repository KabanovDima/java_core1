package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan Petrov",
                "devops",
                "+791233333",
                BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1));

        Employee employee2 = new Employee("Vasiliy Petrov",
                "programmer",
                "+791233333",
                BigDecimal.valueOf(200000),
                LocalDate.of(1990, 1, 1));

        Employee employee3 = new Employee("Ivan Ivanov",
                "engineer",
                "+791233333",
                BigDecimal.valueOf(60000),
                LocalDate.of(1990, 1, 1));

        Employee employee4 = new Employee("Ivan Smirnov",
                "analyst",
                "+791233333",
                BigDecimal.valueOf(50000),
                LocalDate.of(1990, 1, 1));

        Employee employee5 = new Employee("Petr Petrov",
                "team Lead",
                "+791233333",
                BigDecimal.valueOf(300000),
                LocalDate.of(1975, 1, 1));

        Manager manager1 = new Manager("Maxim Maximov",
                "Manager",
                "+791233335",
                BigDecimal.valueOf(400000),
                LocalDate.of(1980, 1, 1));


        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2,
                employee3, employee4, employee5, manager1));
        for (Employee employee : employees) {
            employee.printInfo();
        }

        Manager.increaseSalary(employees, 45, 30000);
        System.out.println();
        for (Employee employee : employees) {
            employee.printInfo();
        }

        System.out.println(getAverageSalaryAndAge(employees));
        System.out.println(getAverage(employees));

        compareDates(employees, LocalDate.of(1970, 1, 1));

    }

    public static String getAverageSalaryAndAge(List<Employee> employees){
        double averageSalaries = employees.stream().mapToDouble(x-> x.getSalary().doubleValue()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x->(double) x.getAge()).average().orElseThrow();

        return String.format("Average slary - %s, age - %s", averageSalaries, averageAge);
    }

    public static String getAverage(List<Employee> employees){
        double averageSalaries = employees.stream().mapToDouble(x-> x.getSalary().doubleValue()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x->(double) x.getAge()).average().orElseThrow();
        int averageLettersInFIO = (int) employees.stream().mapToInt(x -> x.getFIO().length()).average().orElseThrow();

        return String.format("Av.Salary - %s, Av.Age - %s, Av.Lett - %s", averageSalaries, averageAge, averageLettersInFIO);
    }

    public static void compareDates(List<Employee> employees, LocalDate date){
        for (Employee employee : employees){
            int result = employee.compare(date);
            if (result < 0){
                System.out.println(employee.getFIO() + " birth earlier than " + date);
            } else if (result > 0){
                System.out.println(employee.getFIO() + " birth later than " + date);
            } else {
                System.out.println(employee.getFIO() + " birth the same with " + date);
            }
//            System.out.print(result + " ");
        }
    }
}
