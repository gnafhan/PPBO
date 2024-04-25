import java.util.ArrayList;

public class TravelAgent {
    private ArrayList<Trip> trips;
    private ArrayList<Book> books;

    public TravelAgent() {
        trips = new ArrayList<Trip>();
        books = new ArrayList<Book>();
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void showAvailableTrip() {
        int sizeTersedia = 0;
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip)) {
                sizeTersedia++;
            }
        }
        System.out.println("Terdapat " + sizeTersedia + " trip yang masih tersedia");
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip)){
            System.out.println("Destinasi: " + trip.getDestination() + " -- Keberangkatan: " + trip.getDepartureDate() + " -- Harga: " + trip.getPrice()  + " -- Qty: " + trip.getQty()+ " -- Jenis: " + trip.getType());
            }
        }
    }

    public void bookTrip(Customer customer, Trip trip){
        if (!Util.tripQuantityValidation(trip)) {
            System.out.println("Pemesanan gagal, perjalanan ke " + trip.getDestination() + " telah habis terjual.");
            return;
        }
        if (Util.isExistValidation(trip, customer)) {
            for (Book book : customer.getBooks()) {
                if (book.getTrip().equals(trip)) {
                    System.out.println("Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama dengan id " + book.getId());
                    return;
                }
            }
            return;
        }
        Book book = new Book(customer, trip);
        trip.addCustomer(customer);
        books.add(book);
        customer.addBook(book);
        trip.setQty(trip.getQty() - 1);
        System.out.println("Pemesanan berhasil dilakukan dengan booking id " + book.getId());

    }


    public void cancelBooking(String email, Trip trip){
        for (Book book : books) {
            if (book.getCustomer().getEmail().equals(email) && book.getTrip().equals(trip)) {
                books.remove(book);
                book.getCustomer().getBooks().remove(book);
                trip.getCustomers().remove(book.getCustomer());
                trip.setQty(trip.getQty() + 1);
                System.out.println("Pesanan dengan booking id " + book.getId() + " berhasil dibatalkan");
                return;
            }
        }
        System.out.println("Pesanan tidak ditemukan");
    }
    public void getBookingsByCustomerEmail(String email){
        for (Book book : books) {
            if (book.getCustomer().getEmail().equals(email)) {
                System.out.println("Pesanan dengan email " + email );
                System.out.println("Booking id: " + book.getId() + ", Destinasi: " + book.getTrip().getDestination());
                return;
            }
        }
        System.out.println("Tidak ditemukan pesanan untuk email" + email);
    }

    public void getAvailableTripsByType(TripType type){
        int sizeTersedia = 0;
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip) && trip.getType().equals(type)) {
                sizeTersedia++;
            }
        }
        System.out.println("Ditemukan " + sizeTersedia + " trip untuk jenis " + type);
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip) && trip.getType().equals(type)){
                System.out.println("Destinasi: " + trip.getDestination() + " -- Keberangkatan: " + trip.getDepartureDate() + " -- Harga: " + trip.getPrice()  + " -- Qty: " + trip.getQty()+ " -- Jenis: " + trip.getType());
            }
        }
    }

    public void getAvailableTripsByDate(String date){
        int sizeTersedia = 0;
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip) && trip.getDepartureDate().equals(Util.parseDate(date))) {
                sizeTersedia++;
            }
        }
        if (sizeTersedia == 0) {
            System.out.println("Tidak ditemukan data trip dengan jadwal keberangkatan pada " + date);
            return;
        }
        System.out.println("Ditemukan " + sizeTersedia + " trip untuk keberangkatan pada  " + date);
        for (Trip trip : trips) {
            if (Util.tripQuantityValidation(trip) && trip.getDepartureDate().equals(Util.parseDate(date))){
                System.out.println("Destinasi: " + trip.getDestination() + " -- Keberangkatan: " + trip.getDepartureDate() + " -- Harga: " + trip.getPrice()  + " -- Qty: " + trip.getQty()+ " -- Jenis: " + trip.getType());
            }
        }
    }
}
