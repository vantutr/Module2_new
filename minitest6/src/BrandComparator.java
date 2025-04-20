import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getBrand().compareToIgnoreCase(o2.getBrand());
    }
}
