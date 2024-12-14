package Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Mainpkg.Complaint;

public class ComplaintController {

    @FXML
    private TextField ComplaintType;
    @FXML
    private TextField Description;
    @FXML
    private TextField CustomerName;
    @FXML
    private TextArea Textarea;
    @FXML
    private DatePicker Date;

    // Initialize method
    public void initialize() {
        // Initialization if needed
    }

    // Submit button click event
    @FXML
    private void OnclickSubmitButton(ActionEvent event) {
        // Get user inputs from the text fields
        String customerName = CustomerName.getText();
        String complaintType = ComplaintType.getText();
        String description = Description.getText();
        LocalDate complaintDate = Date.getValue();  // Get the date from DatePicker

        // Check if date is selected
        if (complaintDate == null) {
            showAlert("Error", "Please select a date.");
            return;
        }

        // Create a new Complaint object with user inputs
        Complaint complaint = new Complaint(customerName, complaintType, description, complaintDate);

        // Display the complaint details in the TextArea
        Textarea.setText(complaint.toString());

        // Save the complaint data to a .txt file
        if (saveComplaintToFile(complaint)) {
            // Show success alert
            showAlert("Success", "Complaint submitted and saved successfully!");
        } else {
            // Show error alert if saving fails
            showAlert("Error", "An error occurred while saving the complaint.");
        }
    }

    // Method to show alerts
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Method to save the complaint to a .txt file and return success status
    private boolean saveComplaintToFile(Complaint complaint) {
        File file = new File("complaints.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(complaint.toString());
            writer.newLine();
            writer.write("=====================================");
            writer.newLine();
            return true; // Return true if file writing is successful
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Return false if there's an error
        }
    }

    
    
    
    @FXML
    private void viewProfileOnClick(ActionEvent event) throws IOException {
        
        
                  
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Customer/CustomerDashboard.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("CustomerDashboard");

    
    stage.show();
        
        

        
        
        
    }

    @FXML
    private void viewMyBillsOnClick(ActionEvent event) throws IOException {
        
        
                  
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Customer/MyBills.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Login");

    
    stage.show();
        
        

        
        
        
        
        
        
    }


    @FXML
    private void viewNotificationsOnClick(ActionEvent event) throws IOException {
        
                  
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Customer/Notification.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Notification");

    
    stage.show();
        
        

        
        
        
        
    }

    @FXML
    private void fileComplaintOnClick(ActionEvent event) throws IOException {
        
                  
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Customer/complaint.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("complaint");

    
    stage.show();
        
        

        
        
        
        
        
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
