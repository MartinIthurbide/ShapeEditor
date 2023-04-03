package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class PolygonFx extends Polygon{

    javafx.scene.shape.Polygon _adapted = new javafx.scene.shape.Polygon();
	Group _grp = null;

    public PolygonFx(Group grp){
        _grp = grp;
		_grp.getChildren().add(_adapted);
	}

    public PolygonFx(ArrayList<Point2D> points, int nbPoints, Group grp){
        super.setNbPoints(nbPoints);
        for (int i = 0; i < nbPoints; i++) {
            setPosition(points.get(i), i);
        }
        _grp = grp;
		_grp.getChildren().add(_adapted);
    }

    @Override
    public void draw() {
        ArrayList<Double> tabPoints=new ArrayList<>();
        for (int i = 0; i < this.getNbPoints(); i++) {
            tabPoints.add(this.getXpoints().get(i));
            tabPoints.add(this.getYpoints().get(i));
        }
        _adapted.getPoints().addAll(tabPoints);
        _adapted.setFill(Color.GREEN);
    }

  
    
}
