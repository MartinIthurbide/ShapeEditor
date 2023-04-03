package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;


public abstract class Polygon implements Shape{
    private ArrayList<Double> _xpoints = new ArrayList<Double>(Arrays.asList(25.0,25.0,100.0,100.0));
    private ArrayList<Double> _ypoints = new ArrayList<Double>(Arrays.asList(25.0,250.0,250.0,25.0));
    private int _nbPoints = 4;


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
        return new Point2D.Double(_xpoints.get(0),_ypoints.get(0));
    }

    public ArrayList<Double> getXpoints(){
        return _xpoints;
    }

    public ArrayList<Double> getYpoints(){
        return _ypoints;
    }

    @Override
    @Deprecated
    public Shape setPosition(Point2D position) {
        _xpoints.set(0, position.getX());
        _ypoints.set(0, position.getY());
        return this;
    }

    public Shape setPosition(Point2D position, int point) {
        _xpoints.set(point, position.getX());
        _ypoints.set(point, position.getY());
        return this;
    }

    @Override
    public Shape translate(Point2D vec) {
        for (int i = 0; i < _nbPoints; i++) {
            Point2D point = new Point2D.Double(_xpoints.get(i)+vec.getX(),_ypoints.get(i)+vec.getY());
            setPosition( point, i);
        }
        return this;
    }

    public int getNbPoints(){
        return _nbPoints;
    }

    public void setNbPoints(int nbPoints){
        this._nbPoints=nbPoints;
    }
}
