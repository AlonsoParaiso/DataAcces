/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers.items;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import services.ItemsServices;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 */
public class FXMLListItemsController implements Initializable {

    @FXML
    private ListView itemsList;

    public void loadItemsList() {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadItemsList();
    }

}
