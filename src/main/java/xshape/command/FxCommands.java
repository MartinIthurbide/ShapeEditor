package xshape.command;

import javafx.scene.Group;
import xshape.factory.ShapeFactoryFx;
import xshape.gui.FxApplication;

public abstract class FxCommands implements Command {
    protected Group _group = FxApplication._root;
    protected ShapeFactoryFx _factory = new ShapeFactoryFx(_group);

}
