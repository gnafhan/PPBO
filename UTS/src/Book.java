import java.util.UUID;

public class Book {
    private String id;
    private Customer customer;
    private Trip trip;

    private int currentBook;
    public static int countBook = 1;

    public Book(Customer customer, Trip trip) {
        this.id = Util.generateId(trip, countBook);
        this.customer = customer;
        this.trip = trip;
        this.currentBook = countBook;
        countBook++;
    }

    public String getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Trip getTrip(){
        return trip;
    }
}
