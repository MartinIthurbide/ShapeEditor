package xshape;

import java.awt.geom.Point2D;
import java.awt.*;

public class RectangleAwt extends Rectangle {

	public RectangleAwt(double posX, double posY, double height, double width) {
		super.setPosition(new Point2D.Double(posX, posY));
		super.setSize(new Point2D.Double(width, height));
	}

	@Override
	public void draw() {
		Graphics g = AwtContext.instance().graphics();
		Color c = g.getColor();
		Point2D pos = getPosition();
		Point2D size = getSize();
		g.setColor(Color.BLUE);
		g.fillRect((int) (pos.getX() - size.getX() / 2),
				(int) (pos.getY() - size.getY() / 2),
				(int) (size.getX()),
				(int) (size.getY()));
		g.setColor(c);
	}

}
