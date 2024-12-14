/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import ModelClass.Bill;

/**
 * FXML Controller class
 *
 * @author csari
 */
public class MyBillsController implements Initializable {

    @FXML
    private Pane pane3;
    @FXML
    private TableView<Bill> BillviewTable;
    @FXML
    private TableColumn<Bill, Integer> Billid;
    @FXML
    private TableColumn<Bill, String> Name;
    @FXML
    private TableColumn<Bill, String> YearMonth;
    @FXML
    private TableColumn<Bill, Double> Amount;
    @FXML
    private TableColumn<Bill, String> Paymentstatus;
    @FXML
    private Button DownloadBill;

    private ObservableList<Bill> billData;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize table columns
        Billid.setCellValueFactory(new PropertyValueFactory<>("billId"));
        Name.setCellValueFactory(new PropertyValueFactory<>("name"));
        YearMonth.setCellValueFactory(new PropertyValueFactory<>("yearMonth"));
        Amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        Paymentstatus.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));

        billData = FXCollections.observableArrayList();
        BillviewTable.setItems(billData);

        // Populate table with initial data
        populateTable();
    }

    private void populateTable() {
        // Add random data to the table
        List<Bill> bills = new ArrayList<>();
        bills.add(new Bill(1, "Atif", "2024-11", 1500.00, "Paid"));
        bills.add(new Bill(2, "Belal", "2024-10", 1200.50, "Unpaid"));
        bills.add(new Bill(3, "Chandan", "2024-09", 980.75, "Paid"));
        bills.add(new Bill(4, "Dipu", "2024-08", 2000.00, "Unpaid"));
        bills.add(new Bill(5, "Esfar", "2024-07", 1750.25, "Paid"));

        billData.setAll(bills);
    }

    @FXML
    private void OnclickDownloadBill(ActionEvent event) {
        File file = new File("bills.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Bill bill : billData) {
                writer.write("Bill ID: " + bill.getBillId() + ", Name: " + bill.getName() + ", Year/Month: " + bill.getYearMonth() + ", Amount: " + bill.getAmount() + ", Payment Status: " + bill.getPaymentStatus());
                writer.newLine();
            }

            // Show success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Download Successful");
            alert.setHeaderText(null);
            alert.setContentText("Bills have been successfully downloaded to bills.txt");
            alert.showAndWait();
        } catch (IOException e) {
            // Show error alert
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Download Failed");
            alert.setHeaderText(null);
            alert.setContentText("An error occurred while downloading the bills.");
            alert.showAndWait();
        }
    }

    

    @FXML
    private void viewEnergyUsageOnClick(ActionEvent event) {
    }

    @FXML
    private void viewServiceRequestOnClick(ActionEvent event) {
    }

    @FXML
    private void viewNotificationsOnClick(ActionEvent event) throws IOException {
        
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Notification.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Notification");

    
    stage.show();
        
        
        
    }

    @FXML
    private void fileComplaintOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutOnClick(ActionEvent event) {
    }

    @FXML
    private void viewProfileOnClick(ActionEvent event) {
    }

    @FXML
    private void viewMyBillsOnClick(ActionEvent event) throws IOException {
        
            
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("Login");

    
    stage.show();
        
        
        
        
    }

   
    
}
