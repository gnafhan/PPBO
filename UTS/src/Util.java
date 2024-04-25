import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {
    public static Date parseDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            return sdf.parse(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Boolean tripQuantityValidation (Trip trip) {
        return trip.getQty() > 0;
    }

    public static String generateId(Trip trip, int countBook){
        return "00"+trip.getDestination()+"00"+trip.getType()+countBook;
    }

    public static Boolean isExistValidation(Trip trip, Customer customer){
        return trip.getCustomers().indexOf(customer) != -1;
    }
}
