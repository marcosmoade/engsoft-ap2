import java.util.Enumeration;

public class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = aCustomer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += " " + each.getMovie().getTitle() + " " + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += String.valueOf(aCustomer.getTotalFrequentRenterPoints());
        return result;
    }
}