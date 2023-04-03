package xshape.toolbar;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Rectangle;

import xshape.shapes.RectangleAwt;

public class ShapeTbAWT extends ShapeToolBar{

    @Override
    public void buildToolBar() {
        super.awtShapeToolBar = new Panel();

        super.awtShapeToolBar.setLayout(new FlowLayout(FlowLayout.LEFT));

        //super.awtShapeToolBar.add(new Rectangle());
    }

    @Override
    public double getLayoutX_ToolBarFX() {
        return super.awtShapeToolBar.getLocation().getX();
    }
    
}
