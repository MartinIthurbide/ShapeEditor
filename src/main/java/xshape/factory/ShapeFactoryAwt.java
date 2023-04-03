package xshape.factory;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import xshape.shapes.*;
import xshape.utils.MyColor;

public class ShapeFactoryAwt implements ShapeFactory {
    public ShapeFactoryAwt() {
    }

    @Override
    public Rectangle createRectangle(double posX, double posY,
            double height, double width) {
        return new RectangleAwt(posX, posY, height, width);
    }

    @Override
    public Polygon createPolygon(MyColor color) {
        return new PolygonAwt(color);
    }

    @Override
    public Polygon createPolygon(ArrayList<Point2D> listPoint, int nbPoints, MyColor color) {
        return new PolygonAwt(listPoint, nbPoints, color);
    }

    @Override
    public Polygon createRectangleBis(double posX, double posY, double height, double width, MyColor color) {
        return new RectanglePolygonAwt(posX, posY, height, width, color);
    }
}
