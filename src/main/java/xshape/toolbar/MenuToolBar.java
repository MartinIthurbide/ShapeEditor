package xshape.toolbar;

import javafx.scene.control.ToolBar;

import javax.swing.JToolBar;

public abstract class MenuToolBar implements ToolBarBuilder {
    protected ToolBar fxMenuToolBar;
    protected JToolBar awtMenuToolBar;
    @Override
    public JToolBar getAwtToolBar() {
        return awtMenuToolBar;
    }
    @Override
    public ToolBar getJavaFXToolBar() {
        return fxMenuToolBar;
    }

    
}
