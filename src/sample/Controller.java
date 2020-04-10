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
public Button Clear_Selection;

public ListView<String> Toppings;
public ListView<String> Selected_Toppings;

public ObservableList<String> Style_list = FXCollections.observableArrayList("Deluxe", "Hawaiian", "Build your own");
public ObservableList<String> Size_list = FXCollections.observableArrayList("small", "medium", "large");
public ObservableList<String> Deluxe_Toppings = FXCollections.observableArrayList("Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom");
public ObservableList<String> Hawaiian_Toppings = FXCollections.observableArrayList("Ham", "Pineapple");

@FXML
public void initialize(){
    Type_Of_Style.setItems(Style_list);
    Type_Of_Size.setItems(Size_list);
    Type_Of_Size.getSelectionModel().select("medium");
    Type_Of_Style.getSelectionModel().select("Build your own");
    Image_Pic.setImage(Build_Your_Own);
}

@FXML
public void ChangeCombo(ActionEvent event){
    if(Type_Of_Style.getValue().equals("Deluxe")){
        Image_Pic.setImage(Deluxe);
        Add_Toppings.setDisable(true);
        Remove_Toppings.setDisable(true);
        Selected_Toppings.getItems().removeAll(Deluxe_Toppings);
        Selected_Toppings.getItems().removeAll(Hawaiian_Toppings);
        Selected_Toppings.getItems().addAll(Deluxe_Toppings);
    }else if(Type_Of_Style.getValue().equals("Hawaiian")){
        Image_Pic.setImage(Hawaiian);
        Add_Toppings.setDisable(true);
        Remove_Toppings.setDisable(true);
        Selected_Toppings.getItems().removeAll(Hawaiian_Toppings);
        Selected_Toppings.getItems().removeAll(Deluxe_Toppings);
        Selected_Toppings.getItems().addAll(Hawaiian_Toppings);
    }else{
        Selected_Toppings.getItems().removeAll(Hawaiian_Toppings);
        Selected_Toppings.getItems().removeAll(Deluxe_Toppings);
        Image_Pic.setImage(Build_Your_Own);
        Add_Toppings.setDisable(false);
        Remove_Toppings.setDisable(false);
    }
}
    
public void handleButtonClick(ActionEvent event){
  if(event.getSource().equals(Clear_Selection)){
        initialize();
  }
}

}
