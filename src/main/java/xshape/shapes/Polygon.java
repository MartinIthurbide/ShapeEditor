package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

import xshape.utils.MyColor;

public abstract class Polygon implements Shape {
    /*
     * Attributes
     */
    private ArrayList<Double> _xpoints;
    private ArrayList<Double> _ypoints;
    private int _nbPoints;
    private MyColor _color;

    /*
     * Constructors
     */
    public Polygon() {
        _xpoints = new ArrayList<Double>(Arrays.asList(25.0, 25.0, 100.0, 100.0));
        _ypoints = new ArrayList<Double>(Arrays.asList(25.0, 250.0, 250.0, 25.0));
        _nbPoints = 4;
        _color = new MyColor(0, 0, 255);
    }

    public Polygon(ArrayList<Point2D> points, int nbPoints, MyColor color) {
        setNbPoints(nbPoints);
        for (int i = 0; i < nbPoints; i++) {
            setPosition(points.get(i), i);
        }
        _color = color;
    }

    /*
     * Methods
     */
    @Override
    public Shape translate(Point2D vec) {
        for (int i = 0; i < _nbPoints; i++) {
            Point2D point = new Point2D.Double(_xpoints.get(i) + vec.getX(), _ypoints.get(i) + vec.getY());
            setPosition(point, i);
        }
        return this;
    }

    public void rotate(double angle) {
        double x, y, dx, dy;
        Point2D origin = getCentroid();
        double oX = origin.getX();
        double oY = origin.getY();
        angle *= Math.PI / 180;
        for (int i = 0; i < _nbPoints; i++) {
            dx = getXpoints().get(i) - oX;
            dy = getYpoints().get(i) - oY;
            x = dx * Math.cos(angle) + dy * Math.sin(angle) + oX;
            y = -dx * Math.sin(angle) + dy * Math.cos(angle) + oY;
            setPosition(new Point2D.Double(x, y), i);
        }
    }

    /*
     * Getters and Setters
     */
    @Override
    public Point2D getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    @Override
    public Shape setSize(Point2D vec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSize'");
    }

    @Override
    public Point2D getPosition() {
        return new Point2D.Double(_xpoints.get(0), _ypoints.get(0));
    }

    public ArrayList<Double> getXpoints() {
        return _xpoints;
    }

    public ArrayList<Double> getYpoints() {
        return _ypoints;
    }

    public void setXpoints(ArrayList<Double> _xpoints) {
        this._xpoints = _xpoints;
    }

    public void setYpoints(ArrayList<Double> _ypoints) {
        this._ypoints = _ypoints;
    }

    @Override
    @Deprecated
    public Shape setPosition(Point2D position) {
        _xpoints.set(0, position.getX());
        _ypoints.set(0, position.getY());
        return this;
    }

    public Shape setPosition(Point2D position, int index) {
        _xpoints.set(index, position.getX());
        _ypoints.set(index, position.getY());
        return this;
    }

    public int getNbPoints() {
        return _nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this._nbPoints = nbPoints;
    }

    public Point2D getCentroid() {
        double gx = 0;
        double gy = 0;
        for (int i = 0; i < _nbPoints; i++) {
            gx += getXpoints().get(i);
            gy += getYpoints().get(i);
        }
        gx = gx / _nbPoints;
        gy = gy / _nbPoints;
        return new Point2D.Double(gx, gy);
    }

    public MyColor getColor() {
        return _color;
    }

    public void setColor(MyColor _color) {
        this._color = _color;
    }

}
