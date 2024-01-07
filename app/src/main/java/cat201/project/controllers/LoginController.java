package cat201.project.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    TextField nameTextField;

    // Change scene
    @FXML
    public void login(ActionEvent event) throws IOException {
        String username = nameTextField.getText();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("views/Main.fxml"));
        Parent root = loader.load();
        
        MainController mainController = loader.getController();
        mainController.displayName(username);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
