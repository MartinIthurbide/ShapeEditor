package xshape.factory;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import javafx.scene.Group;
import xshape.shapes.*;
import xshape.utils.MyColor;

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

    @Override
    public Polygon createPolygon(MyColor color) {
        return new PolygonFx(grp, color);
    }

    @Override
    public Polygon createPolygon(ArrayList<Point2D> listPoint, int nbPoints, MyColor color) {
        return new PolygonFx(listPoint, nbPoints, grp, color);
    }

    @Override
    public Polygon createRectangleBis(double posX, double posY, double height, double width, MyColor color) {
        return new RectanglePolygonFx(posX, posY, height, width, grp, color);
    }
}
