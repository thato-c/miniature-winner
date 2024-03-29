public class Book {
    private String title;
    private String isbn;
    private double price;

    public Book(String title, String isbn, double price){
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book {title = " + title + 
                ", isbn = " + isbn + 
                ", price = " + price +
                "}";
    }
}
