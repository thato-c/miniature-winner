import java.util.ArrayList;

import java.util.List;

public class BookShop {
    private List<Customer> customers;
    private List<Book> books;

    public BookShop(){
        this.customers = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void getAllCustomers(){
        for (Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    public void getAllBooks(){
        for(Book book : books){
            System.out.println(book.toString());
        }
    }

}
