package xshape.toolbar;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

public class MenuFX extends MenuToolBar {

    @Override
    public void buildToolBar() {
        super.fxMenuToolBar = new ToolBar();

        super.fxMenuToolBar.getItems().add(new Button("test1"));
        super.fxMenuToolBar.getItems().add(new Button("test2"));
        super.fxMenuToolBar.getItems().add(new Button("test3"));

        super.fxMenuToolBar.setLayoutX(60);

        super.fxMenuToolBar.setOrientation(Orientation.HORIZONTAL);
    }

    @Override
    public double getLayoutX_ToolBarFX() {
        return super.getJavaFXToolBar().getLayoutX();
    }
    
}
