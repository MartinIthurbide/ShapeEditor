package xshape.toolbar;

import javax.swing.JToolBar;

import javafx.scene.control.ToolBar;

public abstract class ShapeToolBar implements ToolBarBuilder {
    protected ToolBar fxShapeToolBar;
    protected JToolBar awtShapeToolBar;

    @Override
    public JToolBar getAwtToolBar() {
        return awtShapeToolBar;
    }

    @Override
    public ToolBar getJavaFXToolBar() {
        return fxShapeToolBar;
    }

    
}
