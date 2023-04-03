package xshape.factory;


import java.awt.geom.Point2D;
import java.util.ArrayList;

import xshape.shapes.*;


public class ShapeFactoryAwt implements ShapeFactory {
    public ShapeFactoryAwt() {
    }

    @Override
    public Rectangle createRectangle(double posX, double posY,
            double height, double width) {
        return new RectangleAwt(posX, posY, height, width);
    }

    @Override
    public Polygon createPolygon() {
        return new PolygonAwt();
    }

    @Override
    public Polygon createPolygon(ArrayList<Point2D> listPoint, int nbPoints) {
        return new PolygonAwt(listPoint, nbPoints);
    }
}
