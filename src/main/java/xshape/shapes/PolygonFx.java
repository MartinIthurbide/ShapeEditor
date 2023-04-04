package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import javafx.scene.Group;
import xshape.utils.MyColor;

public class PolygonFx extends Polygon {

    javafx.scene.shape.Polygon _adapted = new javafx.scene.shape.Polygon();
    Group _grp = null;

    public PolygonFx(Group grp, MyColor color) {
        _grp = grp;
        _grp.getChildren().add(_adapted);
        setColor(color);
    }

    public PolygonFx(ArrayList<Point2D> points, int nbPoints, Group grp, MyColor color) {
        super(points, nbPoints, color);
        _grp = grp;
        _grp.getChildren().add(_adapted);
    }

    @Override
    public void draw() {
        ArrayList<Double> tabPoints = new ArrayList<>();
        for (int i = 0; i < this.getNbPoints(); i++) {
            tabPoints.add(this.getXpoints().get(i));
            tabPoints.add(this.getYpoints().get(i));
        }
        _adapted.getPoints().addAll(tabPoints);
        _adapted.setFill(getColor().toFx());
    }

}
