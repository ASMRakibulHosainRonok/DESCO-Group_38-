package ModelClass;

public class BillingRecord {
    private int billId;
    private String name;
    private String yearMonth;
    private double amount;

    // Constructor
    public BillingRecord(int billId, String name, String yearMonth, double amount) {
        this.billId = billId;
        this.name = name;
        this.yearMonth = yearMonth;
        this.amount = amount;
    }

    // Getters and Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Override toString method
    @Override
    public String toString() {
        return "BillingRecord{" +
                "billId=" + billId +
                ", name='" + name + '\'' +
                ", yearMonth='" + yearMonth + '\'' +
                ", amount=" + amount +
                '}';
    }
}
