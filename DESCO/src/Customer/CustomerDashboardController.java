package Customer;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CustomerDashboardController {

    // FXML injected fields
    @FXML
    private TextField profileNameTextField;
    @FXML
    private TextField profileUseridTextField;
    @FXML
    private DatePicker profileDOBdatepicker;
    @FXML
    private TextField profileEmailTextField;
    @FXML
    private TextField profileConNumTextField;
    @FXML
    private TextField profileAddressTextField;
    @FXML
    private TextField currPassTextField;
    @FXML
    private TextField newPassTextField;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane1;

    /**
     * Method to view the profile on button click
     */
    @FXML
    private void viewProfileOnClick(ActionEvent event) {
        
       
    }

    /**
     * Method to save changes on button click
     */
    @FXML
    private void saveChangesOnClick(ActionEvent event) {
        // Get values from the text fields and date picker
        String name = profileNameTextField.getText();
        String userId = profileUseridTextField.getText();
        String dob = profileDOBdatepicker.getValue() != null ? profileDOBdatepicker.getValue().toString() : "Not Provided";
        String email = profileEmailTextField.getText();
        String contactNumber = profileConNumTextField.getText();
        String address = profileAddressTextField.getText();
        String currentPassword = currPassTextField.getText();
        String newPassword = newPassTextField.getText();

        // Prepare the data to be written to the file
        String profileData = "Name:"+ name + "\n" +
                            "userId:" + userId + "\n" +
                             "DateofBirth:"+ dob + "\n" +
                             "Email:"+email + "\n" +
                             "contactNumber:"+contactNumber + "\n" +
                             "Address:"+address + "\n" +
                            "CurrentPassword:" +currentPassword + "\n" +
                             "NewPassword:"+newPassword;

        // Save to the text file
        String fileName = "UserProfile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(profileData);  // Save all profile data to the file
        } catch (IOException e) {
            // Handle exception if writing to file fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to save profile");
            alert.setContentText("An error occurred while saving the profile.");
            alert.showAndWait();
        }

        // Show success alert
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Profile Saved");
        successAlert.setHeaderText("Changes Saved Successfully");
        successAlert.setContentText("Your profile has been successfully saved.");
        successAlert.showAndWait();
    }

   @FXML
private void viewMyBillsOnClick(ActionEvent event) throws IOException {
   
    FXMLLoader loader = new FXMLLoader(getClass().getResource("MyBills.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("My Bills");

    
    stage.show();
}

    @FXML
    private void viewEnergyUsageOnClick(ActionEvent event) {
    }

    @FXML
    private void viewServiceRequestOnClick(ActionEvent event) {
    }

    @FXML
    private void viewNotificationsOnClick(ActionEvent event) {
    }

    @FXML
    private void fileComplaintOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
        
        
            
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Login");

    
    stage.show();
        
        
        
        
        
    }
}
