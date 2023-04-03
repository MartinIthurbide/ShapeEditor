package xshape.factory;


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
    public Polygon creatPolygon() {
        return new PolygonAwt();
    }
}
