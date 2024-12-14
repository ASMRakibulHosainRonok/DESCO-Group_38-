/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author csari
 */
public class GenerateBillingReportsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void GenerateBillingreportsOnclick(ActionEvent event) throws IOException {
        
         // Load the FXML file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("GenerateBillingReports.fxml"));
    Parent root = loader.load();

    // Get the current stage
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Set the new scene
    stage.setScene(new Scene(root));

    // Set a title for the window
    stage.setTitle("Generate Billing Reports");

    // Show the stage
    stage.show();
        
        
        
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

    @FXML
    private void AddNewBillingRecordOnClick(ActionEvent event) throws IOException {
        
        
        
     // Load the FXML file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("AddNewBillingRecord.fxml"));
    Parent root = loader.load();

    // Get the current stage
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Set the new scene
    stage.setScene(new Scene(root));

    // Set a title for the window
    stage.setTitle("AddNewBillingRecord");

    // Show the stage
    stage.show();
        
        
        
        
        
        
    }

    @FXML
    private void ManageCustomerBillingInformationOnClick(ActionEvent event) throws IOException {
        
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageCustomerBillingInformation.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("ManageCustomerBillingInformation");

    
    stage.show();
        
        
        
        
        
        
        
        
        
        
    }

    @FXML
    private void ViewBillingRecordsOnClick(ActionEvent event) throws IOException {
        
        
         
           // Load the FXML file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewBillingRecords.fxml"));
    Parent root = loader.load();

    // Get the current stage
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Set the new scene
    stage.setScene(new Scene(root));

    // Set a title for the window
    stage.setTitle("ViewBillingRecords");

    // Show the stage
    stage.show();
         
        
        
        
    }
    
}
