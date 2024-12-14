package Mainpkg;

import java.time.LocalDate;

public class Complaint {

    private String customerName;
    private String complaintType;
    private String description;
    private LocalDate complaintDate;  // Add complaintDate field

    // Constructor with all fields
    public Complaint(String customerName, String complaintType, String description, LocalDate complaintDate) {
        this.customerName = customerName;
        this.complaintType = complaintType;
        this.description = description;
        this.complaintDate = complaintDate;  // Initialize complaintDate
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(LocalDate complaintDate) {
        this.complaintDate = complaintDate;
    }

    // Overriding toString to include the complaint date
    @Override
    public String toString() {
        return "Customer Name: " + customerName + 
               "\nComplaint Type: " + complaintType + 
               "\nDescription: " + description + 
               "\nDate: " + complaintDate;  // Include date in the string representation
    }
}
