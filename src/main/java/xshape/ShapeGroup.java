package xshape;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;

public class ShapeGroup implements Shape, Iterable {

    private ArrayList<Shape> _subShapes;

    public ShapeGroup() {
        _subShapes = new ArrayList<Shape>();
    }

    public boolean add(Shape s) {
        return _subShapes.add(s);
    }

    public boolean remove(Shape s) {
        return _subShapes.remove(s);
    }

    public Iterator<Shape> subShapes() {
        return iterator();
    }

    @Override
    public void draw() {
        Iterator<Shape> it = subShapes();
        while (it.hasNext()) {
            it.next().draw();
        }
    }

    @Override
    public Shape translate(Point2D vec) {
        while (subShapes().hasNext()) {
            subShapes().next().translate(vec);
        }
        return this;
    }

    @Override
    public Point2D getSize() {
        Iterator<Shape> it = subShapes();
        int width = 0, height = 0;
        while (it.hasNext()) {
            Point2D size = it.next().getSize();
            width += size.getX();
            height += size.getY();
        }
        return new Point2D.Double(height, width);
    }

    @Override
    public Shape setSize(Point2D vec) {
        Iterator<Shape> it = subShapes();
        while (it.hasNext()) {
            it.next().setSize(vec);
        }
        return this;
    }

    @Override
    public Point2D getPosition() {
        Iterator<Shape> it = subShapes();
        double x = Integer.MAX_VALUE, y = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point2D pos = it.next().getPosition();
            x = Math.min(x, pos.getX());
            y = Math.min(y, pos.getY());
        }
        return new Point2D.Double(x, y);
    }

    @Override
    public Shape setPosition(Point2D position) {
        Iterator<Shape> it = subShapes();
        while (it.hasNext()) {
            it.next().setPosition(position);
        }
        return this;
    }

    @Override
    public Iterator<Shape> iterator() {
        return _subShapes.iterator();
    }

}