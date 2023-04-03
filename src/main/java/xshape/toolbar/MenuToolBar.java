package xshape.toolbar;

import javafx.scene.control.ToolBar;
import java.awt.Panel;

public abstract class MenuToolBar implements ToolBarBuilder {
    protected ToolBar fxMenuToolBar;
    protected Panel awtMenuToolBar;
    @Override
    public Panel getAwtToolBar() {
        return awtMenuToolBar;
    }
    @Override
    public ToolBar getJavaFXToolBar() {
        return fxMenuToolBar;
    }

    
}
