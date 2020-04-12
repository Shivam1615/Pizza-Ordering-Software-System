package Program_4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is the main class and it takes care of the first window of the first Controller class by setting up stage.
 *
 * @author Shivam Patel
 * @author Kevin Shah
 */
public class Main extends Application {
    /**
     * This method starts the window of the first stage that is controlled by the first Controller.
     *
     * @param primaryStage Is the variable that is the primary stage of the first window.
     * @throws Exception Is a variable that throws an exception.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My Pizza Store");
        primaryStage.setScene(new Scene(root, 712, 684));
        primaryStage.show();
    }

    /**
     * This method launches the first stage of the Pizza software system controlled by first Controller.
     *
     * @param args Is a variable that is an argument for launching the window.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
