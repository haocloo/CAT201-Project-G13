package cat201.project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MenuController {
    @FXML
    private ListView<String> menuList;

    public void initialize() {
        menuList.getItems().addAll("Item 1", "Item 2", "Item 3");
    }
}
