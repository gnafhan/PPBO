import java.util.ArrayList;
import java.util.Date;

public class Trip {
    private String destination;
    private int price, qty;
    private Date departureDate;
    private TripType type;
    private ArrayList<Customer> customers = new ArrayList<Customer>();


    public Trip(String destination, int price,  String departureDate, TripType type, int qty) {
        this.destination = destination;
        this.price = price;
        this.qty = qty;
        this.departureDate = Util.parseDate(departureDate);
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public TripType getType() {
        return type;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }


}

enum TripType{
    FLIGHT, HOTEL, PACKAGE
}