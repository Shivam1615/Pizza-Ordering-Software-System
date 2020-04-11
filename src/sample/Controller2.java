package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class Controller2 {

    @FXML
    public TextArea Output_2;

    public Button Clear;
    public Button Back;

    public String getText() {
        return Output_2.getText();
    }

    public void showText(String message){
        Output_2.appendText(message);
    }

    public void handleClear(ActionEvent event){
        Output_2.clear();
        Output_2.setText(null);
    }

    public void handleClose(){
        Back.getScene().getWindow().hide();
    }

}
