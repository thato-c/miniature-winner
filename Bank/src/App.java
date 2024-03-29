import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create an instance
        BookShop bookShop = new BookShop();
        BookDashboard bookDashboard = new BookDashboard(bookShop);
        CustomerDashboard customerDashboard = new CustomerDashboard(bookShop);

        // Seed the Application
        Customer customer1 = new Customer("John Doe", "123 Main St", "john@example.com");
        Book book1 = new Book("The Da Vinci Code", "134Code", 153.00);
        bookShop.addCustomer(customer1);
        bookShop.addBook(book1);

        try(Scanner scan = new Scanner(System.in)){
            String option;
            do{
                // Prompt the user to select an option
                System.out.println("Welcome user: May you please select an option:");
                System.out.println("1. Get All Customers");
                System.out.println("2. Book Dashboard");
                System.out.println("Enter your choice (1 or 2): ");
                option = scan.nextLine();

                if (option.equals("1")){
                    customerDashboard.showDashBoard();
                }
                else if(option.equals("2")){
                    bookDashboard.showDashBoard();
                }
                else{
                    System.out.println("");
                    System.out.println("Invalid option. Please enter a valid option (1 or 2).");
                }

            }while (!option.equals("1") && !option.equals("2"));
        }
        
    }
}