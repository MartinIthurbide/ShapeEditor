package xshape.gui;

import java.awt.geom.Point2D;

import xshape.factory.*;
import xshape.shapes.*;

public abstract class XShape {
    private ShapeFactory _factory = null;
    Shape[] _shapes = null;

    // method factory to delegate instanciation of Shapefactory to subclass
    protected abstract ShapeFactory createFactory();

    // Handler to start the GUI
    public abstract void run();

    private void createScene() {
        Shape shape = _factory.createRectangle(100, 100, 50, 50);
        Shape shape2 = _factory.createRectangle(250, 250, 75, 20);
        Shape polygon = _factory.creatPolygon();
        shape.translate(new Point2D.Double(100, 50));
        ShapeGroup gr1 = new ShapeGroup();
        gr1.add(shape);
        gr1.add(shape2);
        gr1.add(polygon);
        Shape[] tmp = { gr1 };
        _shapes = tmp;
        //System.out.println("Position : " + gr1.getPosition());
        //System.out.println("Size : " + gr1.getSize());
    }

    public void draw() {
        if (_shapes == null) {
            _factory = createFactory();
            createScene();
        }

        for (Shape s : _shapes)
            s.draw();
    }

}
