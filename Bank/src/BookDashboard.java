import java.util.Scanner;

public class BookDashboard implements Dashboard{
    private BookShop bookShop;
    private Scanner scan;
    private App app;

    public BookDashboard(BookShop bookShop, App app){
        this.bookShop = bookShop;
        this.scan = new Scanner(System.in);
        this.app = app;
    }

    @Override
    public void showDashBoard(){
        String option;
        do{
            System.out.println("\nBook Dashboard:");
            System.out.println("1. View All Books");
            System.out.println("2. Add Book");
            System.out.println("0. Back to Main menu");
            System.out.println("Enter your choice: ");
            option = scan.nextLine();

            switch (option){
                case "1":
                    viewAllBooks();
                    break;
                case "2":
                    addBook();
                    break;
                case "0":
                    System.out.println("Returning to Main Menu...");
                    returnToMainMenu();
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

    private void viewAllBooks(){
        System.out.println("All Books:");
        bookShop.getAllBooks();
    }

    private void addBook(){
        String title;
        String isbn;
        double price;

        System.out.println("Adding a new book:");
        System.out.println("Enter Title: ");
        title = scan.nextLine();
        System.out.println("Enter ISBN: ");
        isbn = scan.nextLine();
        System.out.println("Enter Price: ");
        price = Double.parseDouble(scan.nextLine());

        Book newBook = new Book(title, isbn, price);
        bookShop.addBook(newBook);
        System.out.println("Book added successfully");
    }

}
