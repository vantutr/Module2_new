import java.util.Comparator;

public class TaxComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Double.compare(o1.calculateTax(), o2.calculateTax());
    }
}
