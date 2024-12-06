import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private  String name;
    private String description;
    private int price;
    private LocalDate createdAt;

    public Product(String name, String description, int price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public void showAllProducts (){
        int electronics = Electronics.electronicsCounter;
        int books = Book.bookCountrer;
        int bb = electronics + books;
        System.out.println("all products: " + bb);
    }
}
