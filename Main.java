package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static VBox root;
    static List<GridPane> gridPaneList = new ArrayList<GridPane> ();
    private static int index_current = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {     

        root = FXMLLoader.load(getClass().getResource("Multiscene.fxml"));
        gridPaneList.add(FXMLLoader.load(getClass().getResource("patients.fxml")));

        primaryStage.setTitle("CoronaNet");
        Scene scene = new Scene(root, 1200, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

    public static void setGridPane (int index) {
        root.getChildren().remove(gridPaneList.get(index_current));
        root.getChildren().add(gridPaneList.get(index));
        index_current=index;

    };

}

