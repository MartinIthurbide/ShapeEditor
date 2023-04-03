package xshape.factory;


import xshape.shapes.*;

public interface ShapeFactory {
    Rectangle createRectangle(double posX, double posY, double height, double width);

    Polygon creatPolygon(); //TODO
}
