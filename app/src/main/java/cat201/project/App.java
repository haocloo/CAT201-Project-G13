package cat201.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Login.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Restaurant Management System");

        Image icon = new Image(getClass().getClassLoader().getResourceAsStream("images/companyLogo.jpeg"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
