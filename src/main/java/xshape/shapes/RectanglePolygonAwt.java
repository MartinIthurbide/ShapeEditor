package xshape.shapes;

import java.util.ArrayList;
import java.util.Arrays;

import xshape.utils.MyColor;

public class RectanglePolygonAwt extends PolygonAwt {

    public RectanglePolygonAwt(double x, double y, double height, double width, MyColor color) {
        super(color);
        super.setXpoints(
                new ArrayList<>(Arrays.asList(x, x + width, x + width, x)));
        this.setYpoints(
                new ArrayList<>(Arrays.asList(y, y, y + height, y + height)));
        this.setNbPoints(4);
    }
}
