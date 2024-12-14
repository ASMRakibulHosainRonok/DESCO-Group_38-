
package ModelClass;

import java.time.LocalDate;





public class Report {
    private String customerName;
    private String meterNumber;
    private String meterUnit;
    private LocalDate billingDate;
    private String description;

    
    public Report(String customerName, String meterNumber, String meterUnit, LocalDate billingDate, String description) {
        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.meterUnit = meterUnit;
        this.billingDate = billingDate;
        this.description = description;
    }

  
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public String getMeterUnit() {
        return meterUnit;
    }

    public void setMeterUnit(String meterUnit) {
        this.meterUnit = meterUnit;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ToString Method
    @Override
    public String toString() {
        return "Customer Billing Information:\n" +
               "-----------------------------------\n" +
               "Customer Name: " + customerName + "\n" +
               "Meter Number: " + meterNumber + "\n" +
               "Meter Unit: " + meterUnit + " kWh\n" +
               "Billing Date: " + (billingDate != null ? billingDate.toString() : "Not Provided") + "\n" +
               "Description: " + description + "\n";
    }
}
