package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

/**
 * This class is the second Controller that takes care of the outputting the values of the order the customer by
 * transferring data from Controller 1 to Controller 2.
 *
 * @author Shivam Patel
 * @author Kevin Shah
 */
public class Controller2 {

    @FXML
    public TextArea Output_2;

    public Button Clear;
    public Button Back;

    /**
     * This method retrieves the value of the order from controller 1 that holds the arraylist.
     *
     * @return return variable that retrieves the order from the arraylist from Controller 1.
     */
    public String getText() {
        return Output_2.getText();
    }

    /**
     * This method outputs the text of the received order from the arraylist in Controller 1.
     *
     * @param message This variable is retrieved from Controller 1 and then is outputed to the textarea of the 2nd Controller.
     */
    public void showText(String message){
        Output_2.appendText(message);
    }

    /**
     * This method clears the output of the second Controller and sets textarea to null value.
     *
     * @param event is the variable that takes care of clearing the textarea and setting text to empty value.
     */
    public void handleClear(ActionEvent event){
        Output_2.clear();
        Output_2.setText(null);
    }

    /**
     * This method closes the window of the second Controller once the button back is clicked.
     *
     */
    public void handleClose(){
        Back.getScene().getWindow().hide();
    }

}
