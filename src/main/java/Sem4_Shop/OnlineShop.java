package Sem4_Shop;

import Sem4_Shop.Exception.AmountException;
import Sem4_Shop.Exception.CustomerException;
import Sem4_Shop.Exception.ProductException;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private static List<Customer> customerList = new ArrayList<>();
    private static List<Product> productList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        OnlineShop.customerList = customerList;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        OnlineShop.productList = productList;
    }

    public static List<Order> getOrderList() {
        return orderList;
    }

    public static void setOrderList(List<Order> orderList) {
        OnlineShop.orderList = orderList;
    }

    public static Order buyProduct(String customerFIO, String productName, String quantityOfProduct) throws AmountException, CustomerException, ProductException {
        Customer currentCustomer = null;
        for (Customer customer : customerList){
            if (customer.getFIO().equals(customerFIO)){
                currentCustomer = customer;
                break;
            }
        }
        Product currentProduct = null;
        for (Product product : productList){
            if(product.getName().equals(productName)){
                currentProduct = product;
                break;
            }
        }
        int currentQuantity = Integer.parseInt(quantityOfProduct);
        if(currentQuantity <= 0 || currentQuantity > 100){
            throw new AmountException(customerFIO, productName);
        }
        if(currentCustomer == null){
            throw new CustomerException("Customer not found");
        }
        if(currentProduct == null){
            throw new ProductException();
        }
        return new Order(currentCustomer, currentProduct, Integer.parseInt(quantityOfProduct));
    }




}
