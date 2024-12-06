public class User {
    private String firstName;
    private  String lastName;
    private String email;
    private int password;
    private Product[] products;

    public User(Product[] products, int password, String email, String lastName, String firstName) {
        this.products = products;
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
