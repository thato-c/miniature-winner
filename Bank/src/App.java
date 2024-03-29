import java.util.Scanner;

public class App {
    private BookShop bookShop;
    private BookDashboard bookDashboard;
    private CustomerDashboard customerDashboard;

    public App(){
        // Create an instance
        bookShop = new BookShop();
        bookDashboard = new BookDashboard(bookShop, this);
        customerDashboard = new CustomerDashboard(bookShop, this);

        // Seed the Application
        Customer customer1 = new Customer("John Doe", "123 Main St", "john@example.com");
        Book book1 = new Book("The Da Vinci Code", "134Code", 153.00);
        bookShop.addCustomer(customer1);
        bookShop.addBook(book1);
    }

    public void run(){
        try(Scanner scan = new Scanner(System.in)){
            String option;
            do{
                // Prompt the user to select an option
                System.out.println("Welcome user: May you please select an option:");
                System.out.println("1. Customer Dashboard");
                System.out.println("2. Book Dashboard");
                System.out.println("0. Exit");
                System.out.println("Enter your choice (1, 2 or 0): ");
                option = scan.nextLine();
    
                switch(option){
                    case "1":
                        customerDashboard.showDashBoard();
                        break;
                    case "2":
                        bookDashboard.showDashBoard();
                        break;
                    case "0":
                        System.out.println("Exiting the application...");
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a valid option (1, 2 or 0).");
                }
            } 
            while (!option.equals("0"));
        }
    }

    public static void main(String[] args){
        App app = new App();
        app.run();
    }

}