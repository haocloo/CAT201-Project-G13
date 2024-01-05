package cat201.project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController {

    @FXML
    private ImageView dish1ImageView;
    @FXML
    private ImageView dish2ImageView;
    @FXML
    private ImageView dish3ImageView;
    @FXML
    private ImageView dish4ImageView;
    @FXML
    private ImageView dish5ImageView;

    @FXML
    public void initialize() {
        dish1ImageView.setImage(new Image("/images/dish1.png"));
        dish2ImageView.setImage(new Image("/images/dish2.png"));
        dish3ImageView.setImage(new Image("/images/dish3.png"));
        dish4ImageView.setImage(new Image("/images/dish4.png"));
        dish5ImageView.setImage(new Image("/images/dish5.png"));
    }
}
