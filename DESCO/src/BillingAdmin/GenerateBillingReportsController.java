/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BillingAdmin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author csari
 */
public class GenerateBillingReportsController implements Initializable {

    @FXML
    private TextField CustomerName;
    @FXML
    private TextField MeterNumber;
    @FXML
    private TextField MeterUnit;
    @FXML
    private TextArea Textarea;
    @FXML
    private DatePicker Date;
    @FXML
    private TextField Description;

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
        String meterUnit = MeterUnit.getText();
        LocalDate billingDate = Date.getValue();
        String description = Description.getText();

        // Format the data to display in the TextArea
        String result = "Customer Billing Information:\n" +
                        "-----------------------------------\n" +
                        "Customer Name: " + customerName + "\n" +
                        "Meter Number: " + meterNumber + "\n" +
                        "Meter Unit: " + meterUnit + " kWh\n" +
                        "Billing Date: " + (billingDate != null ? billingDate.toString() : "Not Provided") + "\n" +
                        "Description: " + description + "\n";

        // Display the result in the TextArea
        Textarea.setText(result);

        // Save the result to a .txt file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CustomerBillingInformation.txt", true))) {
            writer.write(result);
            writer.write("\n"); // Add a new line after each entry
            writer.flush();
        } catch (IOException e) {
            Textarea.setText("Error: Unable to save billing information to file.");
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
    private void ManageCustomerBillingInformationOnClick(ActionEvent event) {
    }

    
    
    
    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
        
        
        
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/Mainpkg/Login.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Login");

    
    stage.show();
    }

    
    
}
