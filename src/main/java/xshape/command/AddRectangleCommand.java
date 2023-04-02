package xshape.command;

import xshape.shapes.Rectangle;
import xshape.shapes.RectangleFx;

public class AddRectangleCommand extends FxCommands {
    private RectangleFx _rect;
    java.awt.geom.Point2D _pos, _size;

    public AddRectangleCommand(java.awt.geom.Point2D pos, java.awt.geom.Point2D size) {
        _pos = pos;
        _size = size;
    }

    @Override
    public void apply() {
        Rectangle r = _factory.createRectangle(_pos.getX(), _pos.getY(), _size.getX(), _size.getY());
        _rect = (RectangleFx) r;
        r.draw();
    }

    @Override
    public void undo() {
        // Need to get the _adaptated in order to remove it from the group
    }

}
