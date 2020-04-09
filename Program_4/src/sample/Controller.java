package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.fxml.FXMLLoader;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.awt.*;
import javafx.scene.control.ListView;

public class Controller {


@FXML
public ComboBox<String> Type_Of_Style;

@FXML
public ComboBox<String> Type_Of_Size;

public ImageView Image_Pic;
public Image Deluxe = new Image("file:Deluxe.jpeg");
public Image Hawaiian = new Image("file:Hawaiian.jpg");
public Image Build_Your_Own = new Image("file:Build_Your_Own.jpg");

public Button Add_Toppings;
public Button Remove_Toppings;

public ListView<String> Toppings;
public ListView<String> Selected_Toppings;

public ObservableList<String> Style_list = FXCollections.observableArrayList("Deluxe", "Hawaiian", "Build your own");
public ObservableList<String> Size_list = FXCollections.observableArrayList("small", "medium", "large");

@FXML
public void initialize(){
    Type_Of_Style.setItems(Style_list);
    Type_Of_Size.setItems(Size_list);
}

@FXML
public void ChangeCombo(ActionEvent event){
    if(Type_Of_Style.getValue().equals("Deluxe")){
        Image_Pic.setImage(Deluxe);
        Add_Toppings.setDisable(true);
        Remove_Toppings.setDisable(true);
    }else if(Type_Of_Style.getValue().equals("Hawaiian")){
        Image_Pic.setImage(Hawaiian);
        Add_Toppings.setDisable(true);
        Remove_Toppings.setDisable(true);
    }else{
        Image_Pic.setImage(Build_Your_Own);
        Add_Toppings.setDisable(false);
        Remove_Toppings.setDisable(false);
    }
}





}
