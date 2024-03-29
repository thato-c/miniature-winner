import java.util.ArrayList;

import java.util.List;

public class BookShop {
    private List<Customer> customers;

    public BookShop(){
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void getAllCustomers(){
        for (Customer customer : customers){
            System.out.println(customer.toString()+"\n");
        }
    }
}
