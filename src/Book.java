import java.time.LocalDate;
import java.util.Scanner;
public class Book extends Product {
    private  String authorFullName;
    static int bookCountrer= 0;
    Scanner scanner = new Scanner(System.in);

    public Book(String name, String description, int price, LocalDate createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
        bookCountrer++;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public int getBookCountrer() {
        return bookCountrer;
    }

    public void setBookCountrer(int bookCountrer) {
        this.bookCountrer = bookCountrer;
    }
}
