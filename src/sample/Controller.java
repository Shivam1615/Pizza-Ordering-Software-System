package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public ArrayList<Pizza> myOrder = new ArrayList<>();
    Stage stage = new Stage();

    @FXML
    public ComboBox<String> Type_Of_Style;

    @FXML
    public ComboBox<String> Type_Of_Size;

    public TextArea Output;

    public ImageView Image_Pic;
    public Image Deluxe = new Image("file:Deluxe.jpeg");
    public Image Hawaiian = new Image("file:Hawaiian.jpg");
    public Image Build_Your_Own = new Image("file:Build_Your_Own.jpg");

    public Button Add_Toppings;
    public Button Remove_Toppings;
    public Button Add_To_Order;
    public Button Show_Order;
    public Button Clear;

    public ListView<String> Toppings;
    public ListView<String> Selected_Toppings;

    public ObservableList<String> Style_list =
            FXCollections.observableArrayList("Deluxe", "Hawaiian", "Build your own");
    public ObservableList<String> Deluxe_Toppings =
            FXCollections.observableArrayList("Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom");
    public ObservableList<String> Size_list = FXCollections.observableArrayList("small", "medium", "large");
    public ObservableList<String> Hawaiian_Toppings = FXCollections.observableArrayList("Ham", "Pineapple");

    public ObservableList<String> All_Toppings;
    public ObservableList<String> Selected_Toppings_List;

    @FXML
    public void initialize() {
        All_Toppings = FXCollections.observableArrayList("Beef", "Cheese", "Chicken",
                "Green Pepper", "Ham", "Mushroom", "Onion", "Pepperoni", "Pineapple", "Sausage");
        Selected_Toppings_List = FXCollections.observableArrayList();
        Type_Of_Style.getSelectionModel().select("Build your own");
        Type_Of_Size.getSelectionModel().select("medium");
        Image_Pic.setImage(Build_Your_Own);
        Selected_Toppings.setItems(Selected_Toppings_List);
        Type_Of_Style.setItems(Style_list);
        Type_Of_Size.setItems(Size_list);
        Toppings.setItems(All_Toppings);
        Output.clear();
    }

    @FXML
    public void ChangeCombo() {
        if (Type_Of_Style.getValue().equals("Deluxe")) {
            Image_Pic.setImage(Deluxe);
            Add_Toppings.setDisable(true);
            Remove_Toppings.setDisable(true);
            Toppings.setItems(null);
            Selected_Toppings.setItems(Deluxe_Toppings);
        } else if (Type_Of_Style.getValue().equals("Hawaiian")) {
            Image_Pic.setImage(Hawaiian);
            Add_Toppings.setDisable(true);
            Remove_Toppings.setDisable(true);
            Toppings.setItems(null);
            Selected_Toppings.setItems(Hawaiian_Toppings);
        } else {
            initialize();
            Add_Toppings.setDisable(false);
            Remove_Toppings.setDisable(false);
        }
    }

    public void removeTopping() {
        String selectedTopping = Selected_Toppings.getSelectionModel().getSelectedItem();
        if (selectedTopping != null) {
            All_Toppings.add(selectedTopping);
            Selected_Toppings_List.remove(selectedTopping);
            Selected_Toppings.setItems(Selected_Toppings_List);
            Toppings.setItems(All_Toppings);
        }
    }

    public void addToOrder() {
        if (Type_Of_Style.getValue().equals("Build your own") && Selected_Toppings_List.isEmpty()) {
            Output.appendText("Error: You must have at least 1 topping.\n");
            return;
        }
        Pizza myPizza;
        if (Type_Of_Style.getValue().equals("Deluxe")) {
            myPizza = new Deluxe("Deluxe", Type_Of_Size.getValue());
        } else if (Type_Of_Style.getValue().equals("Hawaiian")) {
            myPizza = new Hawaiian("Hawaiian", Type_Of_Size.getValue());
        } else {
            myPizza = new BuildYourOwn("Build Your Own", Type_Of_Size.getValue(), new ArrayList<>(Selected_Toppings_List));
        }
        myOrder.add(myPizza);
        initialize();
        Output.appendText("Pizza added to order!\n");
        //initialize();
    }

    public void addTopping() {
        if (Selected_Toppings_List.size() == 6) {
            Output.appendText("Error: You are not allowed to add more than 6 toppings.\n");
            return;
        }
        String selectedTopping = Toppings.getSelectionModel().getSelectedItem();
        if (selectedTopping != null) {
            Selected_Toppings_List.add(selectedTopping);
            All_Toppings.remove(selectedTopping);
            Selected_Toppings.setItems(Selected_Toppings_List);
            Toppings.setItems(All_Toppings);
        }
    }

    public void showOrder() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            Parent root = loader.load();
            Controller2 orderScene = loader.getController();
            stage.setScene(new Scene(root));
            stage.setTitle("Show Order");
            stage.setOnHidden(windowEvent -> {
                if (orderScene.getText() == null) {
                    myOrder.clear();
                }
            });
            stage.show();

            int total = 0;
            for (int i = 0; i < myOrder.size(); i++) {
                orderScene.showText(myOrder.get(i).toString() + "\n");
                total += myOrder.get(i).pizzaPrice();
            }
            if (total == 0) {
                orderScene.showText("Order is empty.");
            } else orderScene.showText("Total Price: $" + total);

        } catch(IOException ex){
            System.err.println(ex);
        }
        Output.clear();
    }

}
