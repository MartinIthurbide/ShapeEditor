package xshape.toolbar;

import javax.swing.JToolBar;

import javafx.scene.control.ToolBar;

public interface ToolBarBuilder {
    public void buildToolBar();

    public JToolBar getAwtToolBar();

    public ToolBar getJavaFXToolBar();

    public double getLayoutX_ToolBarFX();
}
