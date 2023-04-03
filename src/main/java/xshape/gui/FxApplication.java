package xshape.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xshape.toolbar.MenuFX;
import xshape.toolbar.ShapeTbFX;
import xshape.toolbar.ToolBarBuilder;

public class FxApplication extends Application {
    public static Group _root = new Group();

    @Override
    public void start(Stage primaryStage) throws Exception {

        // initialize the shape's toolbar
        ToolBarBuilder shapeToolBar = new ShapeTbFX();
        shapeToolBar.buildToolBar();

        // initialize the button's toolbar
        ToolBarBuilder menuToolBar = new MenuFX();
        menuToolBar.buildToolBar();

        
        primaryStage.setTitle("XShape JavaFx Rendering");

        // set the toolbars
        _root.getChildren().add(shapeToolBar.getJavaFXToolBar());
        _root.getChildren().add(menuToolBar.getJavaFXToolBar());

        Scene _scene = new Scene(_root, 500, 500);
        _scene.setFill(javafx.scene.paint.Color.WHITE);
        primaryStage.setScene(_scene);
        primaryStage.show();
    }
}