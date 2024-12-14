package Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ModelClass.Notification;


public class NotificationController implements Initializable {

    @FXML
    private Pane pane3;
    @FXML
    private TableView<Notification> BillviewTable;
    @FXML
    private TableColumn<Notification, Integer> NotificationID;
    @FXML
    private TableColumn<Notification, String> Title;
    @FXML
    private TableColumn<Notification, String> Description;
    @FXML
    private TableColumn<Notification, String> Date;
    @FXML
    private Button DownloadNotification;

    private ObservableList<Notification> notificationData;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize table columns
        NotificationID.setCellValueFactory(new PropertyValueFactory<>("notificationId"));
        Title.setCellValueFactory(new PropertyValueFactory<>("title"));
        Description.setCellValueFactory(new PropertyValueFactory<>("description"));
        Date.setCellValueFactory(new PropertyValueFactory<>("date"));

        notificationData = FXCollections.observableArrayList();
        BillviewTable.setItems(notificationData);

        // Populate table with initial data
        populateTable();
    }

    private void populateTable() {
        // Add random data to the table
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification(1, "Scheduled Maintenance", "Power outage in Dhanmondi from 10 AM to 3 PM.", "2024-12-15"));
        notifications.add(new Notification(2, "Bill Payment Reminder", "Electricity bill for November is due on 2024-12-20.", "2024-12-10"));
        notifications.add(new Notification(3, "New Tariff Update", "DESCO has updated its tariff rates effective from January.", "2024-12-09"));
        notifications.add(new Notification(4, "Service Disruption Alert", "Emergency repair in Gulshan; expect outages till 6 PM.", "2024-12-12"));
        notifications.add(new Notification(5, "Online Service Update", "DESCO's online portal will be under maintenance.", "2024-12-11"));

        notificationData.setAll(notifications);
    }

    @FXML
    private void viewNotificationsOnClick(ActionEvent event) {
        // Refresh table with existing data
        populateTable();
    }

    @FXML
    private void OnclickDownloadnotification(ActionEvent event) {
        File file = new File("notifications.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Notification notification : notificationData) {
                writer.write("Notification ID: " + notification.getNotificationId() + ", Title: " + notification.getTitle() + ", Description: " + notification.getDescription() + ", Date: " + notification.getDate());
                writer.newLine();
            }

            // Show success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Download Successful");
            alert.setHeaderText(null);
            alert.setContentText("Notifications have been successfully downloaded to notifications.txt");
            alert.showAndWait();
        } catch (IOException e) {
            // Show error alert
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Download Failed");
            alert.setHeaderText(null);
            alert.setContentText("An error occurred while downloading the notifications.");
            alert.showAndWait();
        }
    }

    
    
    @FXML
    private void viewProfileOnClick(ActionEvent event) {
    }

    @FXML
    private void viewMyBillsOnClick(ActionEvent event) {
    }

    @FXML
    private void viewEnergyUsageOnClick(ActionEvent event) {
    }

    @FXML
    private void viewServiceRequestOnClick(ActionEvent event) {
    }

   

    @FXML
    private void fileComplaintOnClick(ActionEvent event) throws IOException {
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("complaint.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Complaint");

    
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

   
    
}
