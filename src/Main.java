import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        boolean isLogin = false;

        while (choose != 3) {
            if (!isLogin) {
                System.out.println("1 - Register");
                System.out.println("2 - Login");
            } else {
                System.out.println("3 - Exit");
            }

            choose = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после nextInt()

            switch (choose) {
                case 1: {
                    if (!isLogin) {
                        System.out.println("Введите имя:");
                        String firstName = scanner.nextLine();
                        System.out.println("Введите фамилию:");
                        String lastName = scanner.nextLine();
                        System.out.println("Введите email:");
                        String email = scanner.nextLine();
                        System.out.println("Введите password:");
                        int password = scanner.nextInt();
                        scanner.nextLine(); // Очищаем буфер после nextInt()

                        User newUser = new User(new Product[0], password, email, lastName, firstName);
                        isLogin = true;
                        System.out.println("Регистрация успешна!");
                    }
                    break;
                }
                case 2: {
                    if (!isLogin) {
                        System.out.println("Введите имя:");
                        String firstName = scanner.nextLine();
                        System.out.println("Введите фамилию:");
                        String lastName = scanner.nextLine();
                        System.out.println("Введите email:");
                        String email = scanner.nextLine();
                        System.out.println("Введите password:");
                        int password = scanner.nextInt();
                        scanner.nextLine(); // Очищаем буфер после nextInt()

                        // Предполагается проверка логина, для примера считаем успешной
                        User user = new User(new Product[0], password, email, lastName, firstName);
                        isLogin = true;
                        System.out.println("Вход успешен!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Выход из системы...");
                    isLogin = false;
                    break;
                }
            }

            while (isLogin) {
                System.out.println("1 - Add new Product");
                System.out.println("2 - Get All Products");
                System.out.println("3 - Get All Books");
                System.out.println("4 - Get All Electronics");
                System.out.println("5 - Logout");

                int chooseMethod = scanner.nextInt();
                scanner.nextLine(); // Очищаем буфер после nextInt()

                switch (chooseMethod) {
                    case 1: {
                        System.out.println("Что вы хотите добавить:");
                        System.out.println("1 - Книгу");
                        System.out.println("2 - Электронику");
                        int chooseProduct = scanner.nextInt();
                        scanner.nextLine(); // Очищаем буфер

                        if (chooseProduct == 1) {
                            System.out.println("Напишите название книги:");
                            String nameBook = scanner.nextLine();
                            System.out.println("Напишите описание:");
                            String description = scanner.nextLine();
                            System.out.println("Напишите цену:");
                            int price = scanner.nextInt();
                            scanner.nextLine(); // Очищаем буфер
                            System.out.println("Напишите автора:");
                            String author = scanner.nextLine();

                            Book newBook = new Book(nameBook, description, price, LocalDate.now(), author);
                            System.out.println("Книга успешно добавлена!");
                        } else if (chooseProduct == 2) {
                            System.out.println("Напишите название электроники:");
                            String nameElec = scanner.nextLine();
                            System.out.println("Напишите описание:");
                            String description = scanner.nextLine();
                            System.out.println("Напишите цену:");
                            int price = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Напишите бренд:");
                            String brand = scanner.nextLine();
                            System.out.println("Напишите цвет:");
                            String color = scanner.nextLine();
                            System.out.println("Это новая электроника? (true/false):");
                            boolean isNew = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.println("Напишите память:");
                            int memory = scanner.nextInt();

                            Electronics electronics = new Electronics(nameElec, description, price, LocalDate.now(), brand, color, isNew, memory);
                            System.out.println("Электроника успешно добавлена!");
                        } else {
                            System.out.println("Ошибка выбора!");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Получение всех продуктов...");
                        // Реализуйте логику
                        break;
                    }
                    case 3: {
                        System.out.println("Получение всех книг...");
                        // Реализуйте логику
                        int books = Book.bookCountrer;
                        System.out.println("all books: " + books);
                        break;
                    }
                    case 4: {
                        System.out.println("Получение всей электроники...");
                        // Реализуйте логику
                        break;
                    }
                    case 5: {
                        System.out.println("Выход из аккаунта...");
                        isLogin = false;
                        break;
                    }
                    default:
                        System.out.println("Неверный выбор!");
                }
            }
        }
    }
}
