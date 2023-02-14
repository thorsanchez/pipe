package vidmot.pipemania4;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import vinnsla.Pipa;
import vinnsla.Pipa.Att;
import vinnsla.Pipemania;


public class PipemaniaController {
    @FXML
    private Button hnappur;
    @FXML
    private Label fxStig;

    private Pipemania mania;

    public void fxVeljaReit(ActionEvent event) {
        initialize();
    }

    public void fxAthFlaedir(ActionEvent aa) {

        Att innAtt = Att.valueOf(no.substring(0, 1));
        Att utAtt = Att.valueOf(no.substring(1, 2));

        // Get a reference to the appropriate Button node
        Button button = (Button) aa.getSource();

        // Set the background image of the button based on the pipe type
        if (innAtt == Att.S && utAtt == Att.A) {
            button.setStyle("-fx-background-image: url('SA.jpg')");
        } else if (innAtt == Att.N && utAtt == Att.V) {
            button.setStyle("-fx-background-image: url('NV.jpg')");
        } else if (innAtt == Att.V && utAtt == Att.S) {
            button.setStyle("-fx-background-image: url('VS.jpg')");
        } else if (innAtt == Att.V && utAtt == Att.A) {
            button.setStyle("-fx-background-image: url('VA.jpg')");
        } else if (innAtt == Att.N && utAtt == Att.A) {
            button.setStyle("-fx-background-image: url('NA.jpg')");
        } else if (innAtt == Att.N && utAtt == Att.S) {
            button.setStyle("-fx-background-image: url('NS.jpg')");
        }
    }

    public void initialize() {
        fxStig.textProperty().bind(mania.getStig().asString());
        //bregðst við breytingu á stigi
        ObservableList<Pipa> q = Pipemania.getPipukista();
        q.addListener((ListChangeListener<Pipa>) change -> {
            if (change.next() && change.wasAdded()) {


            }
        }
    }

    public Label getFxStig() {
        return fxStig;
    }

    public void setFxStig(Label fxStig) {
        this.fxStig = fxStig;
    }


}


