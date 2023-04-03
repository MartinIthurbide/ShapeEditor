package xshape.toolbar;

import javafx.geometry.Orientation;
import javafx.scene.control.ToolBar;
import javafx.scene.shape.Rectangle;

public class ShapeTbFX extends ShapeToolBar {

    @Override
    public void buildToolBar() {
        super.fxShapeToolBar = new ToolBar();

        super.fxShapeToolBar.getItems().add(new Rectangle(50,50));

        super.fxShapeToolBar.setOrientation(Orientation.VERTICAL);

        super.fxShapeToolBar.setPrefHeight(600);
    }

    @Override
    public double getLayoutX_ToolBarFX() {
        return super.fxShapeToolBar.getLayoutX();
    }
    
}
