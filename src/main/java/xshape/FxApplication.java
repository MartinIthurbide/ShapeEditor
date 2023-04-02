package xshape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxApplication extends Application {
    public static Group _root = new Group();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("XShape JavaFx Rendering");
        Scene _scene = new Scene(_root, 500, 500);
        _scene.setFill(javafx.scene.paint.Color.RED);
        primaryStage.setScene(_scene);
        primaryStage.show();
    }
}