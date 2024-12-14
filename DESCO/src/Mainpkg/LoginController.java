/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController implements Initializable {

    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private ComboBox<String> userComboBox;
   
    @FXML
    private Button loginButtonfxid;

    /**
     * Initializes the controller class.
     */
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userComboBox.getItems().addAll("Customer", "Billing Admin", "Manager", "Meter Reader",
                "Customer Service Representative", "HR", "System Admin",
                 "Field Technician");
    }

    @FXML
    private void OnclickloginButton(ActionEvent event) {
          

        if (authenticateUser(emailTextField.getText(), passwordTextField.getText(), userComboBox.getValue())) {
            try {
                String role = userComboBox.getValue();
                String fxmlFile;

                switch (role) {
                    case "Customer":
                        fxmlFile = "/Customer/CustomerDashboard.fxml";
                        break;
                    case "Billing Admin":
                        fxmlFile = "/BillingAdmin/ViewBillingRecords.fxml";
                        break;
                    case "Manager":
                        fxmlFile = "ManagerDashboard.fxml";
                        break;
                    case "System Admin":
                        fxmlFile = "SystemAdminDashboard.fxml";
                        break;
                        
                        case "HR":
                        fxmlFile = "HRDashboard.fxml";
                        break;
                        
                    case "Meter Reader":
                        fxmlFile = "MeterReaderDashboard.fxml";
                        break;
                        
                    case "Security Manager":
                        fxmlFile = "SecurityManagerDashboard.fxml";
                        break;
                        
                     
                    case "Field Technician":
                        fxmlFile = "FieldTechnicianDashboard.fxml";
                        break; 
                          
                        
                    default:
                        fxmlFile = "Desco.fxml";
                        break;
                }

                FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
                Parent root = loader.load();
                Stage stage = (Stage) loginButtonfxid.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                showAlert("Failed to load the dashboard for the selected role.");
            }
        } else {
            showAlert("Invalid email, password, or user role. Please try again.");
        }
    }

    private boolean authenticateUser(String email, String password, String role) {
        // Allow any email, password, and role combination to login.
        return true;
    }

    private void showAlert(String message) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.WARNING);
        alert.setTitle("Login Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
