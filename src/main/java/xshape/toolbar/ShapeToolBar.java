package xshape.toolbar;

import java.awt.Panel;

import javafx.scene.control.ToolBar;

public abstract class ShapeToolBar implements ToolBarBuilder {
    protected ToolBar fxShapeToolBar;
    protected Panel awtShapeToolBar;

    @Override
    public Panel getAwtToolBar() {
        return awtShapeToolBar;
    }

    @Override
    public ToolBar getJavaFXToolBar() {
        return fxShapeToolBar;
    }

    
}
