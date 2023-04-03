package xshape.shapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.Group;
import xshape.utils.MyColor;

public class RectanglePolygonFx extends PolygonFx {

    public RectanglePolygonFx(double x, double y, double height, double width, Group grp, MyColor color) {
        super(grp, color);
        super.setXpoints(
                new ArrayList<>(Arrays.asList(x, x + width, x + width, x)));
        this.setYpoints(
                new ArrayList<>(Arrays.asList(y, y, y + height, y + height)));
        this.setNbPoints(4);
    }

}
