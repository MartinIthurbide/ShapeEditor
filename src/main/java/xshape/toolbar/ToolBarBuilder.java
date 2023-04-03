package xshape.toolbar;

import java.awt.Panel;

import javafx.scene.control.ToolBar;

public interface ToolBarBuilder {
    public void buildToolBar();

    public Panel getAwtToolBar();

    public ToolBar getJavaFXToolBar();

    public double getLayoutX_ToolBarFX();
}
