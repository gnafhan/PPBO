import java.util.ArrayList;

public class Customer {
    private String name, email;
    private int id;
    private static int count;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = count + 1;
        count++;
    }

    public String getEmail() {
        return email;
    }


    public ArrayList<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
