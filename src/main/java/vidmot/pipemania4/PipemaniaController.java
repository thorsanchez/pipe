package vidmot.pipemania4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import vinnsla.pipemania;

public class PipemaniaController {
    @FXML
    private Button brjota;

    private pipemania mania;

    public void fxAthFlaedir(ActionEvent aa) {
        String no;
        no = (((Button) aa.getSource()).getText());
        System.out.print(no);
    }

    public void initialize() {
        mania = new pipemania();
    }
}
