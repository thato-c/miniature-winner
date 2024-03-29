import java.util.Scanner;

public class CustomerDashboard implements Dashboard {
    private BookShop bookShop;
    private Scanner scan;
    private App app;

    public CustomerDashboard(BookShop bookShop, App app){
        this.bookShop = bookShop;
        this.scan = new Scanner(System.in);
        this.app = app;
    }

    @Override
    public void showDashBoard(){
        String option;
        do{
            System.out.println("\nBook Dashboard:");
            System.out.println("1. View All Customers");
            System.out.println("2. Add Customer");
            System.out.println("0. Back to Main menu");
            System.out.println("Enter your choice: ");
            option = scan.nextLine();

            switch (option){
                case "1":
                    viewAllCustomers();
                    break;
                case "2":
                    addCustomer();
                    break;
                case "0":
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        } while (!option.equals("0"));
    }

    @Override
    public void returnToMainMenu(){
        app.run();
    }

    public void viewAllCustomers(){
        System.out.println("All Customers:");
        bookShop.getAllCustomers();
    }

    public void addCustomer(){
        String firstName;
        String address;
        String email;

        System.out.println("Adding a new customer...");
        System.out.println("Enter first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter address: ");
        address = scan.nextLine();
        System.out.println("Enter email: ");
        email = scan.nextLine();

        Customer newCustomer = new Customer(firstName, address, email);
        bookShop.addCustomer(newCustomer);
        System.out.println("Customer added successfully!");
    }

}