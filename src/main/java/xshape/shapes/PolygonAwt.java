package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import xshape.gui.AwtContext;

import java.awt.*;

public class PolygonAwt extends Polygon {

    public PolygonAwt(){
	}

    public PolygonAwt(ArrayList<Point2D> points, int nbPoints){
        super.setNbPoints(nbPoints);
        for (int i = 0; i < nbPoints; i++) {
            setPosition(points.get(i), i);
        }
    }


    @Override
    public void draw() {
		Graphics g = AwtContext.instance().graphics();
        int [] tabX = new int[5];
        int [] tabY = new int[5];
        for (int i = 0; i < this.getNbPoints(); i++) {
            tabX[i]= this.getXpoints().get(i).intValue();
            tabY[i]= this.getYpoints().get(i).intValue();
        }
        g.setColor(Color.GREEN);
        g.fillPolygon(tabX ,tabY  ,this.getNbPoints());
    }

    
    
}
