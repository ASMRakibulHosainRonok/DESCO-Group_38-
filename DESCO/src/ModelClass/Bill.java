
package ModelClass;


public class Bill {
    private final int billId;
    private final String name;
    private final String yearMonth;
    private final double amount;
    private final String paymentStatus;

    public Bill(int billId, String name, String yearMonth, double amount, String paymentStatus) {
        this.billId = billId;
        this.name = name;
        this.yearMonth = yearMonth;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getBillId() {
        return billId;
    }

    public String getName() {
        return name;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}
