package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import xshape.gui.AwtContext;
import xshape.utils.MyColor;

import java.awt.*;

public class PolygonAwt extends Polygon {

    public PolygonAwt() {
    }

    public PolygonAwt(ArrayList<Point2D> points, int nbPoints, MyColor color) {
        super(points, nbPoints, color);
    }

    @Override
    public void draw() {
        Graphics g = AwtContext.instance().graphics();
        int[] tabX = new int[5];
        int[] tabY = new int[5];
        for (int i = 0; i < this.getNbPoints(); i++) {
            tabX[i] = this.getXpoints().get(i).intValue();
            tabY[i] = this.getYpoints().get(i).intValue();
        }
        g.setColor(getColor().toAwt());
        g.fillPolygon(tabX, tabY, this.getNbPoints());
        // drawCenter(g);
        // drawRotate(g, tabX, tabY);
    }

    // afficher le centre de rotation du polygone
    private void drawCenter(Graphics g) {
        g.setColor(Color.RED);
        Point2D centre = this.getCentroid();
        System.out.println(centre);
        g.fillOval((int) centre.getX(), (int) centre.getY(), 3, 3);
    }

    // Change l'orientation puis affiche, afin d'afficher la différence
    // Ne marche pas comme attendu
    private void drawRotate(Graphics g, int[] oldX, int[] oldY) {
        super.rotate(60);
        for (int i = 0; i < this.getNbPoints(); i++) {
            oldX[i] = this.getXpoints().get(i).intValue();
            oldY[i] = this.getYpoints().get(i).intValue();
        }
        g.setColor(getColor().toAwt());
        g.fillPolygon(oldX, oldY, this.getNbPoints());
    }

}
