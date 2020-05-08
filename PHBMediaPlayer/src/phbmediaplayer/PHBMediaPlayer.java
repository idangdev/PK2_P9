package phbmediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Wildan
 */
public class PHBMediaPlayer extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("PHB Media Player");
        scene.setOnMouseClicked((MouseEvent event) -> {
            stage.setFullScreen(true);
        });
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
