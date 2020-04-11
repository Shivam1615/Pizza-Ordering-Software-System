package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import java.io.IOException;
import javafx.stage.Stage;

public class Controller2 {

    @FXML
    public TextArea Output_2;

    public Button Clear;
    public Button Back;

    public void receiveOrder(String message){
        Output_2.appendText(message);
    }

    public void handleClear(ActionEvent event){
        if(event.getSource().equals(Clear)){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Parent root = loader.load();
                Controller scene3 = loader.getController();
                scene3.myOrder.clear();
                Output_2.clear();
            }catch(IOException ex){
                System.err.println(ex);
            }
        }
    }

    public void handleClose(ActionEvent event){
        if(event.getSource().equals(Back)){
            Stage stage = (Stage) Back.getScene().getWindow();
            stage.close();
        }
    }

}
