import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create an instance
        BookShop bookShop = new BookShop();
        Customer customer1 = new Customer("John Doe", "123 Main St", "john@example.com");
        bookShop.addCustomer(customer1);

        try(Scanner scan = new Scanner(System.in)){
            String option;
            do{
                // Prompt the user to select an option
                System.out.println("Welcome user: May you please select an option:");
                System.out.println("1. Get All Customers");
                System.out.println("2. Add Customer");
                System.out.println("Enter your choice (1 or 2): ");
                option = scan.nextLine();

                if (option.equals("1")){
                    System.out.println("");
                    bookShop.getAllCustomers();
                }
                else if(option.equals("2")){
                    System.out.println("2. Add Customer");
                } 
                else{
                    System.out.println("Invalid option. Please enter a valid option (1 or 2).");
                }

            }while (!option.equals("1") && !option.equals("2"));
        }
        
    }
}