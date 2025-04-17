import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    public int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = getExpiryDate();

        int monthToday = today.getMonthValue();
        int monthExpiry = expiry.getMonthValue();
        int monthsLeft = monthExpiry - monthToday;

        if (monthsLeft < 0) {
            monthsLeft += 12;
        }

        if (monthsLeft <= 2) {
            return getAmount() * 0.6;
        } else if (monthsLeft <= 4) {
            return getAmount() * 0.8;
        } else {
            return getAmount() * 0.95;
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }
}
