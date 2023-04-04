package xshape.toolbar;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;


public class ShapeTbAWT extends ShapeToolBar{

    @Override
    public void buildToolBar() {

        super.awtShapeToolBar = new JToolBar();

        JPanel rectangle = new JPanel();

        rectangle.add(new ShapeComponent());
        
        super.awtShapeToolBar.add(rectangle);

        super.awtShapeToolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
    }

    @Override
    public double getLayoutX_ToolBarFX() {
        return super.awtShapeToolBar.getLocation().getX();
    }
    
}
