package za.nmu.keyboardprototype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KeyboardApplication extends Application
{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(KeyboardApplication.class.getResource("keyboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Keyboard");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}