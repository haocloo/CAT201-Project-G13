package cat201.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {
    @FXML
    private Button myButton;

    @FXML
    public void initialize() {
        myButton.setText("Click me!");
    }
}
