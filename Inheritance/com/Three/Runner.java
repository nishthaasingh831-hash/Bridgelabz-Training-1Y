package Three;

public class Runner {
    public static void main(String[] args) {

        Author book1 = new Author(
                "The White Tiger",
                2008,
                "Aravind Adiga",
                "Indian author and journalist"
        );

        book1.displayInfo();
    }
}