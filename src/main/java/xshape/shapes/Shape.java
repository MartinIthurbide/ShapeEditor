package xshape.shapes;

import java.awt.geom.Point2D;

public interface Shape {
	void draw();

	Point2D getSize();

	Shape setSize(Point2D vec);

	Point2D getPosition();

	Shape setPosition(Point2D position);

	Shape translate(Point2D vec);
}
