package BillingAdmin;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ModelClass.BillingRecord;




public class ViewBillingRecordsController implements Initializable {

    @FXML
    private TableView<BillingRecord> BillviewTable;
    @FXML
    private TableColumn<BillingRecord, Integer> Billid;
    @FXML
    private TableColumn<BillingRecord, String> Name;
    @FXML
    private TableColumn<BillingRecord, String> YearMonth;
    @FXML
    private TableColumn<BillingRecord, Double> Amount;

    private final ObservableList<BillingRecord> billingRecords = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Billid.setCellValueFactory(new PropertyValueFactory<>("billId"));
        Name.setCellValueFactory(new PropertyValueFactory<>("name"));
        YearMonth.setCellValueFactory(new PropertyValueFactory<>("yearMonth"));
        Amount.setCellValueFactory(new PropertyValueFactory<>("amount"));

        loadSampleData();
    }

    private void loadSampleData() {
        billingRecords.add(new BillingRecord(101, "John Doe", "2024-01", 1500.75));
        billingRecords.add(new BillingRecord(102, "Jane Smith", "2024-02", 2000.50));
        billingRecords.add(new BillingRecord(103, "Michael Brown", "2024-03", 1750.00));
        billingRecords.add(new BillingRecord(104, "Emily Davis", "2024-04", 2250.25));
        billingRecords.add(new BillingRecord(105, "William Johnson", "2024-05", 1950.40));

    
        BillviewTable.setItems(billingRecords);
    }

    @FXML
    private void OnclickViewBillingRecords(ActionEvent event) throws IOException {
        

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/BillingAdmin/ViewBillingRecords.fxml"));
    Parent root = loader.load();

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    stage.setScene(new Scene(root));


    stage.setTitle("ViewBillingRecords");

 
    stage.show();
         
        
        
    }

    @FXML
    private void OnclickGenerateBillingreports(ActionEvent event) throws IOException {
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/BillingAdmin/GenerateBillingReports.fxml"));
    Parent root = loader.load();

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    stage.setScene(new Scene(root));

    stage.setTitle("Generate Billing Reports");

    stage.show();
         
        
        
    }

    @FXML
    private void OnclickAddnewBillingrecords(ActionEvent event) throws IOException {
        

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/BillingAdmin/AddNewBillingRecord.fxml"));
    Parent root = loader.load();

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    stage.setScene(new Scene(root));

    stage.setTitle("AddNewBillingRecord");

    stage.show();
    
    
    
         
        
        
        
        
    }

    @FXML
    private void OnclickManageCustomerinformation(ActionEvent event) throws IOException {
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/BillingAdmin/ManageCustomerBillingInformation.fxml"));
    Parent root = loader.load();

   
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

   
    Scene scene = new Scene(root);
    stage.setScene(scene);

   
    stage.setTitle("ManageCustomerBillingInformation");

    
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
