package xshape.factory;

import javafx.scene.Group;
import xshape.shapes.Rectangle;
import xshape.shapes.RectangleFx;

public class ShapeFactoryFx implements ShapeFactory {
    Group grp;

    public ShapeFactoryFx(Group root) {
        grp = root;
    }

    @Override
    public Rectangle createRectangle(double posX, double posY,
            double height, double width) {
        return new RectangleFx(posX, posY, height, width, grp);
    }
}
