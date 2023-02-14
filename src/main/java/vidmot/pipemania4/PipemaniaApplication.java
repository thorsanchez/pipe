package vidmot.pipemania4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PipemaniaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PipemaniaApplication.class.getResource("pipemania-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // tengja .css skrá við scene
        //scene.getStylesheets().add(getClass().getResource("pipemania-styles.css").toExternalForm());

        //String css = this.getClass().getResource("pipemania-styles.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.setTitle("Hello!");
        //full screen skjár
        //stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
