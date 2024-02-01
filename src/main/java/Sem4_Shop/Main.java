package Sem4_Shop;

import Sem4_Shop.Exception.AmountException;
import Sem4_Shop.Exception.CustomerException;
import Sem4_Shop.Exception.ProductException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomerException, AmountException, ProductException {
        OnlineShop.getCustomerList().add(new Customer("Ivanov Ivan", LocalDate.of(1987, 12, 9), "+79120360000", Customer.Gender.MALE));
        OnlineShop.getCustomerList().add(new Customer("Petrov Petr", LocalDate.of(1988, 12, 20), "+79049800000", Customer.Gender.MALE));
        OnlineShop.getCustomerList().add(new Customer("Maria Vasilyeva", LocalDate.of(1985, 10, 5), "+7771710000", Customer.Gender.FEMALE));

        OnlineShop.getProductList().add(new Product("apple", BigDecimal.valueOf(10)));
        OnlineShop.getProductList().add(new Product("pineapple", BigDecimal.valueOf(50)));


        try {
            Order order = null;
            order = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");

        OnlineShop.getOrderList().add(order);
            System.out.println(OnlineShop.getOrderList());

            Order order2 = OnlineShop.buyProduct("Petrov Petr", "pineapple", "10");
            OnlineShop.getOrderList().add(order2);
            System.out.println(OnlineShop.getOrderList());


            Order order3 = OnlineShop.buyProduct("Petrov Petr","apple","-1");
            OnlineShop.getOrderList().add(order3);
            System.out.println(OnlineShop.getOrderList());

        } catch (AmountException e) {
            OnlineShop.getOrderList().add(OnlineShop.buyProduct(e.getCustomer(), e.getProduct(), "1"));
            System.out.println(OnlineShop.getOrderList());
        } catch (ProductException e) {
            System.out.println(e.getMessage());;
        } catch (Exception e) {
            throw e;
        }

        System.out.println(OnlineShop.getOrderList().size() + " orders received");

        congrats(OnlineShop.getCustomerList(), LocalDate.of(2023, 12, 31));
        congrats(OnlineShop.getCustomerList(), LocalDate.of(2023, 3, 8));
        congrats(OnlineShop.getCustomerList(), LocalDate.of(2023, 2, 23));
    }

    enum holiday{
        NO_HOLIDAY (" No hiliday"), MARCH_8(" Congratulation on Martch 8!"),
        FEBRIARY_23 (" Congratulation on Febriary 23!"), NEW_YEAR(" Happy New Year ALL!!!");

        private final String displayValue;
        private holiday(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getDisplayValue() {
            return displayValue;
        }
    }

    public static void congrats(List<Customer> customers, LocalDate date){
        for (Customer customer : customers){
            if(date.equals(LocalDate.of(2023, 12, 31))){
                System.out.println(holiday.NEW_YEAR.getDisplayValue());
            }
            if(date.equals(LocalDate.of(2023, 3, 8)) && customer.getGender() == Customer.Gender.FEMALE){
                System.out.println(customer.getFIO() + holiday.MARCH_8.getDisplayValue());
            }
            if(date.equals(LocalDate.of(2023, 2, 23)) && customer.getGender() == Customer.Gender.MALE){
                System.out.println(customer.getFIO() + holiday.FEBRIARY_23.getDisplayValue());
            }

        }
    }


}
