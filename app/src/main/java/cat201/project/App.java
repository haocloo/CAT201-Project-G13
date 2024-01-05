package cat201.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Main.fxml"));
        Scene scene = new Scene(root, Color.DARKBLUE);
        // scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        String css = this.getClass().getResource("/styles.css").toExternalForm();
        scene.getStylesheets().add(css);
        // scene2.getStylesheets().add(css);

        Image icon = new Image("images/companyLogo.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Restaurant Management System");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
