package BillingAdmin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AddNewBillingRecordController implements Initializable {

    @FXML
    private Pane priceperunit;
    @FXML
    private TextField CustomerName;
    @FXML
    private TextField MeterNumber;
    @FXML
    private TextArea Textarea;
    @FXML
    private Label Priceperunit;
    @FXML
    private DatePicker Date;
    @FXML
    private TextField Description;
    @FXML
    private TextField DueAmount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code, if required
    }

    @FXML
    private void OnclickSubmitButton(ActionEvent event) {
        // Retrieve input values
        String customerName = CustomerName.getText();
        String meterNumber = MeterNumber.getText();
        LocalDate billingDate = Date.getValue();
        String description = Description.getText();
        String dueAmount = DueAmount.getText();

        // Format the data to display in the TextArea
        String result = "Billing Record:\n" +
                        "----------------------------\n" +
                        "Customer Name: " + customerName + "\n" +
                        "Meter Number: " + meterNumber + "\n" +
                        "Billing Date: " + (billingDate != null ? billingDate.toString() : "Not Provided") + "\n" +
                        "Description: " + description + "\n" +
                        "Due Amount: " + dueAmount + "\n";

        // Display the result in the TextArea
        Textarea.setText(result);

        // Save the result to a .txt file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("BillingRecords.txt", true))) {
            writer.write(result);
            writer.write("\n"); // Add a new line after each entry
            writer.flush();
        } catch (IOException e) {
            Textarea.setText("Error: Unable to save billing record to file.");
        }
    }




    @FXML
    private void ViewBillingRecordsOnClick(ActionEvent event) {
    }

    @FXML
    private void GenerateBillingreportsOnclick(ActionEvent event) {
    }

    @FXML
    private void AddNewBillingRecordOnClick(ActionEvent event) {
    }

    @FXML
    private void ManageCustomerBillingInformationOnClick(ActionEvent event) throws IOException {
        
        
             
        
        
        
    }

    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
        
         
    
}


}