package xshape.factory;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import xshape.shapes.*;
import xshape.utils.MyColor;

public interface ShapeFactory {
    Rectangle createRectangle(double posX, double posY, double height, double width);

    Polygon createPolygon(); // TODO

    Polygon createPolygon(ArrayList<Point2D> listPoint, int nbPoints, MyColor color);
}
