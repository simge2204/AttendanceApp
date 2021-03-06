/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolapp.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Philip
 */
public class RootLayoutController implements Initializable
{

    @FXML
    private BorderPane borderPane;
    @FXML
    private MenuBar menuBar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
     
    }    

    @FXML
    private void logOut(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/schoolapp/gui/view/LoginView.fxml"));
        Parent root = loader.load();
        LoginController con = loader.getController();
        con.setRootLayout(borderPane);
        
        borderPane.setCenter(root);
    }

    @FXML
    private void close(ActionEvent event)
    {
        Platform.exit();
    }

    @FXML
    private void about(ActionEvent event)
    {
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setHeaderText("Om SchoolApp");
        about.setContentText("Dette program holder styr på dit fravær");
        about.show();
    }

    @FXML
    private void closeBtn(MouseEvent event)
    {
        Platform.exit();
    }
    
}
